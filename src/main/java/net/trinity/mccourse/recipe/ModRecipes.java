package net.trinity.mccourse.recipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.trinity.mccourse.MCCourseMod;

public class ModRecipes {
    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MCCourseMod.MOD_ID, DehydratorRecipe.Serializer.ID),
                DehydratorRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MCCourseMod.MOD_ID, DehydratorRecipe.Type.ID),
                DehydratorRecipe.Type.INSTANCE);
    }
}