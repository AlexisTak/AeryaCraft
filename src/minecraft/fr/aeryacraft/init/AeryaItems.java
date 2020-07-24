package fr.aeryacraft.init;

import static net.minecraft.init.Items.getRegisteredItem;

import net.minecraft.init.Bootstrap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class AeryaItems {

	public static final Item AERYA_SWORD;
	public static final Item AERYA_SHOVEL;
	public static final Item AERYA_PICKAXE;
	public static final Item AERYA_AXE;
	public static final Item AERYA_HAMMER;
	public static final Item AERYA_INGOT;
	public static final Item AVENTURINE_SWORD;
	public static final Item AVENTURINE_SHOVEL;
	public static final Item AVENTURINE_PICKAXE;
	public static final Item AVENTURINE_AXE;
	public static final Item AVENTURINE_HAMMER;
	public static final Item AVENTURINE_NUGGET;
	public static final Item ELADRITE_SWORD;
	public static final Item ELADRITE_SHOVEL;
	public static final Item ELADRITE_PICKAXE;
	public static final Item ELADRITE_AXE;
	public static final Item ELADRITE_HAMMER;
	public static final Item ELADRITE_INGOT;
	public static final Item AMETHYSTE_SWORD;
	public static final Item AMETHYSTE_SHOVEL;
	public static final Item AMETHYSTE_PICKAXE;
	public static final Item AMETHYSTE_AXE;
	public static final Item AMETHYSTE_HAMMER;
	public static final Item AMETHYSTE_INGOT;
	public static final Item TOURMALINE_SWORD;
	public static final Item TOURMALINE_SHOVEL;
	public static final Item TOURMALINE_PICKAXE;
	public static final Item TOURMALINE_AXE;
	public static final Item TOURMALINE_HAMMER;
	public static final Item TOURMALINE_INGOT;
	public static final Item EXCALIBUR;
	public static final Item MASAMUNE;
	public static final Item GALUTH;
	public static final Item JOYEUSE;
	public static final Item DURANDAL;
	public static final Item LOBERA;

	public static final ItemArmor AERYA_HELMET;
	public static final ItemArmor AERYA_CHESTPLATE;
	public static final ItemArmor AERYA_LEGGINGS;
	public static final ItemArmor AERYA_BOOTS;
	public static final ItemArmor AVENTURINE_HELMET;
	public static final ItemArmor AVENTURINE_CHESTPLATE;
	public static final ItemArmor AVENTURINE_LEGGINGS;
	public static final ItemArmor AVENTURINE_BOOTS;
	public static final ItemArmor ELADRITE_HELMET;
	public static final ItemArmor ELADRITE_CHESTPLATE;
	public static final ItemArmor ELADRITE_LEGGINGS;
	public static final ItemArmor ELADRITE_BOOTS;
	public static final ItemArmor AMETHYSTE_HELMET;
	public static final ItemArmor AMETHYSTE_CHESTPLATE;
	public static final ItemArmor AMETHYSTE_LEGGINGS;
	public static final ItemArmor AMETHYSTE_BOOTS;
	public static final ItemArmor TOURMALINE_HELMET;
	public static final ItemArmor TOURMALINE_CHESTPLATE;
	public static final ItemArmor TOURMALINE_LEGGINGS;
	public static final ItemArmor TOURMALINE_BOOTS;

	static {
		
		if (!Bootstrap.isRegistered())
			throw new RuntimeException("Accessed Items before Bootstrap!");
		else {

			AERYA_SWORD = getRegisteredItem("aerya_sword");
			AERYA_SHOVEL = getRegisteredItem("aerya_shovel");
			AERYA_PICKAXE = getRegisteredItem("aerya_pickaxe");
			AERYA_AXE = getRegisteredItem("aerya_axe");
			AERYA_HAMMER = getRegisteredItem("aerya_hammer");
			AERYA_INGOT = getRegisteredItem("aerya_ingot");
			AVENTURINE_SWORD = getRegisteredItem("aventurine_sword");
			AVENTURINE_SHOVEL = getRegisteredItem("aventurine_shovel");
			AVENTURINE_PICKAXE = getRegisteredItem("aventurine_pickaxe");
			AVENTURINE_AXE = getRegisteredItem("aventurine_axe");
			AVENTURINE_HAMMER = getRegisteredItem("aventurine_hammer");
			AVENTURINE_NUGGET = getRegisteredItem("aventurine_nugget");
			ELADRITE_SWORD = getRegisteredItem("eladrite_sword");
			ELADRITE_SHOVEL = getRegisteredItem("eladrite_shovel");
			ELADRITE_PICKAXE = getRegisteredItem("eladrite_pickaxe");
			ELADRITE_AXE = getRegisteredItem("eladrite_axe");
			ELADRITE_HAMMER = getRegisteredItem("eladrite_hammer");
			ELADRITE_INGOT = getRegisteredItem("eladrite_ingot");
			AMETHYSTE_SWORD = getRegisteredItem("amethyste_sword");
			AMETHYSTE_SHOVEL = getRegisteredItem("amethyste_shovel");
			AMETHYSTE_PICKAXE = getRegisteredItem("amethyste_pickaxe");
			AMETHYSTE_AXE = getRegisteredItem("amethyste_axe");
			AMETHYSTE_HAMMER = getRegisteredItem("amethyste_hammer");
			AMETHYSTE_INGOT = getRegisteredItem("amethyste_ingot");
			TOURMALINE_SWORD = getRegisteredItem("tourmaline_sword");
			TOURMALINE_SHOVEL = getRegisteredItem("tourmaline_shovel");
			TOURMALINE_PICKAXE = getRegisteredItem("tourmaline_pickaxe");
			TOURMALINE_AXE = getRegisteredItem("tourmaline_axe");
			TOURMALINE_HAMMER = getRegisteredItem("tourmaline_hammer");
			TOURMALINE_INGOT = getRegisteredItem("tourmaline_ingot");
			
			EXCALIBUR = getRegisteredItem("Excalibur");
			MASAMUNE = getRegisteredItem("Masamune");
			GALUTH = getRegisteredItem("Galuth");
			JOYEUSE = getRegisteredItem("Joyeuse");
			DURANDAL = getRegisteredItem("Durandal");
			LOBERA = getRegisteredItem("Lobera");

			AERYA_HELMET = (ItemArmor) getRegisteredItem("aerya_helmet");
			AERYA_CHESTPLATE = (ItemArmor) getRegisteredItem("aerya_chestplate");
			AERYA_LEGGINGS = (ItemArmor) getRegisteredItem("aerya_leggings");
			AERYA_BOOTS = (ItemArmor) getRegisteredItem("aerya_boots");
			AVENTURINE_HELMET = (ItemArmor) getRegisteredItem("aventurine_helmet");
			AVENTURINE_CHESTPLATE = (ItemArmor) getRegisteredItem("aventurine_chestplate");
			AVENTURINE_LEGGINGS = (ItemArmor) getRegisteredItem("aventurine_leggings");
			AVENTURINE_BOOTS = (ItemArmor) getRegisteredItem("aventurine_boots");
			ELADRITE_HELMET = (ItemArmor) getRegisteredItem("eladrite_helmet");
			ELADRITE_CHESTPLATE = (ItemArmor) getRegisteredItem("eladrite_chestplate");
			ELADRITE_LEGGINGS = (ItemArmor) getRegisteredItem("eladrite_leggings");
			ELADRITE_BOOTS = (ItemArmor) getRegisteredItem("eladrite_boots");
			AMETHYSTE_HELMET = (ItemArmor) getRegisteredItem("aventurine_helmet");
			AMETHYSTE_CHESTPLATE = (ItemArmor) getRegisteredItem("aventurine_chestplate");
			AMETHYSTE_LEGGINGS = (ItemArmor) getRegisteredItem("aventurine_leggings");
			AMETHYSTE_BOOTS = (ItemArmor) getRegisteredItem("aventurine_boots");
			TOURMALINE_HELMET = (ItemArmor) getRegisteredItem("tourmaline_helmet");
			TOURMALINE_CHESTPLATE = (ItemArmor) getRegisteredItem("tourmaline_chestplate");
			TOURMALINE_LEGGINGS = (ItemArmor) getRegisteredItem("tourmaline_leggings");
			TOURMALINE_BOOTS = (ItemArmor) getRegisteredItem("tourmaline_boots");
		}
	}
}
