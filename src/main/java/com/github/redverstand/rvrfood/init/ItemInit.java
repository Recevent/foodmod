package com.github.redverstand.rvrfood.init;

import com.github.redverstand.rvrfood.RVRFood;
import com.github.redverstand.rvrfood.item.ModItemGroup;
import com.github.redverstand.rvrfood.item.custom.ItemCropGold;
import com.github.redverstand.rvrfood.item.custom.ItemCropIron;
import com.github.redverstand.rvrfood.item.custom.ItemSeedGold;
import com.github.redverstand.rvrfood.item.custom.ItemSeedIron;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemInit {

    public static final ItemCropIron IRON_ESSENCE = Registry.register(Registry.ITEM, new Identifier(RVRFood.MOD_ID, "iron_essence"), new ItemCropIron(new Item.Settings().group(ModItemGroup.ICON)));

    public static final ItemSeedIron IRON_SEEDS = Registry.register(Registry.ITEM, new Identifier(RVRFood.MOD_ID, "iron_seeds"), new ItemSeedIron(BlockInit.IRON_PLANT,(new Item.Settings().group(ModItemGroup.ICON))));

    public static final ItemCropGold GOLD_ESSENCE = Registry.register(Registry.ITEM, new Identifier(RVRFood.MOD_ID, "gold_essence"), new ItemCropGold(new Item.Settings().group(ModItemGroup.ICON)));

    public static final ItemSeedGold GOLD_SEEDS = Registry.register(Registry.ITEM, new Identifier(RVRFood.MOD_ID, "gold_seeds"), new ItemSeedGold(BlockInit.GOLD_PLANT,(new Item.Settings().group(ModItemGroup.ICON))));


    public static void init() {
        
    }
}
