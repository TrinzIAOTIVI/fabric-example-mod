package net.trinity.mccourse.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static FoodComponent JERKY = new
            FoodComponent.Builder().hunger(4).saturationModifier(1f).meat().build();

    public static FoodComponent BEEF_JERKY = new
            FoodComponent.Builder().hunger(6).saturationModifier(1f).meat().build();

    public static FoodComponent MUTTON_JERKY = new
            FoodComponent.Builder().hunger(4).saturationModifier(1f).meat().build();

    public static FoodComponent PORKCHOP_JERKY = new
            FoodComponent.Builder().hunger(6).saturationModifier(1f).meat().build();

    public static FoodComponent TURNIP = new
            FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
}
