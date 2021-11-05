package com.github.redverstand.rvrfood.item;

import com.github.redverstand.rvrfood.RVRFood;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ICON = FabricItemGroupBuilder.build(new Identifier(RVRFood.MOD_ID, "icon"),
            () -> new ItemStack(ModItems.SHAWARMA));
}
