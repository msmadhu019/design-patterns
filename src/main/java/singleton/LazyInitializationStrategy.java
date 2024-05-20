package singleton;

public class LazyInitializationStrategy {
    private static LazyInitializationStrategy instance;

    private String databaseUrl;
    private String apiKey;

    private LazyInitializationStrategy() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    public static LazyInitializationStrategy getInstance() {
        if (instance == null) {
            synchronized (LazyInitializationStrategy.class) {
                instance = new LazyInitializationStrategy();
            }
        }
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

    public void displayConfiguration() {
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("API Key: " + apiKey);
    }

    public void printConfigurationManager() {
        System.out.println("ConfigurationManagerInfo - " +
                this.getClass().getSimpleName() + " - " +
                this.hashCode());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazyInitializationStrategy instance = LazyInitializationStrategy.getInstance();
                instance.printConfigurationManager();
            }).start();
        }

        System.out.println(LazyInitializationStrategy.class.getSimpleName());
    }
}
