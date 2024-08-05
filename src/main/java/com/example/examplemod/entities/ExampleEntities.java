package com.example.examplemod.entities;

import com.example.examplemod.ExampleMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExampleEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ExampleMod.MODID);

    public static final Supplier<EntityType<TestEntity>> TEST = ENTITIES.register("test",
            () -> EntityType.Builder.of(TestEntity::new, MobCategory.CREATURE)
                    .sized(2, 2)
                    .eyeHeight(1.8f)
                    .ridingOffset(0.04F)
                    .clientTrackingRange(8)
                    .updateInterval(2)
                    .build("test"));
}
