package net.trinity.mccourse;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.trinity.mccourse.block.ModBlocks;
import net.trinity.mccourse.screen.DehydratorScreen;
import net.trinity.mccourse.screen.ModScreenHandlers;

public class MCCourseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BLOSSOM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BLOSSOM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEHYDRATOR, RenderLayer.getCutout());
        ScreenRegistry.register(ModScreenHandlers.DEHYDRATOR_SCREEN_HANDLER, DehydratorScreen::new);
    }
}
