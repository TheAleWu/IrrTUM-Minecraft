package de.alewu.irrtummc.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplodeListener implements Listener {

    @EventHandler
    public void on(EntityExplodeEvent e) {
        e.blockList().clear();
    }

}
