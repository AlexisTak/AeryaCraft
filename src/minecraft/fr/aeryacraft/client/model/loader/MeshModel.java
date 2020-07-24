package fr.aeryacraft.client.model.loader;

import static org.lwjgl.opengl.GL11.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;

public class MeshModel {

	private int listHandle;
	private boolean loaded = false;

	private List<Vec3> vertices = new ArrayList<Vec3>();
	private List<Vec3> textureCoords = new ArrayList<Vec3>();
	private List<Vec3> normals = new ArrayList<Vec3>();

	private List<Vec3i> face1 = new ArrayList<Vec3i>();
	private List<Vec3i> face2 = new ArrayList<Vec3i>();
	private List<Vec3i> face3 = new ArrayList<Vec3i>();

	public MeshModel(ResourceLocation modelFile) {

		try {

			switch (FilenameUtils.getExtension(modelFile.getResourcePath()).toUpperCase()) {
			case "OBJ":
				loadOBJ(modelFile);
				break;
			default:
				System.err.println("can't load \"" + modelFile.getResourcePath() + "\", invalid extension !");
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadToOGL() {

		if (loaded) {

			System.err.println("unload to OGL first !");
			return;
		}

		listHandle = glGenLists(1);

		glNewList(listHandle, GL_COMPILE);
		glBegin(GL_TRIANGLES);
		for (int i = 0; i < face1.size(); i++) {

			Vec3 vertex1 = vertices.get(face1.get(i).getX() - 1);
			Vec3 vertex2 = vertices.get(face2.get(i).getX() - 1);
			Vec3 vertex3 = vertices.get(face3.get(i).getX() - 1);

			Vec3 texCoord1 = textureCoords.get(face1.get(i).getY() - 1);
			Vec3 texCoord2 = textureCoords.get(face2.get(i).getY() - 1);
			Vec3 texCoord3 = textureCoords.get(face3.get(i).getY() - 1);

			Vec3 normal1 = normals.get(face1.get(i).getZ() - 1);
			Vec3 normal2 = normals.get(face2.get(i).getZ() - 1);
			Vec3 normal3 = normals.get(face3.get(i).getZ() - 1);
			
			glVertex3d(vertex1.xCoord, vertex1.yCoord, vertex1.zCoord);
			glColor3d(vertex1.xCoord, vertex1.yCoord, vertex1.zCoord);
			glTexCoord2d(texCoord1.xCoord, texCoord1.yCoord);
			glNormal3d(normal1.xCoord, normal1.yCoord, normal1.zCoord);

			glVertex3d(vertex2.xCoord, vertex2.yCoord, vertex2.zCoord);
			glColor3d(vertex1.xCoord, vertex1.yCoord, vertex1.zCoord);
			glTexCoord2d(texCoord2.xCoord, texCoord2.yCoord);
			glNormal3d(normal2.xCoord, normal2.yCoord, normal2.zCoord);

			glVertex3d(vertex3.xCoord, vertex3.yCoord, vertex3.zCoord);
			glColor3d(vertex1.xCoord, vertex1.yCoord, vertex1.zCoord);
			glTexCoord2d(texCoord3.xCoord, texCoord3.yCoord);
			glNormal3d(normal3.xCoord, normal3.yCoord, normal3.zCoord);
		}
		glEnd();
		glEndList();

		loaded = true;
	}

	public void render() {
		
		if (!loaded) {

			System.err.println("load to OGL first !");
			return;
		}
		
		
		glCallList(listHandle);
	}
	
	public void unloadFromOGL() {

		if (!loaded) {

			System.err.println("load to OGL first !");
			return;
		}

		glDeleteLists(listHandle, 1);
		loaded = false;
	}
	
	public boolean isLoaded() {
		return loaded;
	}
	
	private void loadOBJ(ResourceLocation modelFile) throws IOException {
		
		List<String> lines = IOUtils.readLines(getClass().getResourceAsStream("/assets/" + modelFile.getResourcePath()));

		for (String line : lines) {
			
			line = line.replaceAll("( )+", " ");
			if (line.startsWith("vt ")) {

				String[] values = line.replace("vt ", "").split(" ");
				textureCoords.add(new Vec3(Float.parseFloat(values[0]), Float.parseFloat(values[1]), 0.0F));
			} else if (line.startsWith("v ")) {

				String[] values = line.replace("v ", "").split(" ");
				vertices.add(new Vec3(Float.parseFloat(values[0]), Float.parseFloat(values[1]),
						Float.parseFloat(values[2])));
			} else if (line.startsWith("vn ")) {

				String[] values = line.replace("vn ", "").split(" ");
				normals.add(new Vec3(Float.parseFloat(values[0]), Float.parseFloat(values[1]),
						Float.parseFloat(values[2])));
			} else if (line.startsWith("f ")) {
				
				String[] faces = line.replace("f ", "").split(" ");
				String[] faceValues1 = faces[0].split("/");
				String[] faceValues2 = faces[1].split("/");
				String[] faceValues3 = faces[2].split("/");

				face1.add(new Vec3i(Integer.parseInt(faceValues1[0]), Integer.parseInt(faceValues1[1]),
						Integer.parseInt(faceValues1[2])));
				face2.add(new Vec3i(Integer.parseInt(faceValues2[0]), Integer.parseInt(faceValues2[1]),
						Integer.parseInt(faceValues2[2])));
				face3.add(new Vec3i(Integer.parseInt(faceValues3[0]), Integer.parseInt(faceValues3[1]),
						Integer.parseInt(faceValues3[2])));
			}
		}
	}
}
