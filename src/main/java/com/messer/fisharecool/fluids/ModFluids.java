package com.messer.fisharecool.fluids;

import com.messer.fisharecool.FishAreCool;
import com.messer.fisharecool.items.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static FlowableFluid STILL_MINING_WATER;
    public static FlowableFluid FLOWING_MINING_WATER;
    public static Block MINING_WATER_BLOCK;
    public static Item MINING_WATER_BUCKET;

    public static void register(){
        STILL_MINING_WATER = Registry.register (Registries.FLUID,
                new Identifier(FishAreCool.MOD_ID, "mining_water"), new MiningWaterFluid.Still());

        FLOWING_MINING_WATER = Registry.register(Registries.FLUID,
                new Identifier(FishAreCool.MOD_ID, "flowing_mining_water"), new MiningWaterFluid.Flowing());

        MINING_WATER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(FishAreCool.MOD_ID, "mining_water_block"),
                new FluidBlock(ModFluids.STILL_MINING_WATER, FabricBlockSettings.copyOf(Blocks.WATER)){ });

        MINING_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(FishAreCool.MOD_ID, "mining_water_bucket"),
                new BucketItem(ModFluids.STILL_MINING_WATER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1).food(ModFoodComponents.MINING_WATER)));

    }
}
