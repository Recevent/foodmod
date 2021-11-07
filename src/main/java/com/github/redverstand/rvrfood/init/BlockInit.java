package com.github.redverstand.rvrfood.init;

import com.github.redverstand.rvrfood.RVRFood;
import com.github.redverstand.rvrfood.blocks.MustardPlant;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {

    public static final MustardPlant MUSTARD_PLANT = Registry.register(Registry.BLOCK, new Identifier(RVRFood.MOD_ID, "mustard_plant"), new MustardPlant(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0F, 0.0F).sounds(BlockSoundGroup.CROP).nonOpaque()));

    public static void init() {
        
    }

}
