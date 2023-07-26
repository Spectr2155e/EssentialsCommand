package fr.spectr2155e.essentialscommand.objects.enums;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import static fr.spectr2155e.essentialscommand.objects.enums.MessageType.*;

public enum Message {

    // ChangePassword //
    NewPasswordInit(AUTH, "Votre nouveau mot de passe est désormais §a%arg%§f."),
    Specify6Char(ERROR, "Veuillez préciser un mot de passe contenant plus de 6 caractères."),
    CannotChangeBySame(ERROR, "Vous ne pouvez pas changer le mot de passe par le même."),
    SpecifyOldPassword(ERROR, "Veuillez entrer en premier votre mot de passe actuel."),
    UseCommandChangePassword(USECOMMAND , "/changepassword [ancien mdp] [nouveau mdp]."),

    // Login //
    ConnectionSuccess(AUTH, "§aConnexion réussie..."),
    ConnectionSuccessIp(AUTH, "§aConnexion via IP réussie..."),
    WrongPassword(ERROR, "Mauvais mot de passe..."),
    UseCommandLogin(USECOMMAND,  "/login [mot de passe]."),

    // Register //
    NewPasswordIs(AUTH,  "Votre mot de passe est désormais §a%arg%§f."),
    Specify2SamePasswords(ERROR, "Veuillez préciser 2 mots de passes identiques."),
    SpecifyPasswordWith6Char(ERROR, "Veuillez préciser un mot de passe contenant plus de 6 caractères."),
    UseCommandRegister(USECOMMAND, "/register [mot de passe] [mot de passe]."),

    // ResetPassword //
    ResetPassword(AUTH, "Le mot de passe du joueur a été §créinitialisé§f."),
    ResetPasswordOther(AUTH,"Votre mot de passe a été §créinitialisé§f."),
    UseCommandReset(ERROR, "/resetpassword [joueur]."),

    // Show IP //
    UseCommandShowIp(USECOMMAND,"/showip [joueur]."),
    NotRegisteredIp(ERROR, "Le joueur n'a pas d'adresse IP enregistré"),
    IpOfPlayer(AUTH, "L'adresse IP du joueur est §a%arg%§f."),

    // Show Password //
    UseCommandShowPassword(USECOMMAND, "/showpassword [joueur]."),
    NotPasswordRegistered(ERROR, "Le joueur n'a pas de mot de passe enregistré"),
    PasswordIs(AUTH, "Le mot de passe du joueur est §a%arg%§f."),

    // Listener Auth //
    NeedRegistered(ERROR, "Vous ne pouvez pas faire cela. Veuillez vous enregistrer."),

    // Identity //
    IdentityChoiceFirstName(ID, "Veuillez entrer dans le chat le prénom que vous voulez choisir."),
    IdentityChoiceSecondName(ID, "Veuillez entrer dans le chat le nom de famille que vous voulez choisir."),
    IdentityChoiceAge(ID, "Veuillez entrer dans le chat l'âge que vous voulez choisir. §7(18 ans+ pour être majeur)"),
    IdentityChoiceGender(ID, "Veuillez entrer dans le chat le sexe que vous voulez choisir. §7(Femme/Homme)"),
    DontUseInt(ERROR, "Veuillez ne pas utiliser de nombre ou de chiffre dans votre prénom/nom de famille, Réessayez..."),
    DontUseChar(ERROR, "Veuillez ne pas utiliser de lettres ou de mots pour votre âge, Réessayez..."),
    Precise80_1(ERROR, "Veuillez préciser un âge supérieur à 1 an et inférieur à 80 ans, Réessayez..."),
    PreciseAllItems(ERROR, "Veuillez préciser toutes les informations avant de confirmer."),
    IdCardCreate(ID, "Votre carte d'identité a été §acréer §fveuillez regarder sur vous."),
    Gender(ERROR, "Veuillez préciser homme/femme, Réessayez.."),
    NewFirstName(ID, "Votre prénom est désormais §a%arg%"),
    NewSecondName(ID, "Votre nom de famille est désormais §a%arg%"),
    NewAge(ID, "Votre âge est désormais §a%arg%"),
    NewGender(ID, "Votre sexe est désormais §a%arg%"),

