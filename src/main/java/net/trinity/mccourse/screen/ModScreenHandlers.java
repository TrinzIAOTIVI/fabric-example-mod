package net.trinity.mccourse.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.trinity.mccourse.MCCourseMod;

public class ModScreenHandlers {
    public static ScreenHandlerType<DehydratorScreenHandler> DEHYDRATOR_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(MCCourseMod.MOD_ID, "dehydrator"),
                    DehydratorScreenHandler::new);
}
