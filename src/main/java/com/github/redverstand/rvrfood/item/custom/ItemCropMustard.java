package com.github.redverstand.rvrfood.item.custom;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class ItemCropMustard extends Item {

    public ItemCropMustard(Settings settings) {
        super(settings);
    }

//    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
//        super.appendTooltip(stack, world, tooltip, context);
//        tooltip.add((new TranslatableText("item.rvrfood.mustard.line1").formatted(Formatting.GREEN)));
//    }
    
}
