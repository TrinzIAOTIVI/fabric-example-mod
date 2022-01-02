package net.trinity.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.trinity.mccourse.MCCourseMod;
import net.trinity.mccourse.block.custom.*;
import net.trinity.mccourse.item.ModItemGroups;

public class ModBlocks {

    public static final Block DEHYDRATOR = registerBlock( "dehydrator",
            new DehydratorBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_BLOCK = registerBlock( "orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_ORE = registerBlock( "orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroups.COURSE);

    public static final Block DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroups.COURSE);

    public static final Block RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_STAIRS = registerBlock("orichalcum_stairs",
            new ModStairsBlock(ModBlocks.ORICHALCUM_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_BUTTON = registerBlock("orichalcum_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_PRESSURE_PLATE = registerBlock("orichalcum_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_SLAB = registerBlock("orichalcum_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_FENCE = registerBlock("orichalcum_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_FENCE_GATE = registerBlock("orichalcum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block ORICHALCUM_WALL = registerBlock("orichalcum_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool().nonOpaque()), ModItemGroups.COURSE);

    public static final Block CHERRY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor",
            new ModTrapDoor(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool().nonOpaque()), ModItemGroups.COURSE);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroups.COURSE);

    public static final Block TYTAINIUM_ORE = registerBlock( "tytainium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroups.COURSE);

    public static final Block TYTAINIUM_BLOCK = registerBlock( "tytainium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroups.COURSE);








    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + MCCourseMod.MOD_ID);
    }
}
