package dev.teamcitrusmods.factory_expansion.item;

import dev.teamcitrusmods.factory_expansion.FactoryExpansion;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FactoryExpansion.MODID);

    // ITEMS
    public static final RegistryObject<Item> FAUX_COIL = ITEMS.register("faux_coil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACTORY_EXPANSION_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
