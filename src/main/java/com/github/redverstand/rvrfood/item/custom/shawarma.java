package com.github.redverstand.rvrfood.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class shawarma extends Item {
    public shawarma(Settings settings){
        super(settings);
    }

//    @Override
//    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
//
//        if(Screen.hasShiftDown()){
//            tooltip.add(new TranslatableText("tooltip.rvrfood.composition"));
//            tooltip.add(new TranslatableText("tooltip.rvrfood.ingredient.pita"));
//            tooltip.add(new TranslatableText("tooltip.rvrfood.ingredient.chicken.fillet"));
//            tooltip.add(new TranslatableText("tooltip.rvrfood.ingredient.sauce"));
//            tooltip.add(new TranslatableText("tooltip.rvrfood.ingredient.korean.carrots"));
//            tooltip.add(new TranslatableText("tooltip.rvrfood.ingredient.cabbage"));
//            tooltip.add(new TranslatableText("tooltip.rvrfood.ingredient.tomatoes"));
//            tooltip.add(new TranslatableText("tooltip.rvrfood.ingredient.cucumber"));
//            tooltip.add(new TranslatableText("tooltip.rvrfood.ingredient.french.fries"));
//        }
//
//        super.appendTooltip(stack, world, tooltip, context);
//    }
}
