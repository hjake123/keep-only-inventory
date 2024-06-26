package com.hyperlynx.koi.platform.services;

public interface IConfig {
    public boolean keepXP();
    public boolean keepAllItems();
    public boolean keepArmor();
    public boolean keepHotbar();
    public boolean damageDurableItems();
    public float damageProportion();
    public boolean keepHunger();
    public int minimumSpawnHunger();
}
