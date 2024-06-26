package com.hyperlynx.koi;


import com.hyperlynx.koi.platform.NeoConfig;
import eu.midnightdust.lib.config.MidnightConfig;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class KeepOnlyInventory {

    public KeepOnlyInventory(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();
        MidnightConfig.init(Constants.MOD_ID, NeoConfig.class);
    }
}