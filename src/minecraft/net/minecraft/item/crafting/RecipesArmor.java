package net.minecraft.item.crafting;

import fr.aeryacraft.init.AeryaItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesArmor {
	private String[][] recipePatterns = new String[][] { { "XXX", "X X" }, { "X X", "XXX", "XXX" },
			{ "XXX", "X X", "X X" }, { "X X", "X X" } };
	private Item[][] recipeItems;
	private static final String __OBFID = "CL_00000080";

	public RecipesArmor() {
		this.recipeItems = new Item[][] {
				{ Items.leather, Items.iron_ingot, Items.diamond, Items.gold_ingot, AeryaItems.AERYA_INGOT,
						AeryaItems.AMETHYSTE_INGOT, AeryaItems.AVENTURINE_NUGGET, AeryaItems.ELADRITE_INGOT,
						AeryaItems.TOURMALINE_INGOT },
				{ Items.leather_helmet, Items.iron_helmet, Items.diamond_helmet, Items.golden_helmet,
						AeryaItems.AERYA_HELMET, AeryaItems.AMETHYSTE_HELMET, AeryaItems.AVENTURINE_HELMET,
						AeryaItems.ELADRITE_HELMET, AeryaItems.TOURMALINE_HELMET },
				{ Items.leather_chestplate, Items.iron_chestplate, Items.diamond_chestplate, Items.golden_chestplate,
						AeryaItems.AERYA_CHESTPLATE, AeryaItems.AMETHYSTE_CHESTPLATE, AeryaItems.AVENTURINE_CHESTPLATE,
						AeryaItems.ELADRITE_CHESTPLATE, AeryaItems.TOURMALINE_CHESTPLATE },
				{ Items.leather_leggings, Items.iron_leggings, Items.diamond_leggings, Items.golden_leggings,
						AeryaItems.AERYA_LEGGINGS, AeryaItems.AMETHYSTE_LEGGINGS, AeryaItems.AVENTURINE_LEGGINGS,
						AeryaItems.ELADRITE_LEGGINGS, AeryaItems.TOURMALINE_LEGGINGS },
				{ Items.leather_boots, Items.iron_boots, Items.diamond_boots, Items.golden_boots,
						AeryaItems.AERYA_BOOTS, AeryaItems.AMETHYSTE_BOOTS, AeryaItems.AVENTURINE_BOOTS,
						AeryaItems.ELADRITE_BOOTS, AeryaItems.TOURMALINE_BOOTS } };
	}

	/**
	 * Adds the armor recipes to the CraftingManager.
	 */
	public void addRecipes(CraftingManager p_77609_1_) {
		for (int var2 = 0; var2 < this.recipeItems[0].length; ++var2) {
			Item var3 = this.recipeItems[0][var2];

			for (int var4 = 0; var4 < this.recipeItems.length - 1; ++var4) {
				Item var5 = this.recipeItems[var4 + 1][var2];
				p_77609_1_.addRecipe(new ItemStack(var5), new Object[] { this.recipePatterns[var4], 'X', var3 });
			}
		}
	}
}
