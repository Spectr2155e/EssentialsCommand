package fr.spectr2155e.essentialscommand.objects.managers;

import fr.spectr2155e.essentialscommand.EssentialsCommand;
import fr.spectr2155e.essentialscommand.commands.*;
import fr.spectr2155e.essentialscommand.commands.warp.commands.Warp;
import fr.spectr2155e.essentialscommand.commands.warp.manager.TabWarpCompletion;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;

public class CommandManager {
    public void createCommand(String name, CommandExecutor command){
        EssentialsCommand.instance.getCommand(name).setExecutor(command);
    }
    public void completion(String name, TabCompleter tabCompleter){
        EssentialsCommand.instance.getCommand(name).setTabCompleter(tabCompleter);
    }
    public void initCommands(){
        createCommand("gmc", new GamemodeC());
        createCommand("gms", new GamemodeS());
        createCommand("gmsp", new GamemodeSP());
        createCommand("tphere", new TpHere());
        createCommand("vanish", new Vanish());
        createCommand("speed", new Speed());
        createCommand("warp", new Warp());
        completion("warp", new TabWarpCompletion());
    }
}
