package com.messer.fisharecool.fluids;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public abstract class MiningWaterFluid extends BaseResourceFluid {
    @Override
    public Fluid getStill() {
        return ModFluids.STILL_MINING_WATER;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.FLOWING_MINING_WATER;
    }

    @Override
    public Item getBucketItem() {
        return ModFluids.MINING_WATER_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModFluids.MINING_WATER_BLOCK.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(state));
    }
    public static class Flowing extends MiningWaterFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }

    public static class Still extends MiningWaterFluid {
        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }
    }
}
