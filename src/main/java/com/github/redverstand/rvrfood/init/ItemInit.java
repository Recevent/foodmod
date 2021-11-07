package com.github.redverstand.rvrfood.init;

import com.github.redverstand.rvrfood.RVRFood;
import com.github.redverstand.rvrfood.item.ModItemGroup;
import com.github.redverstand.rvrfood.item.custom.ItemCropMustard;
import com.github.redverstand.rvrfood.item.custom.ItemSeedMustard;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemInit {

    public static final ItemCropMustard MUSTARD = Registry.register(Registry.ITEM, new Identifier(RVRFood.MOD_ID, "mustard"), new ItemCropMustard(new Item.Settings().group(ModItemGroup.ICON)));

    public static final ItemSeedMustard MUSTARD_SEED = Registry.register(Registry.ITEM, new Identifier(RVRFood.MOD_ID, "mustard_seeds"), new ItemSeedMustard(BlockInit.MUSTARD_PLANT,(new Item.Settings().group(ModItemGroup.ICON))));

    public static void init() {
        
    }
}
