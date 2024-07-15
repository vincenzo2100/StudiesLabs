public class Main {
    public static void main(String[] args) {
        FakeDatabaseConnector dbConnector1 = FakeDatabaseConnector.getInstance();
        dbConnector1.connect();
        dbConnector1.executeQuery("SELECT id FROM users");
        dbConnector1.disconnect();

        FakeDatabaseConnector dbConnector2 = FakeDatabaseConnector.getInstance();
        dbConnector2.connect();
        dbConnector2.executeQuery("SELECT * FROM orders");
        dbConnector2.disconnect();

        System.out.println(dbConnector1 == dbConnector2);
    }
}
