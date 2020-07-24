package fr.aeryacraft.block;

import static net.minecraft.block.Block.*;

import net.minecraft.block.BlockCompressed;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.MapColor;

public class AeryaBlock {
	
	
	public static void registerCustomBlocks() {
		
		int id = 197;
		
		registerBlock(id++, "aerya_ore", new BlockOre().setHardness(3.0F).setResistance(8.0F).setStepSound(soundTypePiston).setUnlocalizedName("oreAerya"));
        registerBlock(id++, "aerya_block", new BlockCompressed(MapColor.diamondColor).setHardness(5.0F).setResistance(13.5F).setStepSound(soundTypeMetal).setUnlocalizedName("blockAerya"));
        registerBlock(id++, "eladrite_ore", new BlockOre().setHardness(3.0F).setResistance(7.0F).setStepSound(soundTypePiston).setUnlocalizedName("oreEladrite"));
        registerBlock(id++, "eladrite_block", new BlockCompressed(MapColor.diamondColor).setHardness(5.0F).setResistance(13.0F).setStepSound(soundTypeMetal).setUnlocalizedName("blockEladrite"));
        registerBlock(id++, "aventurine_ore", new BlockOre().setHardness(3.0F).setResistance(6.0F).setStepSound(soundTypePiston).setUnlocalizedName("oreAventurine"));
        registerBlock(id++, "aventurine_block", new BlockCompressed(MapColor.diamondColor).setHardness(5.0F).setResistance(12.5F).setStepSound(soundTypeMetal).setUnlocalizedName("blockAventurine"));
        registerBlock(id++, "amethyste_ore", new BlockOre().setHardness(3.0F).setResistance(5.0F).setStepSound(soundTypePiston).setUnlocalizedName("oreAmethyste"));
        registerBlock(id++, "amethyste_block", new BlockCompressed(MapColor.diamondColor).setHardness(5.0F).setResistance(12.0F).setStepSound(soundTypeMetal).setUnlocalizedName("blockAmethyste"));
        registerBlock(id++, "tourmaline_ore", new BlockOre().setHardness(3.0F).setResistance(5.0F).setStepSound(soundTypePiston).setUnlocalizedName("oreTourmaline"));
        registerBlock(id++, "tourmaline_block", new BlockCompressed(MapColor.diamondColor).setHardness(5.0F).setResistance(12.0F).setStepSound(soundTypeMetal).setUnlocalizedName("blockTourmaline"));
        registerBlock(id++, "aerya_infuser", new BlockAeryaInfuser().setHardness(5.0F).setResistance(20.0F).setStepSound(soundTypeMetal).setUnlocalizedName("AeryaInfuser"));
	}
}
