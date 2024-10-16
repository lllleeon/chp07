package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    private static Connection con;
    private static  final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
    private static final String USER_NAME = "c##minn2";
    private static final String PASSWORD = "1234";

    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("JDBC Driver ㅈㅇ상 롣이서공");
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            System.out.println("oracle db랑영공겴옹");
        }catch (ClassNotFoundException e){
            System.out.println("oracle jdc drver 파일을팣지못핶ㅆ음비낟");
        }catch (SQLException e){
            System.out.println("oracle db와 련결이 되지안앖음ㅇㅂ!");
        }
        return con;
    }
}
