package finalprojectpbo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config {
    private static Connection MySQLConfig;
   
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/tubespbo";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user,pass);
        }catch(SQLException e){
            System.out.println("Connection Failed!! "+ e.getMessage());
        }
        return MySQLConfig;
    }
}
