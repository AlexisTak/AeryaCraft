package fr.aeryacraft.client.gui.inventory;

import java.awt.Color;

import fr.aeryacraft.inventory.ContainerAeryaInfuser;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiAeryaInfuser extends GuiContainer {
	
	private static final ResourceLocation BACKGROUND_GUI_TEXTURE = new ResourceLocation("textures/gui/container/aerya_infuser.png");
	
	public GuiAeryaInfuser(InventoryPlayer inventory, World world) {
		this(inventory, world, BlockPos.ORIGIN);
	}

	public GuiAeryaInfuser(InventoryPlayer inventory, World world, BlockPos blockPosition) {
		super(new ContainerAeryaInfuser(inventory, world, blockPosition));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		
		this.fontRendererObj.drawString(I18n.format("container.infuser", new Object[0]), 28, 6, Color.BLACK.getRGB());
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(BACKGROUND_GUI_TEXTURE);
		int scaledX = (this.width - this.xSize) / 2;
        int scaledY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(scaledX, scaledY, 0, 0, this.xSize, this.ySize);
	}
}
