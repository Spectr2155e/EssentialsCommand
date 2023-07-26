package fr.spectr2155e.essentialscommand.objects.managers;

import fr.spectr2155e.essentialscommand.EssentialsCommand;
import fr.spectr2155e.essentialscommand.commands.Vanish;
import org.bukkit.event.Listener;

public class ListenerManager {
    private void createListener(Listener lst){
        EssentialsCommand.instance.getServer().getPluginManager().registerEvents(lst, EssentialsCommand.instance);
    }
    public void initListeners(){
        createListener(new Vanish());
    }
}
