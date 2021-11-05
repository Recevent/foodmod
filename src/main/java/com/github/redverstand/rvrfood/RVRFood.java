package com.github.redverstand.rvrfood;

import com.github.redverstand.rvrfood.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class RVRFood implements ModInitializer {

    public static final String MOD_ID = "rvrfood";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        System.out.println("Hello Fabric world!");
    }
}
