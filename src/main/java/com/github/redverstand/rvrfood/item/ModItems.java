package com.github.redverstand.rvrfood.item;

import com.github.redverstand.rvrfood.block.ModBlocks;
import com.github.redverstand.rvrfood.RVRFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item SHAWARMA = registerItem("shawarma", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)
            .food(new FoodComponent.Builder().hunger(16).saturationModifier(1f).build()).maxCount(1)
            .group(ModItemGroup.ICON)));

    public static final Item SUNFLOWER_SEED = registerItem("sunflower_seed", new Item(new FabricItemSettings().rarity(Rarity.COMMON)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build())
            .group(ModItemGroup.ICON)));

    public static final Item SUNFLOWER_OIL = registerItem("sunflower_oil", new Item(new FabricItemSettings().rarity(Rarity.COMMON)
            .group(ModItemGroup.ICON).maxCount(1)));

    public static final Item MAYONNAISE = registerItem("mayonnaise", new Item(new FabricItemSettings().rarity(Rarity.COMMON)
            .group(ModItemGroup.ICON).maxCount(1)));

    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings().rarity(Rarity.COMMON)
            .group(ModItemGroup.ICON)));

    public static final Item MUSTARD = registerItem("mustard", new Item(new Item.Settings().group(ModItemGroup.ICON)));

    public static final Item MUSTARD_SEED = registerItem("mustard_seeds", new BlockItem(ModBlocks.MUSTARD_PLANT,(new Item.Settings().group(ModItemGroup.ICON))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RVRFood.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RVRFood.LOGGER.info("Registering Mod Items for " + RVRFood.MOD_ID);
    }
}
