package fr.spectr2155e.essentialscommand.commands;

import fr.spectr2155e.essentialscommand.EssentialsCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Speed implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("speed")) return false;
        if (!(sender instanceof Player)) {
            sender.sendMessage("§8§l(§4§lErreur§8§l) §cVous ne pouvez pas faire cette commande. <- Console");
            return false;
        }
        if (args.length != 1) {
            sender.sendMessage("§8§l(§4§lErreur§8§l) §cVeuillez indiquer un nombre.");
            return false;
        }
        if(!EssentialsCommand.utils.isInt(args[0])){
            sender.sendMessage("Veuillez préciser un nombre correct entre 0 et 10.");
            return false;
        }
        if(!((Integer.valueOf(args[0])) >= 0) && !((Integer.valueOf(args[0]) <= 10))){
            sender.sendMessage("Veuillez préciser un nombre correct entre 0 et 10.");
            return false;
        }
        float speed = (float) Integer.valueOf(args[0]) / 10;
        if(!((Player) sender).isFlying()){
            ((Player) sender).setWalkSpeed(speed);
            sender.sendMessage("§8§l(§b§lSPEED§8§l) §fVotre vitesse de marche est désormais de §e"+speed+"§f.");
        }
        ((Player) sender).setFlySpeed(speed);
        sender.sendMessage("§8§l(§b§lSPEED§8§l) §fVotre vitesse de vol est désormais de §e"+speed+"§f.");
        return false;
    }
}
