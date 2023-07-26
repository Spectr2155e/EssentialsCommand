package fr.spectr2155e.essentialscommand.objects.enums;

public enum HelpType {

    WARPHELP0("§7§m------------------§r §e§lWarp §7§m------------------"),
    WARPHELP1("§e§l/warp create [nom]: §fCréer un warp."),
    WARPHELP2("§e§l/warp remove [nom]: §fSupprime un warp."),
    WARPHELP3("§e§l/warp teleport [nom] [joueur]: §fTéléporte un joueur ou se téléporté à un warp."),
    WARPHELP4("§e§l/warp list: §fAffiche tous les warps du serveur"),
    WARPHELP5("§7§m------------------------------------------");

    String text;
    HelpType(String text){this.text = text;}

    public String getText(){
        return text;
    }

}
