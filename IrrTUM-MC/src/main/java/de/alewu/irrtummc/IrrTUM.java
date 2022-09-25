package de.alewu.irrtummc;

import de.alewu.irrtummc.listener.EntityExplodeListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class IrrTUM extends JavaPlugin {

    @Override
    public void onEnable() {
        var pm = Bukkit.getPluginManager();

        pm.registerEvents(new EntityExplodeListener(), this);
    }
}
