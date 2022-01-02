package net.trinity.mccourse.block.entity;


import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;

import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

import net.trinity.mccourse.MCCourseMod;
import net.trinity.mccourse.block.ModBlocks;

import java.util.Optional;

public class ModBlockEntites {
    public static BlockEntityType<DehydratorEntity> DEHYDRATOR;

    public static void registerAllEntities() {
        DEHYDRATOR = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MCCourseMod.MOD_ID, "dehydrator"),
                FabricBlockEntityTypeBuilder.create(DehydratorEntity::new,
                        ModBlocks.DEHYDRATOR).build(null));
    }




}
