package net.trinity.mccourse.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.trinity.mccourse.MCCourseMod;


public class ModPaintings {

    public static final PaintingMotive NAKANO = registerPainting("nakano", new PaintingMotive( 32, 32));






    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive){
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(MCCourseMod.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings(){
        System.out.println("Registering Paintings for" + MCCourseMod.MOD_ID);
    }
}
