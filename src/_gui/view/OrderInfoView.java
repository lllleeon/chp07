package _gui.view;
import _gui.entity.OrderEntity;
import _gui.repository.OrderRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;

public class OrderInfoView extends JPanel {
    public OrderInfoView() {
        setLayout(new BorderLayout(5, 20));

        panN.add(pan1);
        panN.add(pan2);

        add(panN, "North");
        add(panC, "Center");

        addPan1();
        addPan2();
        addTable();
        initList("");
    }

    public void addPan1(){
        JLabel lblTitle = new JLabel("검색 프로그램");
        pan1.add(lblTitle);
    }
    public void addPan2(){
        JLabel lblSearch = new JLabel("검색어: ");
        JButton btnSearch = new JButton("검색");
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
    }

    public void addTable(){
        tableModel = new DefaultTableModel(header, 15);

        @Override
        public boolean isCellEditable(int row, int column) { return false; }
    };

    table = new JTable(tableModel);
    TableColumnModel columnModel = table.getColumnModel()
    columnModel.getColumn(0).setPreferredWidth(70);
    columnModel.getColumn(1).setPreferredWidth(100);
    columnModel.getColumn(2).setPreferredWidth(180);
    columnModel.getColumn(3).setPreferredWidth(50);
    columnModel.getColumn(4).setPreferredWidth(200);
    columnModel.getColumn(5).setPreferredWidth(100);

    JScrollPane scrollPane = new JScrollPane(table);
    panC.add(scrollPane);
}

public void initList(){
    OrderRepository orderRepository = new OrderRepository();
    ArrayList<OrderEntity> orderList = orderRepository.getOderList();
    tableModel.setRowCount(orderList.size());
    int i=0;
    for (OrderEntity orderEntity : orderList) {
        tableModel.setValueAt(orderEntity.getOrderNum(), i, 0);
        tableModel.setValueAt(orderEntity.getCustomerName(), i, 1);
        tableModel.setValueAt(orderEntity.getProductName(), i, 2);
        tableModel.setValueAt(orderEntity.getAmout(), i, 3);
        tableModel.setValueAt(orderEntity.getDestination(), i, 4);
        tableModel.setValueAt(orderEntity.getOrderDate(), i, 5);
        i++;
    }
}

