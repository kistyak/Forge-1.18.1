package net.kistyak.kistyakmod.item;

import net.kistyak.kistyakmod.KistyakMod;
import net.kistyak.kistyakmod.item.custom.BitumenItem;
import net.minecraft.world.item.Item;
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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
