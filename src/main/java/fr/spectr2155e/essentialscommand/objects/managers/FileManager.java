package fr.spectr2155e.essentialscommand.objects.managers;

import fr.spectr2155e.essentialscommand.EssentialsCommand;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public void createFile(String Filename){
        if(!EssentialsCommand.instance.getDataFolder().exists()){
            EssentialsCommand.instance.getDataFolder().mkdir();
        }

        File file = new File(EssentialsCommand.instance.getDataFolder(), Filename + ".yml");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public File getFile(String fileName){return new File(EssentialsCommand.instance.getDataFolder(), fileName + ".yml");}

    public void saveConfig(FileConfiguration file, String str){
        try {
            file.save(getFile(str));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initFiles(){
        createFile("warps");
    }

}
