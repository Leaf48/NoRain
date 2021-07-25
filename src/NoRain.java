package com.leaf48.norain;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoRain extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(Util.color("&cPlugin has been enabled&b⛏"));
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(Util.color("&cPlugin has been disabled&b⛏"));
    }

    @EventHandler
    public void onRain(WeatherChangeEvent event){
//        getLogger().info(String.valueOf(event.toWeatherState()));
        if(event.toWeatherState()){
            event.setCancelled(true);
        }
    }
}
