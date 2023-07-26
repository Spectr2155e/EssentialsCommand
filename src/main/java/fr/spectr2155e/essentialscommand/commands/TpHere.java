package fr.spectr2155e.essentialscommand.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpHere implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if(!cmd.getName().equalsIgnoreCase("tphere")) {
            return false;
        }
        if(!(sender instanceof Player)){
            sender.sendMessage("§8§l(§4§lErreur§8§l) §cVous ne pouvez pas faire cette commande. <- Console");
            return false;
        }
        if(args.length != 1){
            sender.sendMessage("§8§l(§4§lErreur§8§l) §cVeuillez indiquer un joueur afin de le téléporter à votre position.");
            return false;
        }
        if(Bukkit.getPlayer(args[0]) == null){
            sender.sendMessage("§8§l(§4§lErreur§8§l) §cVeuillez indiquer un joueur correct.");
            return false;
        }
        Bukkit.getPlayer(args[0]).teleport(((Player) sender).getLocation());
        sender.sendMessage("§8§l(§3§lTéléportation§8§l) §fVous avez téléporté le joueur sélectionné sur votre position");
        return false;
    }
}
