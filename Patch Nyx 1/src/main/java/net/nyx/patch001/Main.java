package net.nyx.patch001;


import org.bukkit.plugin.java.JavaPlugin;
public final class Main extends JavaPlugin{


    @Override
    public void onEnable() {

        getServer().getConsoleSender().sendMessage("[Nyx Patch 001] Activated");
        getServer().getPluginManager().registerEvents(new BoatPatch(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("[Nyx Patch 001] Deactivated");
    }


}


