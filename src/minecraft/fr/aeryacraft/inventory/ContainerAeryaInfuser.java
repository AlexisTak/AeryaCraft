package fr.aeryacraft.inventory;

import java.util.ArrayList;
import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import fr.aeryacraft.init.AeryaBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ContainerAeryaInfuser extends Container {

	private InventoryCrafting aeryaInfuserCraft = new InventoryCrafting(this, 2, 1);
	private IInventory aeryaInfuserResult = new InventoryCraftResult();

	private World worldPointer;
	private BlockPos blockPosition;

	public ContainerAeryaInfuser(InventoryPlayer inventoryPlayer, World worldPointer) {
		this(inventoryPlayer, worldPointer, BlockPos.ORIGIN);
	}

	public ContainerAeryaInfuser(InventoryPlayer inventoryPlayer, World worldPointer, BlockPos blockPosition) {

		this.worldPointer = worldPointer;
		this.blockPosition = blockPosition;

		this.addSlotToContainer(new Slot(aeryaInfuserCraft, 0, 27, 34) {

			@Override
			public boolean isItemValid(ItemStack stack) {
				return stack.getItem().isInfusable();
			}

			@Override
			public void onPickupFromSlot(EntityPlayer playerIn, ItemStack stack) {
				aeryaInfuserResult.clearInventory();
			}
		});
		this.addSlotToContainer(new Slot(aeryaInfuserCraft, 1, 77, 34) {

			@Override
			public boolean isItemValid(ItemStack stack) {
				return stack.getItem() instanceof ItemPotion;
			}

			@Override
			public void onPickupFromSlot(EntityPlayer playerIn, ItemStack stack) {
				aeryaInfuserResult.clearInventory();
			}
		});
		this.addSlotToContainer(new Slot(aeryaInfuserResult, 2, 134, 34) {

			@Override
			public boolean isItemValid(ItemStack stack) {
				return false;
			}

			@Override
			public void onPickupFromSlot(EntityPlayer playerIn, ItemStack stack) {
				aeryaInfuserCraft.clearInventory();
			}
		});

		for (int raw = 0; raw < 3; raw++)
			for (int col = 0; col < 9; col++)
				this.addSlotToContainer(new Slot(inventoryPlayer, col + raw * 9 + 9, 8 + col * 18, 84 + raw * 18));

		for (int col = 0; col < 9; col++)
			this.addSlotToContainer(new Slot(inventoryPlayer, col, 8 + col * 18, 142));

		onCraftMatrixChanged(aeryaInfuserCraft);
	}

	@Override
	public void onContainerClosed(EntityPlayer entityPlayer) {
		super.onContainerClosed(entityPlayer);

		if (!worldPointer.isRemote)
			for (int i = 0; i < 2; i++) {

				ItemStack itemStack = aeryaInfuserCraft.getStackInSlotOnClosing(i);

				if (itemStack != null)
					entityPlayer.dropPlayerItemWithRandomChoice(itemStack, false);
			}
	}

	@Override
	public void onCraftMatrixChanged(IInventory inventory) {

		if (inventory.getStackInSlot(0) != null && inventory.getStackInSlot(1) != null) {

			ItemStack toolItemStack = inventory.getStackInSlot(0);
			ItemStack potionItemStack = inventory.getStackInSlot(1);

			if (toolItemStack.isInfused())
				return;

			List<String> lores = new ArrayList<String>();
			lores.add(ChatFormatting.AQUA + "Potion effect: ");

			ItemStack infusedItemStack = new ItemStack(toolItemStack.getItem(), 1);
			for (PotionEffect potionEffect : Items.potionitem.getEffects(potionItemStack))
				if (potionEffect.isBadPotionEffect()) {

					String level = toRoman(potionEffect.getAmplifier() + 1);

					infusedItemStack.addPotionEffect(potionEffect);
					lores.add(ChatFormatting.WHITE + "  -" + ChatFormatting.DARK_RED
							+ StatCollector.translateToLocal(potionEffect.getEffectName()) + ChatFormatting.GREEN + " "
							+ level);
				}

			infusedItemStack.setLores(lores);
			if (infusedItemStack.isInfused())
				aeryaInfuserResult.setInventorySlotContents(0, infusedItemStack);
		}
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {

		ItemStack result = null;
		Slot slot = (Slot) this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemStack = slot.getStack();
			result = itemStack.copy();

			if (index == 2) {

				if (!this.mergeItemStack(itemStack, 3, 39, true))
					return null;

				slot.onSlotChange(itemStack, result);
			} else if (index != 0 && index != 1) {

				if (index >= 3 && index < 39 && !this.mergeItemStack(itemStack, 0, 2, false))
					return null;

			} else if (!this.mergeItemStack(itemStack, 3, 39, false))
				return null;

			if (itemStack.stackSize == 0)
				slot.putStack((ItemStack) null);
			else
				slot.onSlotChanged();

			if (itemStack.stackSize == result.stackSize)
				return null;

			slot.onPickupFromSlot(playerIn, itemStack);
		}

		return result;
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return worldPointer.getBlockState(blockPosition).getBlock() != AeryaBlocks.AERYA_INFUSER ? false
				: playerIn.getDistanceSq((double) blockPosition.getX() + 0.5D, (double) blockPosition.getY() + 0.5D,
						(double) blockPosition.getZ() + 0.5D) <= 64.0D;
	}

	private static String toRoman(int number) {
		return String.valueOf(new char[number]).replace('\0', 'I').replace("IIIII", "V").replace("IIII", "IV")
				.replace("VV", "X").replace("VIV", "IX").replace("XXXXX", "L").replace("XXXX", "XL").replace("LL", "C")
				.replace("LXL", "XC").replace("CCCCC", "D").replace("CCCC", "CD").replace("DD", "M")
				.replace("DCD", "CM");
	}
}