import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// test inicial aprendiendo a conectar base de datos mysql a java
public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from reservas");
            while ((resultSet.next())){
                    System.out.println(resultSet.getString("forma_pago"));
            }
        } catch (Exception e){
                e.printStackTrace();
        }
    }
}