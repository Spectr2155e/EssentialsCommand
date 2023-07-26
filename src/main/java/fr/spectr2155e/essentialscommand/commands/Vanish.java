package fr.spectr2155e.essentialscommand.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.ArrayList;

public class Vanish implements CommandExecutor, Listener {

    public ArrayList<Player> vanished = new ArrayList<>();

    public void vanishPlayer(Player player){
        if(!vanished.contains(player)){
            vanished.add(player);
            player.sendMessage("§8§l(§3§lVANISH§8§l) §fVous avez été rendu invisible aux autres joueurs.");
            for(Player p : Bukkit.getOnlinePlayers()){p.hidePlayer(player);}
            return;
        }
        vanished.remove(player);
        player.sendMessage("§8§l(§3§lVANISH§8§l) §fVous avez été rendu visible aux autres joueurs.");
        for(Player p : Bukkit.getOnlinePlayers()){p.showPlayer(player);}
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
        if(!cmd.getName().equalsIgnoreCase("vanish")){return false;}
        if(!(sender instanceof Player)){
            sender.sendMessage("§8§l(§4§lErreur§8§l) §cVous ne pouvez pas faire cette commande. <- Console");
            return false;
        }
        vanishPlayer((Player) sender);
        return false;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        for(Player player : vanished){
            e.getPlayer().hidePlayer(player);
        }
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        if(vanished.contains(e.getPlayer())){
            vanished.remove(e.getPlayer());
        }
    }
}
