package com.github.redverstand.rvrfood.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class MustardPlant extends CropBlock {

	public MustardPlant(Block.Settings builder) {
        super(builder);
	}

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add((new TranslatableText("block.rvrfood.mustard_plant").formatted(Formatting.GREEN)));
    }

}
