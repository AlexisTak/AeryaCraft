package net.minecraft.item.crafting;

import fr.aeryacraft.init.AeryaItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesTools {
	private String[][] recipePatterns = new String[][] { { "XXX", " # ", " # " }, { "X", "#", "#" },
			{ "XX", "X#", " #" }, { "XX", " #", " #" } };
	private Object[][] recipeItems;
	private static final String __OBFID = "CL_00000096";

	public RecipesTools() {
		this.recipeItems = new Object[][] {
				{ Blocks.planks, Blocks.cobblestone, Items.iron_ingot, Items.diamond, Items.gold_ingot,
						AeryaItems.AERYA_INGOT, AeryaItems.AMETHYSTE_INGOT, AeryaItems.AVENTURINE_NUGGET,
						AeryaItems.ELADRITE_INGOT, AeryaItems.TOURMALINE_INGOT },
				{ Items.wooden_pickaxe, Items.stone_pickaxe, Items.iron_pickaxe, Items.diamond_pickaxe,
						Items.golden_pickaxe, AeryaItems.AERYA_PICKAXE, AeryaItems.AMETHYSTE_PICKAXE,
						AeryaItems.AVENTURINE_PICKAXE, AeryaItems.ELADRITE_PICKAXE, AeryaItems.TOURMALINE_PICKAXE },
				{ Items.wooden_shovel, Items.stone_shovel, Items.iron_shovel, Items.diamond_shovel, Items.golden_shovel,
						AeryaItems.AERYA_SHOVEL, AeryaItems.AMETHYSTE_SHOVEL, AeryaItems.AVENTURINE_SHOVEL,
						AeryaItems.ELADRITE_SHOVEL, AeryaItems.TOURMALINE_SHOVEL },
				{ Items.wooden_axe, Items.stone_axe, Items.iron_axe, Items.diamond_axe, Items.golden_axe,
						AeryaItems.AERYA_AXE, AeryaItems.AMETHYSTE_AXE, AeryaItems.AVENTURINE_AXE,
						AeryaItems.ELADRITE_AXE, AeryaItems.TOURMALINE_AXE },
				{ Items.wooden_hoe, Items.stone_hoe, Items.iron_hoe, Items.diamond_hoe, Items.golden_hoe } };
	}

	/**
	 * Adds the tool recipes to the CraftingManager.
	 */
	public void addRecipes(CraftingManager p_77586_1_) {
		for (int var2 = 0; var2 < this.recipeItems[0].length; ++var2) {
			Object var3 = this.recipeItems[0][var2];

			for (int var4 = 0; var4 < this.recipeItems.length - 1; ++var4) {

				if (var2 < this.recipeItems[var4 + 1].length) {

					Item var5 = (Item) this.recipeItems[var4 + 1][var2];
					p_77586_1_.addRecipe(new ItemStack(var5),
							new Object[] { this.recipePatterns[var4], '#', Items.stick, 'X', var3 });
				}
			}
		}

		p_77586_1_.addRecipe(new ItemStack(Items.shears), new Object[] { " #", "# ", '#', Items.iron_ingot });
	}
}
