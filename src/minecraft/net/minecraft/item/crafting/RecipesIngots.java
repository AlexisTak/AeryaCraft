package net.minecraft.item.crafting;

import fr.aeryacraft.init.AeryaBlocks;
import fr.aeryacraft.init.AeryaItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;

public class RecipesIngots {
	private Object[][] recipeItems;
	private static final String __OBFID = "CL_00000089";

	public RecipesIngots() {
		this.recipeItems = new Object[][] { { Blocks.gold_block, new ItemStack(Items.gold_ingot, 9) },
				{ Blocks.iron_block, new ItemStack(Items.iron_ingot, 9) },
				{ Blocks.diamond_block, new ItemStack(Items.diamond, 9) },
				{ Blocks.emerald_block, new ItemStack(Items.emerald, 9) },
				{ Blocks.lapis_block, new ItemStack(Items.dye, 9, EnumDyeColor.BLUE.getDyeColorDamage()) },
				{ Blocks.redstone_block, new ItemStack(Items.redstone, 9) },
				{ Blocks.coal_block, new ItemStack(Items.coal, 9, 0) },
				{ Blocks.hay_block, new ItemStack(Items.wheat, 9) },
				{ Blocks.slime_block, new ItemStack(Items.slime_ball, 9) },
				{ AeryaBlocks.AERYA_BLOCK, new ItemStack(AeryaItems.AERYA_INGOT, 9) },
				{ AeryaBlocks.AMETHYSTE_BLOCK, new ItemStack(AeryaItems.AMETHYSTE_INGOT, 9)},
				{ AeryaBlocks.AVENTURINE_BLOCK, new ItemStack(AeryaItems.AVENTURINE_NUGGET, 9)},
				{ AeryaBlocks.ELADRITE_BLOCK, new ItemStack(AeryaItems.ELADRITE_INGOT, 9)},
				{ AeryaBlocks.TOURMALINE_BLOCK, new ItemStack(AeryaItems.TOURMALINE_INGOT, 9) } };
	}

	/**
	 * Adds the ingot recipes to the CraftingManager.
	 */
	public void addRecipes(CraftingManager p_77590_1_) {
		for (int var2 = 0; var2 < this.recipeItems.length; ++var2) {
			Block var3 = (Block) this.recipeItems[var2][0];
			ItemStack var4 = (ItemStack) this.recipeItems[var2][1];
			p_77590_1_.addRecipe(new ItemStack(var3), new Object[] { "###", "###", "###", '#', var4 });
			p_77590_1_.addRecipe(var4, new Object[] { "#", '#', var3 });
		}

		p_77590_1_.addRecipe(new ItemStack(Items.gold_ingot),
				new Object[] { "###", "###", "###", '#', Items.gold_nugget });
		p_77590_1_.addRecipe(new ItemStack(Items.gold_nugget, 9), new Object[] { "#", '#', Items.gold_ingot });
	}
}
