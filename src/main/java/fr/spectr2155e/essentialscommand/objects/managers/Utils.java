package fr.spectr2155e.essentialscommand.objects.managers;

public class Utils {
    public boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
