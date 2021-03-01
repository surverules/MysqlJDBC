import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLQuery {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachin",
                    "root", "parth123");
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("select * from CUSTOMERS");
            while (set.next()){
                System.out.print("Id: " + set.getInt(1));
                System.out.print("|| Name: " + set.getString(2));
                System.out.println();
            }
        }  catch (Exception e){
            System.out.println("Exception in Query : " + e);
        }
    }
}
