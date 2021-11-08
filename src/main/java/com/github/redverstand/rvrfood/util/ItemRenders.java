package com.github.redverstand.rvrfood.util;

import com.github.redverstand.rvrfood.item.ModItems;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class ItemRenders {

    public static void defineRenders() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xa0a5a9, ModItems.MUSTARD_SEED);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xc48946, ModItems.MUSTARD);
    }
    
}
