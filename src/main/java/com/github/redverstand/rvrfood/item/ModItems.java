package com.github.redverstand.rvrfood.item;

import com.github.redverstand.rvrfood.RVRFood;
import com.github.redverstand.rvrfood.item.custom.shawarma;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item SHAWARMA = registerItem("shawarma", new shawarma(new FabricItemSettings().rarity(Rarity.UNCOMMON)
            .food(new FoodComponent.Builder().hunger(16).saturationModifier(1f).build())
            .group(ModItemGroup.ICON)));

    public static final Item SUNFLOWER_SEED = registerItem("sunflower_seed", new Item(new FabricItemSettings().rarity(Rarity.COMMON)
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build())
            .group(ModItemGroup.ICON)));

    public static final Item SUNFLOWER_OIL = registerItem("sunflower_oil", new Item(new FabricItemSettings().rarity(Rarity.COMMON)
            .group(ModItemGroup.ICON)));

    public static final Item MAYONNAISE = registerItem("mayonnaise", new Item(new FabricItemSettings().rarity(Rarity.COMMON)
            .group(ModItemGroup.ICON)));

    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings().rarity(Rarity.COMMON)
            .group(ModItemGroup.ICON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RVRFood.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + RVRFood.MOD_ID);
    }
}
