package io.github.lexikiq.vanillachunktest;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public VanillaGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VanillaGenerator();
    }
}
