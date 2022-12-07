package com.messer.fisharecool.items;

import com.messer.fisharecool.FishAreCool;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item IRON_FISH = registerItem("iron_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_IRON_FISH = registerItem("cooked_iron_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_IRON_FISH)));

    public static final Item COPPER_FISH = registerItem("copper_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_COPPER_FISH = registerItem("cooked_copper_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_COPPER_FISH)));

    public static final Item DIAMOND_FISH = registerItem("diamond_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_DIAMOND_FISH = registerItem("cooked_diamond_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_DIAMOND_FISH)));

    public static final Item REDSTONE_FISH = registerItem("redstone_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_REDSTONE_FISH = registerItem("cooked_redstone_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_REDSTONE_FISH)));

    public static final Item DEBRIS_FISH = registerItem("debris_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_DEBRIS_FISH = registerItem("cooked_debris_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_DEBRIS_FISH)));

    public static final Item EMERALD_FISH = registerItem("emerald_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_EMERALD_FISH = registerItem("cooked_emerald_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_EMERALD_FISH)));

    public static final Item LAPIS_FISH = registerItem("lapis_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_LAPIS_FISH = registerItem("cooked_lapis_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_LAPIS_FISH)));

    public static final Item QUARTZ_FISH = registerItem("quartz_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_QUARTZ_FISH = registerItem("cooked_quartz_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_QUARTZ_FISH)));

    public static final Item AMETHYST_FISH = registerItem("amethyst_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_AMETHYST_FISH = registerItem("cooked_amethyst_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_AMETHYST_FISH)));

    public static final Item COAL_FISH = registerItem("coal_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_COAL_FISH = registerItem("cooked_coal_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_COAL_FISH)));

    public static final Item GOLD_FISH = registerItem("gold_fish",
            new Item(new FabricItemSettings().food(FoodComponents.COD)));

    public static final Item COOKED_GOLD_FISH = registerItem("cooked_gold_fish",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_GOLD_FISH)));


    private static Item registerItem(String name, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(FishAreCool.MOD_ID, name), item);
    }
    public static void register(){
    }
}
