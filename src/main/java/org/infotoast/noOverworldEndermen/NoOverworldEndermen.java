package org.infotoast.noOverworldEndermen;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoOverworldEndermen extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("§l§a[NoOverworldEndermen] §rEnabling...");
        SpawnListener spawnListener = new SpawnListener();
        getServer().getPluginManager().registerEvents(spawnListener, this);
        getLogger().info("§l§a[NoOverworldEndermen] §rLoaded NoOverworldEndermen!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("§l§a[NoOverworldEndermen] §rShutting down.");
    }
}
