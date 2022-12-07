package com.messer.fisharecool.mixins;

import com.messer.fisharecool.fluids.ModFluids;
import com.messer.fisharecool.loot.ModLoots;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.loot.LootManager;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;


@Mixin(FishingBobberEntity.class)
public abstract class FishingBobberLootMixin extends Entity {
    public FishingBobberLootMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/loot/LootManager;getTable(Lnet/minecraft/util/Identifier;)Lnet/minecraft/loot/LootTable;"))
    private LootTable getTable(LootManager lootManager, Identifier id) {
        assert world.getServer() != null;

        BlockPos pos = this.getBlockPos();
        FluidState fluidState = this.world.getFluidState(pos);

        if(fluidState.isEmpty()){
            BlockPos newPos = new BlockPos(pos.down());
            fluidState = this.world.getFluidState(newPos);
        }

        if(fluidState.isOf(ModFluids.STILL_MINING_WATER) || fluidState.isOf(ModFluids.FLOWING_MINING_WATER)){
            return this.world.getServer().getLootManager().getTable(ModLoots.MINING_FLUID_LOOT);
        }

        // Default
        return this.world.getServer().getLootManager().getTable(LootTables.FISHING_GAMEPLAY);
    }
}
