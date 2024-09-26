public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private DatabaseConnection(){
    };
    public static DatabaseConnection getInstance(){
        if (instance==null){
            synchronized (DatabaseConnection.class){
                if (instance==null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void connect(){
        System.out.println("Connected to the database");
    }

    public void disconnect(){
        System.out.println("Disconnected from the database");
    }
}
