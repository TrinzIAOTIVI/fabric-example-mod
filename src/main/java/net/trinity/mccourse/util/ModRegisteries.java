package net.trinity.mccourse.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.trinity.mccourse.MCCourseMod;
import net.trinity.mccourse.item.ModItems;

public class ModRegisteries {
    public static void registerModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){
        System.out.println("Registering Fuels for " + MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COAL_SLIVER, 400);
    }
}
