package net.kistyak.kistyakmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier PINK_DIAMOND = new ForgeTier(3, 1500, 8f, 3f,
             10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItem.PINKDIAMOND.get()));
}
