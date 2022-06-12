package net.kistyak.kistyakmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB = new CreativeModeTab("tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.PINKDIAMOND.get());
        }
    };
}
