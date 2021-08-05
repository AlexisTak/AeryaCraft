package fr.aeryacraft.item;

import fr.aeryacraft.util.MathUtils;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemHammer extends ItemPickaxe {

	private int breakRadius;
	private int breakDepth;

	public ItemHammer(ToolMaterial material, int breakRadius, int breakDepth) {
		super(material);

		this.breakRadius = breakRadius;
		this.breakDepth = breakDepth - 1;

		setCreativeTab(CreativeTabs.tabTools);
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World world, Block block, BlockPos pos, EntityLivingBase entity) {

		int posX = pos.getX();
		int posY = pos.getY();
		int posZ = pos.getZ();

		if (!(entity instanceof EntityPlayer))
			return super.onBlockDestroyed(stack, world, block, pos, entity);

		final EntityPlayer player = (EntityPlayer) entity;
		final MovingObjectPosition raytrace = MathUtils.raytraceFromEntity(world, player, false, 4.5);
		if (raytrace == null)
			return super.onBlockDestroyed(stack, world, block, pos, player);

		final boolean breaked = super.onBlockDestroyed(stack, world, block, pos, player);
		final EnumFacing faceHit = raytrace.field_178784_b;

		int xRange = this.breakRadius;
		int yRange = this.breakRadius;
		int zRange = this.breakDepth;

		switch (faceHit) {
		case DOWN:
		case UP:
			yRange = this.breakDepth;
			zRange = this.breakRadius;
			break;
		case NORTH:
		case SOUTH:
			xRange = this.breakRadius;
			zRange = this.breakDepth;
			break;
		case WEST:
		case EAST:
			xRange = this.breakDepth;
			zRange = this.breakRadius;
			break;
		}
		for (int xPos = posX - xRange; xPos <= posX + xRange; xPos++)
			for (int yPos = posY - yRange; yPos <= posY + yRange; yPos++)
				for (int zPos = posZ - zRange; zPos <= posZ + zRange; zPos++)
					if (xPos != posX || yPos != posY || zPos != posZ)
						this.breakExtraBlock(world, new BlockPos(xPos, yPos, zPos), player, stack);

		return breaked;
	}

	private void breakExtraBlock(final World world, final BlockPos pos, final EntityPlayer player,
			final ItemStack item) {

		if (!world.isAirBlock(pos)) {

			final Block block = world.getBlock(pos);
			if (!block.equals(Blocks.obsidian) && !block.equals(Blocks.bedrock) && !block.equals(Blocks.lava)
					&& !block.equals(Blocks.flowing_lava) && !block.equals(Blocks.water)
					&& !block.equals(Blocks.flowing_water)) {

				final boolean breaked = player.canHarvestBlock(block);
				if (breaked) {

					final IBlockState state = world.getBlockState(pos);
					block.harvestBlock(world, player, pos, state, null);
					world.setBlockToAir(pos);
					block.onBlockDestroyedByPlayer(world, pos, state);
				}
			}
		}
	}
}
