package core;

public class Configuration {
    private static String URL = System.getenv("URL");
    private static String BROWSER = System.getenv("BROWSER");

    public static String getURL(){
        return URL;
    }

    public static String getBROWSER(){
        return BROWSER;
    }
}
