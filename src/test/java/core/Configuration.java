package core;

public class Configuration {
    private static String URL = System.getenv("URL");
    private static String BROWSER = System.getenv("BROWSER");

    public String getURL(){
        return URL;
    }

    public String getBROWSER(){
        return BROWSER;
    }
}