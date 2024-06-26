package com.hyperlynx.koi.platform;

import com.hyperlynx.koi.platform.services.IConfig;
import eu.midnightdust.lib.config.MidnightConfig;

public class FabricConfig extends MidnightConfig implements IConfig {
    @Entry public static boolean keepXP = false;
    @Entry public static ItemKeepLevel keepItems = ItemKeepLevel.ALL;
    public enum ItemKeepLevel {
        NONE, HOTBAR, ARMOR, HOTBAR_AND_ARMOR, ALL
    }
    @Entry public static boolean keepHunger = false;
    @Entry(isSlider = true, min = 0, max = 20) public static int minHunger = 6;

    @Override
    public boolean keepXP() {
        return keepXP;
    }

    @Override
    public boolean keepAllItems() {
        return keepItems == ItemKeepLevel.ALL;
    }

    @Override
    public boolean keepArmor() {
        return keepItems == ItemKeepLevel.ARMOR || keepItems == ItemKeepLevel.HOTBAR_AND_ARMOR;
    }

    @Override
    public boolean keepHotbar() {
        return keepItems == ItemKeepLevel.HOTBAR || keepItems == ItemKeepLevel.HOTBAR_AND_ARMOR;
    }

    @Override
    public boolean keepHunger() {
        return keepHunger;
    }

    @Override
    public int minimumSpawnHunger() {
        return minHunger;
    }
}
