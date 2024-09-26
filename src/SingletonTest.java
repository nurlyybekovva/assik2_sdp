public class SingletonTest {
    public static void main(String[] args) {
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        dbc1.connect();
        DatabaseConnection dbc2 = DatabaseConnection.getInstance();
        dbc2.connect();

        if (dbc1 == dbc2){
            System.out.println("Instances are the same");
        }
        else {
            System.out.println("Different instances");
        }
        dbc1.disconnect();
    }
}
