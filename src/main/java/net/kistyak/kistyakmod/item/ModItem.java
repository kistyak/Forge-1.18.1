package net.kistyak.kistyakmod.item;

import net.kistyak.kistyakmod.KistyakMod;
import net.kistyak.kistyakmod.item.custom.BitumenItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KistyakMod.MOD_ID);

    public static final RegistryObject<Item> PINKDIAMOND = ITEMS.register("pinkdiamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));

    public static final RegistryObject<Item> BITUMEN = ITEMS.register("bitumen",
            () -> new BitumenItem(new Item.Properties().tab(ModCreativeModeTab.TAB)));

    public static final RegistryObject<Item> CHEEPS = ITEMS.register("cheeps",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB).food(ModFoods.CHEEPS)));


    public static final RegistryObject<Item> PINK_DIAMOND_SWORD = ITEMS.register("pink_diamond_sword",
            () -> new SwordItem(ModTiers.PINK_DIAMOND, 2, 3f,new Item.Properties().tab(ModCreativeModeTab.TAB)));
    public static final RegistryObject<Item> PINK_DIAMOND_PICKAXE = ITEMS.register("pink_diamond_pickaxe",
            () -> new PickaxeItem(ModTiers.PINK_DIAMOND, 1, 1f,new Item.Properties().tab(ModCreativeModeTab.TAB)));
    public static final RegistryObject<Item> PINK_DIAMOND_SHOVEL = ITEMS.register("pink_diamond_shovel",
            () -> new ShovelItem(ModTiers.PINK_DIAMOND, 0, 1f,new Item.Properties().tab(ModCreativeModeTab.TAB)));
    public static final RegistryObject<Item> PINK_DIAMOND_AXE = ITEMS.register("pink_diamond_axe",
            () -> new AxeItem(ModTiers.PINK_DIAMOND, 4, 0f,new Item.Properties().tab(ModCreativeModeTab.TAB)));
    public static final RegistryObject<Item> PINK_DIAMOND_HOE = ITEMS.register("pink_diamond_hoe",
            () -> new HoeItem(ModTiers.PINK_DIAMOND, 0, 0f,new Item.Properties().tab(ModCreativeModeTab.TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
