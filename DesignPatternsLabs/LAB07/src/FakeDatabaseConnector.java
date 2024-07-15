public class FakeDatabaseConnector {
    private static FakeDatabaseConnector instance;
    private boolean connected;


    private FakeDatabaseConnector() {
        this.connected = false;
    }


    public static FakeDatabaseConnector getInstance() {
        if (instance == null) {
            instance = new FakeDatabaseConnector();
        }
        return instance;
    }


    public void connect() {
        if (!connected) {
            System.out.println("Connecting to the fake database...");
            connected = true;
            System.out.println("Connected.");
        } else {
            System.out.println("Already connected.");
        }
    }


    public void disconnect() {
        if (connected) {
            System.out.println("Disconnecting from the fake database...");
            connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }


    public void executeQuery(String query) {
        if (connected) {
            System.out.println("Executing query: " + query);

            System.out.println("Query executed successfully.");
        } else {
            System.out.println("Cannot execute query. No connection established.");
        }
}}
