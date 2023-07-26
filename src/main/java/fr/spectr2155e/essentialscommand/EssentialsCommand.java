package fr.spectr2155e.essentialscommand;

import fr.spectr2155e.essentialscommand.objects.managers.CommandManager;
import fr.spectr2155e.essentialscommand.objects.managers.FileManager;
import fr.spectr2155e.essentialscommand.objects.managers.ListenerManager;
import fr.spectr2155e.essentialscommand.objects.managers.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class EssentialsCommand extends JavaPlugin {

    public static EssentialsCommand instance;
    public CommandManager commandManager = new CommandManager();
    public static FileManager fileManager = new FileManager();
    public ListenerManager listenerManager = new ListenerManager();
    public static Utils utils = new Utils();

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        commandManager.initCommands();
        fileManager.initFiles();
        listenerManager.initListeners();
        System.out.println("Plugin EssentialsCommand activé 1.0");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin EssentialsCommand désactivé 1.0");
    }
}
