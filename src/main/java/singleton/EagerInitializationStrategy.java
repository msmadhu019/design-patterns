package singleton;

public class EagerInitializationStrategy {

    private static final EagerInitializationStrategy instance = new EagerInitializationStrategy();

    private String databaseUrl;
    private String apiKey;

    private EagerInitializationStrategy() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    public static EagerInitializationStrategy getInstance() {
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public static void main(String[] args) {
        System.out.println(instance.databaseUrl);
        System.out.println(instance.apiKey);
    }
}
