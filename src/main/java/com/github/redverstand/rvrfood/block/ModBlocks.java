package com.github.redverstand.rvrfood.block;

import com.github.redverstand.rvrfood.RVRFood;
import com.github.redverstand.rvrfood.blocks.MustardPlant;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block MUSTARD_PLANT = registerBlock("mustard_plant", new MustardPlant(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0F, 0.0F).sounds(BlockSoundGroup.CROP).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(RVRFood.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        RVRFood.LOGGER.info("Registering Mod Blocks for " + RVRFood.MOD_ID);
    }
}
