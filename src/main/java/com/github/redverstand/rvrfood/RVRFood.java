package com.github.redverstand.rvrfood;

import com.github.redverstand.rvrfood.item.ModItems;
import com.github.redverstand.rvrfood.util.BlockRenders;
import com.github.redverstand.rvrfood.util.ItemRenders;
import net.fabricmc.api.ModInitializer;

public class RVRFood implements ModInitializer {

    public static final String MOD_ID = "rvrfood";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        BlockRenders.defineRenders();
        ItemRenders.defineRenders();
        System.out.println("Hello Fabric world!");
    }
}
