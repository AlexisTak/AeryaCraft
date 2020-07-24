package fr.aeryacraft.init;

import static net.minecraft.init.Blocks.getRegisteredBlock;

import fr.aeryacraft.block.BlockAeryaInfuser;
import net.minecraft.block.Block;
import net.minecraft.init.Bootstrap;

public class AeryaBlocks {
	
	public static final Block AERYA_ORE;
    public static final Block AERYA_BLOCK;
    public static final Block AMETHYSTE_ORE;
    public static final Block AMETHYSTE_BLOCK;
    public static final Block ELADRITE_ORE;
    public static final Block ELADRITE_BLOCK;
    public static final Block AVENTURINE_ORE;
    public static final Block AVENTURINE_BLOCK;
    public static final Block TOURMALINE_ORE;
    public static final Block TOURMALINE_BLOCK;
    public static final BlockAeryaInfuser AERYA_INFUSER;
    
    static {
		if (!Bootstrap.isRegistered())
			throw new RuntimeException("Accessed Blocks before Bootstrap!");
		else {
			
			AERYA_ORE = getRegisteredBlock("aerya_ore");
			AERYA_BLOCK = getRegisteredBlock("aerya_block");
			AMETHYSTE_ORE = getRegisteredBlock("amethyste_ore");
			AMETHYSTE_BLOCK = getRegisteredBlock("amethyste_block");
			ELADRITE_ORE = getRegisteredBlock("eladrite_ore");
			ELADRITE_BLOCK = getRegisteredBlock("eladrite_block");
			AVENTURINE_ORE = getRegisteredBlock("aventurine_ore");
			AVENTURINE_BLOCK = getRegisteredBlock("aventurine_block");
			TOURMALINE_ORE = getRegisteredBlock("tourmaline_ore");
			TOURMALINE_BLOCK = getRegisteredBlock("tourmaline_block");
			AERYA_INFUSER = (BlockAeryaInfuser) getRegisteredBlock("aerya_infuser");
		}
    }
}
