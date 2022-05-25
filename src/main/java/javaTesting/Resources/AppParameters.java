package javaTesting.Resources;

public class AppParameters {

    public static final String DOMAIN = "127.0.0.1";

    public static final String PORT = "80";

    // public static final Object BD_CON = new ClasseConnexioBBDD();

    // public static Object MESSAGES_TRANSLATIONS;

    // Implement SINGLETON PATTERN
    private static AppParameters instance ;

    public AppParameters() {

    }

    private void init() {
        instance = new AppParameters();
    }

    public void reset() {
        instance = null;
    }
    public static AppParameters getInstance() {
        if (instance == null) {
            instance = new AppParameters();
        }
        return instance;
    }

    public static String getDomain() {
        return "https://" + DOMAIN + ":" + PORT;
    }

}
