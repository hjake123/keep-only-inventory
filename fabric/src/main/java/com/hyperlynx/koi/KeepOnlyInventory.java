package com.hyperlynx.koi;

import com.hyperlynx.koi.platform.FabricConfig;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

public class KeepOnlyInventory implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        MidnightConfig.init(Constants.MOD_ID, FabricConfig.class);
    }
}
