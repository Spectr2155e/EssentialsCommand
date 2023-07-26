package fr.spectr2155e.essentialscommand.commands.warp.manager;

import fr.spectr2155e.essentialscommand.EssentialsCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TabWarpCompletion implements TabCompleter {

    List<String> arguments = new ArrayList<>();

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String s, String[] args) {
        if(arguments.isEmpty()){
            arguments.add("create"); arguments.add("remove");
            arguments.add("list"); arguments.add("teleport");
            arguments.add("help");
        }
        List<String> result = new ArrayList<>();
        if(args.length == 1){
            for(String str : arguments){
                if(str.toLowerCase().startsWith(args[0].toLowerCase())){
                    result.add(str);
                }
            }
            return result;
        }
        if(args[0].equals("remove")){
            if(args.length == 2) {
                FileConfiguration warps = YamlConfiguration.loadConfiguration(EssentialsCommand.fileManager.getFile("warps"));
                List<String> listwarps = warps.getStringList("warps.listall");
                for (String str : listwarps) {
                    result.add(str);
                }
            }
            return result;
        }
        if(args[0].equals("teleport") || args[0].equals("tp")){
            if(!(args.length > 2)) {
                FileConfiguration warps = YamlConfiguration.loadConfiguration(EssentialsCommand.fileManager.getFile("warps"));
                List<String> listwarps = warps.getStringList("warps.listall");
                for (String str : listwarps) {
                    result.add(str);
                }
            } else {
                if(args.length == 3) {
                    for (Player str : Bukkit.getOnlinePlayers()) {
                        String strm = str.getName();
                        result.add(strm);
                    }
                }
            }
            return result;
        }
        if(args[0].equals("create")){
            result.clear();
            return result;
        }
        if(args[0].equals("list")){
            result.clear();
            return result;
        }
        return null;
    }
}
