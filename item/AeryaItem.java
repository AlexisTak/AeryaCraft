package fr.aeryacraft.item;

import static net.minecraft.item.Item.registerItem;
import static net.minecraft.item.Item.registerItemBlock;

import fr.aeryacraft.client.model.loader.MeshModel;
import fr.aeryacraft.init.AeryaBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class AeryaItem {

	public static void registerCustomItems() {

		// last id of all items
		int id = 431;

		// Aerya items
		registerItem(id++, "aerya_helmet", new ItemArmor(ArmorMaterial.AERYA, 3, 0).setUnlocalizedName("helmetAerya"));
		registerItem(id++, "aerya_chestplate",
				new ItemArmor(ArmorMaterial.AERYA, 3, 1).setUnlocalizedName("chestplateAerya"));
		registerItem(id++, "aerya_leggings",
				new ItemArmor(ArmorMaterial.AERYA, 3, 2).setUnlocalizedName("leggingsAerya"));
		registerItem(id++, "aerya_boots", new ItemArmor(ArmorMaterial.AERYA, 3, 3).setUnlocalizedName("bootsAerya"));
		registerItem(id++, "aerya_ingot",
				new Item().setUnlocalizedName("ingotAerya").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "aerya_nugget",
				new Item().setUnlocalizedName("nuggetAerya").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "aerya_sword",
				new ItemSword(ToolMaterial.AERYA).setUnlocalizedName("swordAerya").setInfusable(true));
		registerItem(id++, "aerya_shovel", new ItemSpade(ToolMaterial.AERYA).setUnlocalizedName("shovelAerya"));
		registerItem(id++, "aerya_pickaxe", new ItemPickaxe(ToolMaterial.AERYA).setUnlocalizedName("pickaxeAerya"));
		registerItem(id++, "aerya_axe", new ItemAxe(ToolMaterial.AERYA).setUnlocalizedName("hatchetAerya"));
		registerItem(id++, "aerya_hammer", new ItemHammer(ToolMaterial.AERYA, 1, 1).setUnlocalizedName("hammerAerya"));

		// Aventurine items
		registerItem(id++, "aventurine_helmet",
				new ItemArmor(ArmorMaterial.AVENTURINE, 3, 0).setUnlocalizedName("helmetAventurine"));
		registerItem(id++, "aventurine_chestplate",
				new ItemArmor(ArmorMaterial.AVENTURINE, 3, 1).setUnlocalizedName("chestplateAventurine"));
		registerItem(id++, "aventurine_leggings",
				new ItemArmor(ArmorMaterial.AVENTURINE, 3, 2).setUnlocalizedName("leggingsAventurine"));
		registerItem(id++, "aventurine_boots",
				new ItemArmor(ArmorMaterial.AVENTURINE, 3, 3).setUnlocalizedName("bootsAventurine"));
		registerItem(id++, "aventurine_ingot",
				new Item().setUnlocalizedName("ingotAventurine").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "aventurine_nugget",
				new Item().setUnlocalizedName("nuggetAventurine").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "aventurine_sword",
				new ItemSword(ToolMaterial.AVENTURINE).setUnlocalizedName("swordAventurine").setInfusable(true));
		registerItem(id++, "aventurine_shovel",
				new ItemSpade(ToolMaterial.AVENTURINE).setUnlocalizedName("shovelAventurine"));
		registerItem(id++, "aventurine_pickaxe",
				new ItemPickaxe(ToolMaterial.AVENTURINE).setUnlocalizedName("pickaxeAventurine"));
		registerItem(id++, "aventurine_axe",
				new ItemAxe(ToolMaterial.AVENTURINE).setUnlocalizedName("hatchetAventurine"));
		registerItem(id++, "aventurine_hammer",
				new ItemHammer(ToolMaterial.AVENTURINE, 1, 1).setUnlocalizedName("hammerAventurine"));

		// Tourmaline items
		registerItem(id++, "tourmaline_helmet",
				new ItemArmor(ArmorMaterial.TOURMALINE, 3, 0).setUnlocalizedName("helmetTourmaline"));
		registerItem(id++, "tourmaline_chestplate",
				new ItemArmor(ArmorMaterial.TOURMALINE, 3, 1).setUnlocalizedName("chestplateTourmaline"));
		registerItem(id++, "tourmaline_leggings",
				new ItemArmor(ArmorMaterial.TOURMALINE, 3, 2).setUnlocalizedName("leggingsTourmaline"));
		registerItem(id++, "tourmaline_boots",
				new ItemArmor(ArmorMaterial.TOURMALINE, 3, 3).setUnlocalizedName("bootsTourmaline"));
		registerItem(id++, "tourmaline_ingot",
				new Item().setUnlocalizedName("ingotTourmaline").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "tourmaline_nugget",
				new Item().setUnlocalizedName("nuggetTourmaline").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "tourmaline_sword",
				new ItemSword(ToolMaterial.TOURMALINE).setUnlocalizedName("swordTourmaline").setInfusable(true));
		registerItem(id++, "tourmaline_shovel",
				new ItemSpade(ToolMaterial.TOURMALINE).setUnlocalizedName("shovelTourmaline"));
		registerItem(id++, "tourmaline_pickaxe",
				new ItemPickaxe(ToolMaterial.TOURMALINE).setUnlocalizedName("pickaxeTourmaline"));
		registerItem(id++, "tourmaline_axe",
				new ItemAxe(ToolMaterial.TOURMALINE).setUnlocalizedName("hatchetTourmaline"));
		registerItem(id++, "tourmaline_hammer",
				new ItemHammer(ToolMaterial.TOURMALINE, 1, 1).setUnlocalizedName("hammerTourmaline"));

		// Eladrite items
		registerItem(id++, "eladrite_helmet",
				new ItemArmor(ArmorMaterial.ELADRITE, 3, 0).setUnlocalizedName("helmetEladrite"));
		registerItem(id++, "eladrite_chestplate",
				new ItemArmor(ArmorMaterial.ELADRITE, 3, 1).setUnlocalizedName("chestplateEladrite"));
		registerItem(id++, "eladrite_leggings",
				new ItemArmor(ArmorMaterial.ELADRITE, 3, 2).setUnlocalizedName("leggingsEladrite"));
		registerItem(id++, "eladrite_boots",
				new ItemArmor(ArmorMaterial.ELADRITE, 3, 3).setUnlocalizedName("bootsEladrite"));
		registerItem(id++, "eladrite_ingot",
				new Item().setUnlocalizedName("ingotEladrite").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "eladrite_nugget",
				new Item().setUnlocalizedName("nuggetEladrite").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "eladrite_sword",
				new ItemSword(ToolMaterial.ELADRITE).setUnlocalizedName("swordEladrite").setInfusable(true));
		registerItem(id++, "eladrite_shovel",
				new ItemSpade(ToolMaterial.ELADRITE).setUnlocalizedName("shovelEladrite"));
		registerItem(id++, "eladrite_pickaxe",
				new ItemPickaxe(ToolMaterial.ELADRITE).setUnlocalizedName("pickaxeEladrite"));
		registerItem(id++, "eladrite_axe", new ItemAxe(ToolMaterial.ELADRITE).setUnlocalizedName("hatchetEladrite"));
		registerItem(id++, "eladrite_hammer",
				new ItemHammer(ToolMaterial.ELADRITE, 1, 1).setUnlocalizedName("hammerEladrite"));

		// Amethyste items
		registerItem(id++, "amethyste_helmet",
				new ItemArmor(ArmorMaterial.AMETHYSTE, 3, 0).setUnlocalizedName("helmetAmethyste"));
		registerItem(id++, "amethyste_chestplate",
				new ItemArmor(ArmorMaterial.AMETHYSTE, 3, 1).setUnlocalizedName("chestplateAmethyste"));
		registerItem(id++, "amethyste_leggings",
				new ItemArmor(ArmorMaterial.AMETHYSTE, 3, 2).setUnlocalizedName("leggingsAmethyste"));
		registerItem(id++, "amethyste_boots",
				new ItemArmor(ArmorMaterial.AMETHYSTE, 3, 3).setUnlocalizedName("bootsAmethyste"));
		registerItem(id++, "amethyste_ingot",
				new Item().setUnlocalizedName("ingotAmethyste").setCreativeTab(CreativeTabs.tabMaterials));
		registerItem(id++, "amethyste_sword",
				new ItemSword(ToolMaterial.AMETHYSTE).setUnlocalizedName("swordAmethyste").setInfusable(true));
		registerItem(id++, "amethyste_shovel",
				new ItemSpade(ToolMaterial.AMETHYSTE).setUnlocalizedName("shovelAmethyste"));
		registerItem(id++, "amethyste_pickaxe",
				new ItemPickaxe(ToolMaterial.AMETHYSTE).setUnlocalizedName("pickaxeAmethyste"));
		registerItem(id++, "amethyste_axe", new ItemAxe(ToolMaterial.AMETHYSTE).setUnlocalizedName("hatchetAmethyste"));
		registerItem(id++, "amethyste_hammer",
				new ItemHammer(ToolMaterial.AMETHYSTE, 1, 1).setUnlocalizedName("hammerAmethyste"));

		// Legendary items
		registerItem(id++, "excalibur",
				new ItemLegendary(ToolMaterial.LEGEND).setUnlocalizedName("excalibur").setInfusable(true));
		registerItem(id++, "masamune",
				new ItemLegendary(ToolMaterial.LEGEND).setUnlocalizedName("masamune").setInfusable(true));
		registerItem(id++, "galuth",
				new ItemLegendary(ToolMaterial.LEGEND).setUnlocalizedName("galuth").setInfusable(true));
		registerItem(id++, "joyeuse",
				new ItemLegendary(ToolMaterial.LEGEND).setUnlocalizedName("joyeuse").setInfusable(true));
		registerItem(id++, "durandal",
				new ItemLegendary(ToolMaterial.LEGEND).setUnlocalizedName("durandal").setInfusable(true));
		registerItem(id++, "lobera", new ItemLegendary(ToolMaterial.LEGEND).setUnlocalizedName("lobera")
				.setInfusable(true).setMeshModel(new MeshModel(new ResourceLocation("aeryacraft/meshs/lobera.obj"))));

		// Items associated to blocks
		registerItemBlock(AeryaBlocks.AERYA_ORE);
		registerItemBlock(AeryaBlocks.AERYA_BLOCK);
		registerItemBlock(AeryaBlocks.AMETHYSTE_ORE);
		registerItemBlock(AeryaBlocks.AMETHYSTE_BLOCK);
		registerItemBlock(AeryaBlocks.ELADRITE_ORE);
		registerItemBlock(AeryaBlocks.ELADRITE_BLOCK);
		registerItemBlock(AeryaBlocks.AVENTURINE_ORE);
		registerItemBlock(AeryaBlocks.AVENTURINE_BLOCK);
		registerItemBlock(AeryaBlocks.TOURMALINE_ORE);
		registerItemBlock(AeryaBlocks.TOURMALINE_BLOCK);
		registerItemBlock(AeryaBlocks.AERYA_INFUSER);
	}
}
