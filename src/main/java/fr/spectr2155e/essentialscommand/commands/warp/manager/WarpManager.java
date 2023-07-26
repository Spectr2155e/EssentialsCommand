package fr.spectr2155e.essentialscommand.commands.warp.manager;

import fr.spectr2155e.essentialscommand.EssentialsCommand;
import fr.spectr2155e.essentialscommand.objects.enums.HelpType;
import fr.spectr2155e.essentialscommand.objects.enums.Message;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class WarpManager {
    public static void createWarp(Player sender, String name, Location location){
        FileConfiguration warps = YamlConfiguration.loadConfiguration(EssentialsCommand.fileManager.getFile("warps"));
        if(warps.get("warps.list."+ name +".location") == null) {
            warps.set("warps.list." + name + ".location", location);
            if(warps.getStringList("warps.listall") != null){ ArrayList warpsList = (ArrayList) warps.getStringList("warps.listall"); warpsList.add(name); warps.set("warps.listall", warpsList);}
            else {ArrayList warpsList = new ArrayList<>(); warpsList.add(name); warps.set("warps.listall", warpsList);}
            Message.CreateWarpSuccessfull.send(sender, name);
            EssentialsCommand.fileManager.saveConfig(warps, "warps");
        } else Message.CannotCreateWarp.send(sender);
    }

    public static void removeWarp(CommandSender sender, String name){
        FileConfiguration warps = YamlConfiguration.loadConfiguration(EssentialsCommand.fileManager.getFile("warps"));
        if(warps.get("warps.list."+name+".location") != null) {
            warps.set("warps.list." + name, null);
            ArrayList warpsList = (ArrayList) warps.getStringList("warps.listall");
            warpsList.remove(name);
            warps.set("warps.listall", warpsList);
            Message.RemoveWarpSuccessfull.send(sender, name);
            EssentialsCommand.fileManager.saveConfig(warps, "warps");
        } else Message.CannotRemoveWarp.send(sender);
    }

    public static void teleportWarp(Player player, String name){
        FileConfiguration warps = YamlConfiguration.loadConfiguration(EssentialsCommand.fileManager.getFile("warps"));
        System.out.println(player);
        if(warps.get("warps.list."+name+".location") != null){
            player.teleport((Location) warps.get("warps.list."+name+".location"));
            Message.TeleportWarpSuccessfull.send(player, name);
        } else Message.WarpNotFound.send(player);
    }

    public static void teleportWarpOther(CommandSender sender, Player player, String name){
        FileConfiguration warps = YamlConfiguration.loadConfiguration(EssentialsCommand.fileManager.getFile("warps"));
        if(warps.get("warps.list."+name+".location") != null){
            player.teleport((Location) warps.get("warps.list."+name+".location"));
            Message.TeleportWarpSuccessfull.send(player, name);
            Message.TeleportWarpSuccessfullOther.send(sender, name);
        } else Message.WarpNotFound.send(sender);
    }

    public static void listWarp(CommandSender sender){
        FileConfiguration warps = YamlConfiguration.loadConfiguration(EssentialsCommand.fileManager.getFile("warps"));
        if(!warps.getStringList("warps.listall").isEmpty()){
            ArrayList<String> warpsList = (ArrayList) warps.getStringList("warps.listall");
            TextComponent listWarps = new TextComponent("§a["); //ChatColor.DARK_GRAY+""+ChatColor.BOLD+"("+ChatColor.DARK_AQUA+""+ChatColor.BOLD+"WARP"+ChatColor.DARK_GRAY+""+ChatColor.BOLD+") "+ChatColor.WHITE+"Les warps sont: "+ChatColor.GREEN+
            for(String args : warpsList){
                TextComponent message = new TextComponent("§a"+args + ", ");
                if(warpsList.get(warpsList.size() - 1) == args) {
                    message = new TextComponent("§a"+args);
                }
                message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§aSe téléporter au warp §e"+args+"§a.").create()));
                message.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/warp tp " + args));
                listWarps.addExtra(message);
            } listWarps.addExtra("§a]");
            TextComponent first = new TextComponent("§8(§3WARP§8) §fLes warps sont: ");
            sender.spigot().sendMessage(first, listWarps);


        } else Message.NoWarp.send(sender);
    }

    public static void helpWarp(CommandSender sender){
        sender.sendMessage(HelpType.WARPHELP0.getText());
        sender.sendMessage(HelpType.WARPHELP1.getText());
        sender.sendMessage(HelpType.WARPHELP2.getText());
        sender.sendMessage(HelpType.WARPHELP3.getText());
        sender.sendMessage(HelpType.WARPHELP4.getText());
        sender.sendMessage(HelpType.WARPHELP5.getText());
    }
}
