package dev.teamcitrusmods.factory_expansion.block;

import cofh.thermal.core.ThermalCore;
import dev.teamcitrusmods.factory_expansion.FactoryExpansion;
import dev.teamcitrusmods.factory_expansion.block.custom.FluxLampBlock;
import dev.teamcitrusmods.factory_expansion.item.ModCreativeModeTab;
import dev.teamcitrusmods.factory_expansion.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static cofh.thermal.lib.common.ThermalIDs.ID_SLAG_BLOCK;
import static cofh.thermal.lib.common.ThermalIDs.ID_SLAG_BRICKS;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FactoryExpansion.MODID);


    // --- THERMAL BLOCKS

    public static final RegistryObject<SlabBlock> SLAG_BLOCK_SLAB = registerBlock("slag_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BLOCK))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<StairBlock> SLAG_BLOCK_STAIRS = registerBlock("slag_block_stairs", () -> new StairBlock(() -> ThermalCore.BLOCKS.get(ID_SLAG_BLOCK).defaultBlockState(), BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BLOCK))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<WallBlock> SLAG_BLOCK_WALL = registerBlock("slag_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BLOCK))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);

    public static final RegistryObject<SlabBlock> SLAG_BRICKS_SLAB = registerBlock("slag_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BRICKS))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<StairBlock> SLAG_BRICKS_STAIRS = registerBlock("slag_bricks_stairs", () -> new StairBlock(() -> ThermalCore.BLOCKS.get(ID_SLAG_BRICKS).defaultBlockState(), BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BRICKS))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<WallBlock> SLAG_BRICKS_WALL = registerBlock("slag_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BRICKS))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);

    public static final RegistryObject<SlabBlock> RICH_SLAG_BLOCK_SLAB = registerBlock("rich_slag_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BLOCK))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<StairBlock> RICH_SLAG_BLOCK_STAIRS = registerBlock("rich_slag_block_stairs", () -> new StairBlock(() -> ThermalCore.BLOCKS.get(ID_SLAG_BLOCK).defaultBlockState(), BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BLOCK))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<WallBlock> RICH_SLAG_BLOCK_WALL = registerBlock("rich_slag_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BLOCK))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);

    public static final RegistryObject<SlabBlock> RICH_SLAG_BRICKS_SLAB = registerBlock("rich_slag_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BRICKS))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<StairBlock> RICH_SLAG_BRICKS_STAIRS = registerBlock("rich_slag_bricks_stairs", () -> new StairBlock(() -> ThermalCore.BLOCKS.get(ID_SLAG_BRICKS).defaultBlockState(), BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BRICKS))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<WallBlock> RICH_SLAG_BRICKS_WALL = registerBlock("rich_slag_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ThermalCore.BLOCKS.get(ID_SLAG_BRICKS))), ModCreativeModeTab.FACTORY_EXPANSION_TAB);


    // --- FACTORY_EXPANSION BLOCKS

    public static final RegistryObject<Block> THERMAL_BRIGHT_PLATING = registerBlock("thermal_bright_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<RotatedPillarBlock> THERMAL_BRIGHT_HALVED_PLATING = registerBlock("thermal_bright_halved_plating", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<SlabBlock> THERMAL_BRIGHT_HALVED_PLATING_SLAB = registerBlock("thermal_bright_halved_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<Block> THERMAL_BRIGHT_TILED_PLATING = registerBlock("thermal_bright_tiled_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<SlabBlock> THERMAL_BRIGHT_TILED_PLATING_SLAB = registerBlock("thermal_bright_tiled_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<StairBlock> THERMAL_BRIGHT_TILED_PLATING_STAIRS = registerBlock("thermal_bright_tiled_plating_stairs", () -> new StairBlock(() -> THERMAL_BRIGHT_TILED_PLATING.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);

    public static final RegistryObject<Block> THERMAL_DARK_TILED_PLATING = registerBlock("thermal_dark_tiled_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<SlabBlock> THERMAL_DARK_TILED_PLATING_SLAB = registerBlock("thermal_dark_tiled_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<StairBlock> THERMAL_DARK_TILED_PLATING_STAIRS = registerBlock("thermal_dark_tiled_plating_stairs", () -> new StairBlock(() -> THERMAL_BRIGHT_TILED_PLATING.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<RotatedPillarBlock> THERMAL_DARK_PIPE = registerBlock("thermal_dark_pipe", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);

    public static final RegistryObject<Block> THERMAL_BRIGHT_DARK_TRANSITION = registerBlock("thermal_bright_dark_transition", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);

    public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK = registerBlock("mana_crystal_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK_ACTIVE = registerBlock("mana_crystal_block_active", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<Block> MANA_CRYSTAL_POLISHED = registerBlock("mana_crystal_polished", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<Block> MANA_CRYSTAL_POLISHED_ACTIVE = registerBlock("mana_crystal_polished_active", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);

    public static final RegistryObject<Block> INDUSTRIAL_ROUGH_TILES = registerBlock("industrial_rough_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<Block> INDUSTRIAL_ROUGH_TILES_EXPOSED = registerBlock("industrial_rough_tiles_exposed", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<Block> INDUSTRIAL_ROUGH_TILES_WALL = registerBlock("industrial_rough_tiles_wall", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);


    // delete, not in final mod
    public static final RegistryObject<Block> SMILE = registerBlock("smile", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<SlabBlock> SMILE_SLAB = registerBlock("smile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<StairBlock> SMILE_STAIRS = registerBlock("smile_stairs", () -> new StairBlock(() -> SMILE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);
    public static final RegistryObject<WallBlock> SMILE_WALL = registerBlock("smile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.FACTORY_EXPANSION_TAB);




    // --- CUSTOM BLOCKS

    public static final RegistryObject<Block> FLUX_LAMP = registerBlock("flux_lamp",
            () -> new FluxLampBlock(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
                    .lightLevel(litBlockEmission(15))
                    .noOcclusion()), ModCreativeModeTab.FACTORY_EXPANSION_TAB);

    public static final RegistryObject<Block> FLUX_LAMP_INVERTED = registerBlock("flux_lamp_inverted",
            () -> new FluxLampBlock(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
                    .lightLevel(litBlockEmission(0))
                    .noOcclusion()), ModCreativeModeTab.FACTORY_EXPANSION_TAB);


    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (p_50763_) -> {
            return p_50763_.getValue(BlockStateProperties.LIT) ? pLightValue : 15 - pLightValue;
        };
    }


    // --- HELPER FUNCTIONS

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                          CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}