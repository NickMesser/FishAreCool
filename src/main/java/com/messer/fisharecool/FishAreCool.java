package com.messer.fisharecool;

import com.messer.fisharecool.fluids.ModFluids;
import com.messer.fisharecool.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishAreCool implements ModInitializer {
    public static final String MOD_ID = "fisharecool";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.register();
        LOGGER.debug("this is a test");
        ModFluids.register();
    }
}
