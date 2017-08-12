package de.nomicode.buildnow;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Erstellt von Lars am 13.08.2017.
 * Alle Rechte vorbehalten. Der Entwickler kann jederzeit
 * die Rechte an diesem Code entziehen!
 */
public class BuildNow extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§eBuildNow gestartet!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§eBuildNow gestoppt!");
    }
}
