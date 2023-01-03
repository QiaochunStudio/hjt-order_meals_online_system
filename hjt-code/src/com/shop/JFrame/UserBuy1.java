package com.shop.JFrame;
/***用户购买商品界面***/

import com.shop.mysql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.*;

public class UserBuy1 extends JFrame {

    static final String driverClass="com.mysql.jdbc.Driver";
    static final String	connStr="jdbc:mysql://192.168.1.3:3307/mall_work?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    static final String	user="root";
    static final String pass="123456";

    static Connection conn;    //声明Connection对象
    static PreparedStatement pres;    //向数据库发送SQL语句
    static ResultSet res;    //执行数据库查询

    private final JPanel contenctPanel = new JPanel();

    private final JTextField field = new JTextField(10);
    private final JTextField field1 = new JTextField(10);

    private final JLabel label = new JLabel();
    private final JLabel label0 = new JLabel();
    private final JLabel label1 = new JLabel();
    private final JLabel label2 = new JLabel();
    private final JLabel label3 = new JLabel();
    private final JLabel label4 = new JLabel();

    private final JButton button = new JButton();
    private final JButton button1 = new JButton();
    /*新增加的*/
    private final JButton button2 = new JButton();

    private final Box base = Box.createVerticalBox();
    private final Box box = Box.createHorizontalBox();
    private final Box box1 = Box.createHorizontalBox();
    private final Box box2 = Box.createHorizontalBox();
    private final Box box3 = Box.createHorizontalBox();
    private final Box box4 = Box.createHorizontalBox();
    private final Box box5 = Box.createHorizontalBox();
    private final Box box6 = Box.createHorizontalBox();
    private final Box box7 = Box.createHorizontalBox();
    private JTextArea text = new JTextArea();


    private PreparedStatement pstmt = null;


    private String username;

    public void getName(String name) {
        this.username = name;
    }

    public UserBuy1(String username) {
        setTitle("欢迎使用  网上订餐系统");
        setBounds(300, 100, 900, 900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        contenctPanel.setBackground(Color.WHITE);
        label.setText("网上订餐系统");
        label.setFont(new Font("微软雅黑", 1, 32));
        label.setForeground(Color.BLUE);

        label0.setText("用  户  购  买  菜  品  界  面\n");
        label0.setFont(new Font("微软雅黑", 1, 25));


        label1.setText("欢迎  " + username + "  VIP用户");
        label1.setFont(new Font("微软雅黑", 0, 20));

        text.setSize(800, 800);
        DBconnection db = new DBconnection();
        conn = db.getConn();
        try {
            pres = conn.prepareStatement("select * from address where username = ?");
            pres.setString(1, username);
            res = pres.executeQuery();
            text.append("收 货 序 号     " + "                收 货 地 址 " + "                          收  货   人 " + "                联  系  电  话 " + "\n");
            while (res.next()) {
                int id = res.getInt("addressID");
                String address = res.getString("address");
                String addressName = res.getString("addressName");
                String mobile = res.getString("mobile");
//				BigDecimal money = res.getBigDecimal("goodsMoney");
//				int num = res.getInt("goodsNum");
                text.append("\n " + id + "\t " + address + "\t " + addressName + "\t " + mobile + "\t   " + "\n");
            }
            res.close();
            pres.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        JScrollPane scroll = new JScrollPane(text);
        scroll.setSize(800, 800);



        label3.setText("请 输 入 要 修 改 收 货 的 序 号：");
        label3.setFont(new Font("微软雅黑", 0, 18));

        label4.setText("请 输 入 要 修 改 收 货 的 地 址：");
        label4.setFont(new Font("微软雅黑", 0, 18));

        button.setText("确  定  修 改 ");
        button.setFont(new Font("微软雅黑", 0, 18));
        button.addActionListener(new Myaction());


        button2.setText("确  定  删 除 ");
        button2.setFont(new Font("微软雅黑", 0, 18));
        button2.addActionListener(new Myaction1());

        button1.setText("返回用户服务选择界面");
        button1.setFont(new Font("微软雅黑", 1, 18));
        button1.setBorderPainted(false);
        button1.setBackground(Color.WHITE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button1) {
                    dispose();
                    UserSelect select = new UserSelect(username);
                    select.getName(username);

                }
            }
        });

        box.add(label);
        box1.add(label0);
        box2.add(label1);
        box3.add(scroll);
        box4.add(label2);
        box5.add(label3);
        box5.add(field);
        box6.add(label4);
        box6.add(field1);
        box7.add(button);
        box7.add(button1);
        box7.add(button2);

        base.add(box);
        base.add(Box.createVerticalStrut(20));
        base.add(box1);
        base.add(Box.createVerticalStrut(20));
        base.add(box2);
        base.add(Box.createVerticalStrut(20));
        base.add(box3);
        base.add(Box.createVerticalStrut(20));
        base.add(box4);
        base.add(Box.createVerticalStrut(30));
        base.add(box5);
        base.add(Box.createVerticalStrut(40));
        base.add(box6);
        base.add(Box.createVerticalStrut(40));
        base.add(box7);
        base.add(Box.createVerticalStrut(40));

        contenctPanel.add(base);
        add(contenctPanel);
        setVisible(true);
    }

    class Myaction extends JFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //修改收货地址
            int addressID = Integer.parseInt(field.getText());
            String address = field1.getText();

                if (prepareMySql("update address set address = \'" + address + "\' where username = \'" + username + "\'  and addressID =  \'" + addressID + "\' ")) {
                    try {
//                pstmt.setInt(1,extent);
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "收货地址修改 成 功 ！", "修改成功", JOptionPane.DEFAULT_OPTION);

                    } catch (Exception exception) {
                        exception.printStackTrace();
                    } finally {
                        closeMySql();
                    }
                }



        }


    }


    class Myaction1 extends JFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //删除收货地址
            int addressID = Integer.parseInt(field.getText());
            if (prepareMySql("delete from address where addressID = ? ")) {
                try {
                pstmt.setInt(1,addressID);
                    int i = pstmt.executeUpdate();
                    if(i>=1){
                        JOptionPane.showMessageDialog(null, "删除 成 功 ！", "删除成功", JOptionPane.DEFAULT_OPTION);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "删除 失 败 ！", "删除成功", JOptionPane.DEFAULT_OPTION);

                    }


                } catch (Exception exception) {
                    exception.printStackTrace();
                } finally {
                    closeMySql();
                }
            }
        }
    }
    public  boolean prepareMySql(String sql) {
        try {
            conn = DriverManager.getConnection(connStr, user, pass);
            pstmt = conn.prepareStatement(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public void closeMySql() {
        if (conn != null) {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




}
