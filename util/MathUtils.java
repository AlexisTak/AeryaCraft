package fr.aeryacraft.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class MathUtils {

	public static MovingObjectPosition raytraceFromEntity(final World world, final Entity player, final boolean flag,
			final double range) {
		
		final float f = 1.0f;
		final float f2 = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * f;
		final float f3 = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * f;
		final double d0 = player.prevPosX + (player.posX - player.prevPosX) * f;
		double d2 = player.prevPosY + (player.posY - player.prevPosY) * f;
		
		if (!world.isRemote && player instanceof EntityPlayer) {
			d2++;
		}
		
		
		final double d3 = player.prevPosZ + (player.posZ - player.prevPosZ) * f;
		final Vec3 vec3 = new Vec3(d0, d2, d3);
		final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
		final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
		final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
		final float f7 = MathHelper.sin(-f2 * 0.017453292f);
		final float f8 = f5 * f6;
		final float f9 = f4 * f6;
		final Vec3 vec4 = vec3.addVector(f8 * range, f7 * range, f9 * range);
		
		return world.rayTraceBlocks(vec3, vec4, flag, !flag, flag);
	}
}