    // Afk Test //
    UseCommandAfkTest(USECOMMAND, "/afktest [joueur]."),
    AfkTestSuccess(AFK, "Commande de test d'AFK exécuté avec succès"),
    AfkTestCheck(AFK, "Vous avez §aréussi §fle test AFK."),

    // Fly //
    DisableFly(FLY, "Votre fly est maintenant §cdésactivé§f."),
    ActiveFly(FLY, "Votre fly est maintenant §aactivé§f."),
    UseCommandFly(USECOMMAND, "/fly."),

    // Freeze //
    UseCommandFreeze(USECOMMAND, "/freeze [joueur]."),
    Unfreeze (FREEZE, "Vous avez été unfreeze."),
    UnfreezeOther (FREEZE, "Le joueur sélectionné a été §bunfreeze§f."),
    Freeze (FREEZE, "Vous avez été freeze."),
    FreezeOther (FREEZE, "Le joueur sélectionné a été §bfreeze§f."),
    CantDoFreeze(ERROR, "Vous ne pouvez pas faire cela, vous êtes freeze."),

    // Gamemode //
    SurvivalSet (GAMEMODE, "Votre mode de jeu est maintenant en §esurvie§f."),
    CreativeSet (GAMEMODE, "Votre mode de jeu est maintenant en §ecréatif§f."),
    AdventureSet(GAMEMODE, "Votre mode de jeu est maintenant en §eaventure§f."),
    SpectatorSet(GAMEMODE, "Votre mode de jeu est maintenant en §espectateur§f."),
    SpecifyCorrectNumber(ERROR, "Veuillez préciser un nombre correct ou un mode de jeu correct"),
    ChangeOther(GAMEMODE, "Vous venez de changer le mode de jeu du joueur séléctionné."),
    DontSelectPlayer(ERROR, "Veuillez utiliser la commande simplement sans sélectionné de joueur."),
    SpecifyRightPlayer(ERROR, "Veuillez préciser un nom de joueur correct"),

    // Invsee //
    UseCommandInvsee(USECOMMAND, "/invsee [joueur]."),
    CantSeeHisInventory(ERROR, "Vous ne pouvez pas regarder votre propre inventaire."),

    // RandomTP //
    UseCommandRandomTP(USECOMMAND,"/randomtp."),
    NobodyConnectedExceptYou(ERROR, "Aucune personne à part vous est connecté."),
    TeleportToPlayer(RTP, "Vous avez été téléporté au joueur §e%arg%§f."),

    // Speed //
    UseCommandSpeed(USECOMMAND, "/speed [0-10]"),
    SpecifyNumbersSpeed(ERROR, "Veuillez indiquer un nombre de 0 et 10"),
    WalkSpeed(SPEED, "Votre vitesse de marche est maintenant de §e%arg%§f."),
    FlySpeed(SPEED, "Votre vitesse de vol est maintenant de §e%arg%§f."),

    // Vanish //
    VanishOn(VANISH, "Vanish §aactivé§f, seul les modérateurs peuvent vous voir."),
    VanishOff(VANISH, "Vanish §cdésativé§f, toutes les personnes peuvent te voir."),
    VanishPlayerOffline(ERROR, "Le joueur sélectionné n'est pas connecté."),

    // VanishPlus //
    VanishPlusOn(VANISHPLUS, "Vanish+ §aactivé§f, seul les modérateurs peuvent vous voir."),
    VanishPlusOff(VANISHPLUS, "Vanish+ §cdésativé§f, toutes les personnes peuvent te voir."),
    VanishPlusPlayerOffline(ERROR, "Le joueur sélectionné n'est pas connecté."),

    // Report //
    UseCommandReport(USECOMMAND, "/report [joueur]."),
    CannotReportSelf(ERROR, "Vous ne pouvez pas vous report vous-même."),

    // Report Show //
    UseCommandReportShow(USECOMMAND, "/reportshow."),

    // Player - Msg //
    UseCommandMsg(USECOMMAND, "/msg [joueur] [message]."),
    CannotMsgHimSelf(ERROR, "Vous ne pouvez pas vous envoyer de message privé à vous-même."),
    MessageOther(MSG, "§e%arg% §8> §f%arg%"),
    MessagePlayer(MSG, "§e%arg% §8> §f%arg%"),

