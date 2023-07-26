package fr.spectr2155e.essentialscommand.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeS implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if(!cmd.getName().equalsIgnoreCase("gms")) {return false;}
        if(!(sender instanceof Player)){
            sender.sendMessage("§8§l(§4§lErreur§8§l) §cVous ne pouvez pas faire cette commande. <- Console");
            return false;
        }
        ((Player) sender).setGameMode(GameMode.SURVIVAL);
        sender.sendMessage("§8§l(§e§lGAMEMODE§8§l) §fVotre mode de jeu est désormais en§a survie§f.");
        return false;
    }

}
