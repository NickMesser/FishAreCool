package com.messer.fisharecool.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent MINING_WATER = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,20*30, 2),1f)
            .build();

    public static final FoodComponent COOKED_IRON_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,20*30, 4),1f)
            .build();

    public static final FoodComponent COOKED_GOLD_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,20*30, 1),1f)
            .build();

    public static final FoodComponent COOKED_REDSTONE_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20*30, 2),1f)
            .build();

    public static final FoodComponent COOKED_COPPER_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,20*30, 3),1f)
            .build();

    public static final FoodComponent COOKED_EMERALD_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,20*15),1f)
            .build();

    public static final FoodComponent COOKED_LAPIS_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,20*30),1f)
            .build();

    public static final FoodComponent COOKED_DIAMOND_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,20*30, 4),1f)
            .build();

    public static final FoodComponent COOKED_DEBRIS_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,20*30, 4),1f)
            .build();

    public static final FoodComponent COOKED_AMETHYST_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,20*30),1f)
            .build();

    public static final FoodComponent COOKED_COAL_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,20*30),1f)
            .build();

    public static final FoodComponent COOKED_QUARTZ_FISH = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,20*30, 2),1f)
            .build();
}
