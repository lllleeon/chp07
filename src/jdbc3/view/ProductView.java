package jdbc3.view;
import jdbc.JDBCConnector;
import jdbc3.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductView {
    public void printHeader() {
        System.out.println("****************************");
        System.out.println("******* Product list *******");
        System.out.println("****************************");
    }

    public void printFooter() {
        System.out.println("****************************");
        System.out.println("******* End print*** *******");
        System.out.println("****************************");
    }

    public void printProduct(ArrayList<Product> proList) {
        for (Product product : proList) {
            System.out.println("*제품번호:" + product.getProductNum());
            System.out.println("*제품명:" + product.getProductName());
            System.out.println("*재고량:" + product.getProStock());
            System.out.println("*단가:" + product.getProPrice());
            System.out.println("*제조업체:" + product.getProduceName());
            System.out.println();

        }
    }
        public static void printView (ArrayList < Product > arrList) {
            ProductView view = new ProductView();
            view.printHeader();
            view.printProduct(arrList);
            view.printFooter();
        }
    }


