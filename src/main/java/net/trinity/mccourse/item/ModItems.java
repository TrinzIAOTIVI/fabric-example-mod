package net.trinity.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.trinity.mccourse.MCCourseMod;
import net.trinity.mccourse.item.custom.DowsingRodItem;
import net.trinity.mccourse.item.custom.ModAxeItem;
import net.trinity.mccourse.item.custom.ModHoeItem;
import net.trinity.mccourse.item.custom.ModPickaxeItem;


public class ModItems {


    // ORE ITEMS

    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item TYTAINIUM_INGOT = registerItem("tytainium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item TYTAINIUM_CHUNK = registerItem("tytainium_chunk",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));


    //TOOLS - USABLE ITEMS

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));

    public static final Item TYTAINIUM_PICKAXE = registerItem("tytainium_pickaxe",
            new ModPickaxeItem(ModToolMaterial.TYTAINIUM, 1, 1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item TYTAINIUM_AXE = registerItem("tytainium_axe",
            new ModAxeItem(ModToolMaterial.TYTAINIUM, 3, 1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item TYTAINIUM_SHOVEL = registerItem("tytainium_shovel",
            new ShovelItem(ModToolMaterial.TYTAINIUM, 1, 3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item TYTAINIUM_SWORD = registerItem("tytainium_sword",
            new SwordItem(ModToolMaterial.TYTAINIUM, 4, 3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item TYTAINIUM_HOE = registerItem("tytainium_hoe",
            new ModHoeItem(ModToolMaterial.TYTAINIUM, 4, 3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    //FOODS

    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.TURNIP)));

    public static final Item JERKY = registerItem("jerky",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.JERKY)));

    public static final Item BEEF_JERKY = registerItem("beef_jerky",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.BEEF_JERKY)));

    public static final Item MUTTON_JERKY = registerItem("mutton_jerky",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.MUTTON_JERKY)));

    public static final Item PORKCHOP_JERKY = registerItem("porkchop_jerky",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.PORKCHOP_JERKY)));






    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }
}
