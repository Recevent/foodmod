package com.github.redverstand.rvrfood.util;

import com.github.redverstand.rvrfood.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders {
    public static void defineRenders() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MUSTARD_PLANT, RenderLayer.getCutoutMipped());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xa0a5a9, ModBlocks.MUSTARD_PLANT);
    }
}