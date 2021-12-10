package ModuleV;

public class StringUtil {

    public static String getText(String text){
        if (text.length() < 10){
            return text;
        }
        else {
            return text.substring(0, 7) + "...";
        }
    }
}
