package org.infotoast.noOverworldEndermen;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class SpawnListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntitySpawn(EntitySpawnEvent evt) {
        System.out.println("Entity spawn");
        if (evt.getEntityType().equals(EntityType.ENDERMAN)) {
            System.out.println("Entity is enderman");
            if (evt.getLocation().getWorld().getEnvironment().equals(World.Environment.NORMAL)) {
                System.out.println("Is overworld.");
                evt.setCancelled(true);
            }
        }
    }
}
