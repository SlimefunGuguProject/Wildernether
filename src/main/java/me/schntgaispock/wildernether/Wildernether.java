package me.schntgaispock.wildernether;

import java.util.Random;

import javax.annotation.Nonnull;

import org.bukkit.NamespacedKey;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.schntgaispock.wildernether.listeners.Listeners;
import me.schntgaispock.wildernether.managers.ItemManager;
import me.schntgaispock.wildernether.managers.LootManager;

public class Wildernether extends AbstractAddon {

    static Wildernether instance;

    final Random random = new Random();

    public Wildernether() {
        super("SchnTgaiSpock", "Wildernether", "master", "options.auto-update");
    }

    public static Wildernether getInstance() {
        return instance;
    }

    public Random getRandom() {
        return this.random;
    }

    @Override
    public void enable() {
        instance = this;

        getLogger().info("#=======================================#");
        getLogger().info("#    Wildernether - By SchnTgaiSpock    #");
        getLogger().info("#=======================================#");

        ItemManager.setup();
        LootManager.setup();
        Listeners.setup();
    }

    @Override
    protected void disable() {
        instance = null;
    }

    public static NamespacedKey newNamespacedKey(@Nonnull String name) {
        return new NamespacedKey(Wildernether.getInstance(), name);
    }
}
