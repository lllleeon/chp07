
package jdbc2.entity.controller;
import jdbc.JDBCConnector;
import jdbc2.entity.Customer;
import jdbc2.entity.entity.Customer;
import jdbc2.entity.view.CustomerView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;import java.sql.SQLException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
      //  연결 객체 반환
         Connection con = JDBCConnector.getConnection();
       //  문장 객체 반환
        String sql ="select * from 고객";
        PreparedStatement pstmt = null;
         ArrayList<Customer> customerList = new ArrayList<Customer>();
    try {
         pstmt = con.prepareStatement(sql);
         ResultSet result = pstmt.executeQuery();

         while (result.next()) {
             customer = new Customer();
             customer.setCustomerName(result.getString("고객이름"));
             customer.setAge(result.getInt("나이"));
             customer.setLevel(result.getString("등급"));
             customer.setJob(result.getString("직업"));
             customer.setReward(result.getInt("적립금"));
             customerList.add(customer);
         }
             pstmt.close();
            con.close();
         } catch (SQLException e) {
            System.out.println(e);
         }
        CustomerView view = new CustomerView();
        view.printHead();
        for (Customer custom : customerList){
            view.printCustomer(custom);
        }

        view.printFooter();
    }
}