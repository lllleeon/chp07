package jdbc;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainJDBCTest {
    private static ObjectInputStream pstmt;

    public static void main(String[] args) {
        Connection con = JDBCConnector.getConnection();
        String sql = "select 주문고객, 제품명, 수량 from 주문 o, 제품 p " +
                                    "           where o.주문제품 = p.제품번호";
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();
            while (result.next()) {
                String customerId = result.getString("주문고객");
                String productId = result.getString("제품명");
                int count = result.getInt("수량");
                System.out.printf("- 주문고객명: %s \t- 주문제품명: %s\t- 수량: %d \n", customerId, productId, count);
            }

        } catch (SQLException e) {
            System.out.println("문장객체생성엠ㄴ네가 발생했습ㄴ다");
            System.out.println(e);
        }


        try {
            pstmt.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
