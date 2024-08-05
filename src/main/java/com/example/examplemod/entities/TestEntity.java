package com.example.examplemod.entities;

import net.minecraft.core.Holder;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;

public class TestEntity extends Mob {
    public TestEntity(EntityType<? extends Mob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.FOLLOW_RANGE, 16F)
                .add(Attributes.MAX_HEALTH, 10F)
                .add(Attributes.MOVEMENT_SPEED, 0.2F);
    }

    @Nullable
    @Override
    public AttributeInstance getAttribute(Holder<Attribute> pAttribute) {
        return super.getAttribute(pAttribute);
    }

    @Override
    public @NotNull Iterable<ItemStack> getArmorSlots() {
        return Collections.emptyList();
    }

    @Override
    public @NotNull ItemStack getItemBySlot(EquipmentSlot pSlot) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setItemSlot(EquipmentSlot pSlot, ItemStack pStack) {

    }

    @Override
    public @NotNull HumanoidArm getMainArm() {
        return HumanoidArm.RIGHT;
    }
}
