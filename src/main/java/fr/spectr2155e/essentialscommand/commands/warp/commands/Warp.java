package fr.spectr2155e.essentialscommand.commands.warp.commands;

import fr.spectr2155e.essentialscommand.EssentialsCommand;
import fr.spectr2155e.essentialscommand.commands.warp.manager.WarpManager;
import fr.spectr2155e.essentialscommand.objects.enums.Message;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Warp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if(!s.equals("warp")) return false;
        if(args.length == 0) {
            Message.UseCommandHelpWarp.send(sender);
            return false;
        }

        if(args[0].equals("create") || args[0].equals("c")){
            if(!(sender instanceof Player)){
                Message.console.send(sender);
                return false;
            }
            if(args.length < 2){
                Message.UseCommandCreateWarp.send(sender);
                return false;
            }
            WarpManager.createWarp((Player) sender, args[1], ((Player) sender).getLocation());
            return false;
        }

        if(args[0].equals("remove") || args[0].equals("r")){
            if(args.length < 2){
                Message.UseCommandRemoveWarp.send(sender);
                return false;
            }
            WarpManager.removeWarp(sender, args[1]);
            return false;
        }

        if(args[0].equals("teleport") || args[0].equals("tp")){
            if(!(sender instanceof Player)){
                Message.console.send(sender);
                return false;
            }
            if(args.length > 3 || args.length == 1){
                Message.UseCommandTeleportWarp.send(sender);
                return false;
            }
            if(args.length == 3){
                if(Bukkit.getPlayer(args[2]) != null){
                    if(sender.getName().equals(args[2])){
                        Message.CannotWarpTpSelf.send(sender, args[1]);
                        return false;
                    }
                    WarpManager.teleportWarpOther(sender ,Bukkit.getPlayer(args[2]), args[1]);
                    return false;
                } else Message.NotConnected.send(sender);
            }else {
                WarpManager.teleportWarp((Player) sender, args[1]);
                return false;
            }
        }

        if(args[0].equals("list")){
            if(args.length > 1){
                Message.UseCommandListWarp.send(sender);
                return false;
            }
            WarpManager.listWarp(sender);
            return false;
        }

        if(args[0].equals("help")){
            if(args.length > 1){
                Message.UseCommandHelpWarp.send(sender);
                return false;
            }
            WarpManager.helpWarp(sender);
            return false;
        }
        else Message.UseCommandHelpWarp.send(sender);
        return false;
    }
}