    // Player - Respond //
    UseCommandRespond(USECOMMAND, "/r [message]."),
    NobodyToRespond(ERROR, "Vous n'avez personne à qui répondre un message."),


    // Warp //
    UseCommandWarp(USECOMMAND, "/warp [create/remove/teleport/list]"),
    UseCommandCreateWarp(USECOMMAND, "/warp create [nom]"),
    UseCommandRemoveWarp(USECOMMAND, "/warp remove [nom]"),
    UseCommandTeleportWarp(USECOMMAND, "/warp teleport [nom] [joueur]"),
    UseCommandListWarp(USECOMMAND, "/warp list"),
    UseCommandHelpWarp(USECOMMAND, "/warp help"),
    TeleportWarpSuccessfull(WARP, "Téléportation effectué au warp §e%arg%§f."),
    CannotRemoveWarp(ERROR, "Aucun warp n'existe à ce nom."),
    CannotCreateWarp(ERROR, "Un warp existe déjà à ce nom."),
    CreateWarpSuccessfull(WARP, "Warp §e%arg% §fcréé avec succès."),
    RemoveWarpSuccessfull(WARP, "Warp §e%arg% §fsupprimé avec succès."),
    WarpNotFound(ERROR, "Aucun warp n'existe à ce nom."),
    TeleportWarpSuccessfullOther(WARP, "Téléportation effectué au warp §e%arg%§f pour le joueur sélectionné."),
    CannotWarpTpSelf(ERROR, "Veuillez simplement utilisé la commande /warp tp %arg%."),
    NoWarp(ERROR, "Il n'y a aucun warp créé sur le serveur."),

    // StaffRoom //
    NotDisponbibleRoom(ERROR, "§cIl n'y a aucune salle disponible."),
    PlayerStaffRoomTeleport(STAFFROOM, "Vous avez téléporté le joueur §7%arg% §fdans la salle §en°%arg%§f."),
    PlayerStaffRoomTeleported(STAFFROOM, "Vous avez été téléporté dans une salle de staff !"),

    // Repeated Message //
    noPermission (ERROR, "Vous ne pouvez pas utiliser cette commande."),
    console (ERROR,"§cConsole -> Vous ne pouvez pas utiliser cette commande. <- Console"),
    neverConnected (ERROR,"§cLe joueur ne s'est jamais connecté au serveur."),
    NotConnected (ERROR, "§cLe joueur n'est pas connecté au serveur.");


    String text;

    Message(MessageType type, String text){this.text = type.text + text;}

    public void send(CommandSender src, String... args) { src.sendMessage(getText(args)); }

    public void broadcast(String... args) { Bukkit.broadcastMessage(getText(args)); }

    public String getText(String... args) {
        if(args.length == 0) return text;

        String newText = text;
        for (String arg : args) newText = newText.replaceFirst("%arg%", arg);
        return newText;}
}

enum MessageType {
    ERROR("§8§l(§4§lERREUR§8§l) §c"),
    AUTH("§8§l(§3§lA2F§8§l) §f"),
    ID("§8§l(§6§lID§8§l) §f"),
    AFK ("§8§l(§6§lAFK§8§l) §f"),
    FLY ("§8§l(§e§lFLY§8§l) §f"),
    FREEZE ("§8§l(§b§lFREEZE§8§l) §f"),
    GAMEMODE ("§8§l(§e§lGAMEMODE§8§l) §f"),
    RTP ("§8§l(§3§lRTP§8§l) §f"),
    SPEED ("§8§l(§9§lSPEED§8§l) §f"),
    VANISH("§8§l(§3§lVANISH§8§l) §f"),
    VANISHPLUS("§8§l(§3§lVANISH§9§l+§8§l) §f"),
    WARP ("§8§l(§3§lWARP§8§l) §f"),
    STAFFROOM ("§8§l(§c§lSTAFFROOM§8§l) §f"),
    MSG("§8§l(§3§lMSG§8§l) §f"),
    USECOMMAND(ERROR.text + "Veuillez utiliser la commande ");

    String text;
    MessageType(String text){this.text = text;}
}
