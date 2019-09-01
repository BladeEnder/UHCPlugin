package dev.bladeender.uhcplugin;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    public void onEnable()
    {
        saveDefaultConfig();
        WorldCreator worldCreator = new WorldCreator("UHC") ;
        Bukkit.createWorld(worldCreator);

    }
}
