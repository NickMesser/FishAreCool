package com.messer.fisharecool.client;

import com.messer.fisharecool.fluids.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class FishAreCoolClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MINING_WATER, ModFluids.FLOWING_MINING_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1636672
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_MINING_WATER, ModFluids.FLOWING_MINING_WATER);
    }
}
