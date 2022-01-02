package net.trinity.mccourse;

import net.fabricmc.api.ModInitializer;
import net.trinity.mccourse.block.ModBlocks;
import net.trinity.mccourse.block.entity.ModBlockEntites;
import net.trinity.mccourse.item.ModItems;
import net.trinity.mccourse.painting.ModPaintings;
import net.trinity.mccourse.recipe.ModRecipes;
import net.trinity.mccourse.util.ModRegisteries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegisteries.registerModStuffs();
		ModPaintings.registerPaintings();
		ModRecipes.register();

		ModBlockEntites.registerAllEntities();

	}
}
