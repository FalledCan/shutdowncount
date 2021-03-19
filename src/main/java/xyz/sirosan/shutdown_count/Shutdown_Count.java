package xyz.sirosan.shutdown_count;

import org.bukkit.plugin.java.JavaPlugin;

public final class Shutdown_Count extends JavaPlugin {

    private static Shutdown_Count plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getCommand("sdc").setExecutor(new Shutdown_Count_Cmd());

    }

    public static Shutdown_Count getPlugin(){
        return plugin;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
