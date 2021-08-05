package fr.aeryacraft.block;

import fr.aeryacraft.init.AeryaBlocks;
import fr.aeryacraft.inventory.ContainerAeryaInfuser;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class BlockAeryaInfuser extends Block {

	protected BlockAeryaInfuser() {

		super(Material.iron);
		setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumFacing side, float hitX, float hitY, float hitZ) {

		if (worldIn.isRemote) {
			return true;
		} else {
			
			playerIn.displayGui(new InterfaceAeryaInfuser(worldIn, pos));
			return true;
		}
	}
}

class InterfaceAeryaInfuser implements IInteractionObject {
	
	private World world;
	private BlockPos blockPosition;
	
	public InterfaceAeryaInfuser(World world, BlockPos blockPosition) {
		
		this.world = world;
		this.blockPosition = blockPosition;
	}
	
	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean hasCustomName() {
		return false;
	}

	@Override
	public IChatComponent getDisplayName() {
		return new ChatComponentTranslation(AeryaBlocks.AERYA_INFUSER.getUnlocalizedName() + ".name", new Object[0]);
	}

	@Override
	public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
		return new ContainerAeryaInfuser(playerInventory, world, blockPosition);
	}

	@Override
	public String getGuiID() {
		return "minecraft:aerya_infuser";
	}
}