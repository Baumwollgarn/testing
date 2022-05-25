package javaTesting.Resources;

public class AppParameters {

    public static final String DOMAIN = "127.0.0.1";

    public static final String PORT = "80";

    public static String getDomain() {
        return "https://" + DOMAIN + ":" + PORT;
    }

    public static String getPort() {
        return PORT;
    }


}
