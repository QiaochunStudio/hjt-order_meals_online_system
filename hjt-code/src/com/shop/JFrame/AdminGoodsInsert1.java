package com.shop.JFrame;
/***管理员添加商品信息界面***/

import com.shop.mysql.DBgoodsInsert;
import com.shop.mysql.DBgoodsNamedecide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.*;

public class AdminGoodsInsert1 extends JFrame {

    static final String driverClass = "com.mysql.jdbc.Driver";
    static final String connStr = "jdbc:mysql://192.168.1.3:3307/mall_work?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    static final String user = "root";
    static final String pass = "123456";

    static Connection conn;    //声明Connection对象
    static PreparedStatement pres;    //向数据库发送SQL语句
    static ResultSet res;    //执行数据库查询
    private PreparedStatement pstmt = null;


    private String adminname;

    private final JPanel contenctPanel = new JPanel();

    private final JTextField field = new JTextField(10);//姓名
    private final JTextField field1 = new JTextField(10);//密码
    private final JTextField field2 = new JTextField(10);//身份证号码
    private final JTextField field3 = new JTextField(10);//年龄
    private final JTextField field4 = new JTextField(10);//邮箱地址

    //private final JPasswordField password = new JPasswordField();//密码文本框

    private final JLabel label = new JLabel();//文本标签
    private final JLabel label0 = new JLabel();//文本标签
    private final JLabel label1 = new JLabel();//用户名
    private final JLabel label2 = new JLabel();//密码
    private final JLabel label3 = new JLabel();//身份证号码
    private final JLabel label4 = new JLabel();//年龄
    private final JLabel label5 = new JLabel();//邮箱地址
    private final JLabel label6 = new JLabel();//联系地址

    private final JButton button = new JButton();
    private final JButton button1 = new JButton();

    private final Box base = Box.createVerticalBox();
    private final Box box = Box.createHorizontalBox();
    private final Box box0 = Box.createHorizontalBox();
    private final Box box1 = Box.createHorizontalBox();
    private final Box box2 = Box.createHorizontalBox();
    private final Box box3 = Box.createHorizontalBox();
    private final Box box4 = Box.createHorizontalBox();
    private final Box box5 = Box.createHorizontalBox();
    private final Box box6 = Box.createHorizontalBox();
    private final Box box7 = Box.createHorizontalBox();


    public void getName(String name) {
        this.adminname = name;
    }

    public AdminGoodsInsert1(String adminname) {
        setTitle("欢迎使用  网上订餐系统");
        setBounds(300, 100, 900, 900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        contenctPanel.setBackground(Color.WHITE);
        label.setText("欢迎使用  网上订餐系统");
        label.setFont(new Font("微软雅黑", 1, 32));
        label.setForeground(Color.BLUE);

        label0.setText("添  加  收 货 地  址  界  面\n");
        label0.setFont(new Font("微软雅黑", 1, 25));

        label6.setText("欢迎  " + adminname + "  用户");
        label6.setFont(new Font("微软雅黑", 0, 20));

        label1.setText("收 货 地 址：");
        label1.setFont(new Font("微软雅黑", 0, 18));
        field.addActionListener(new Myaction());

        label2.setText("收 货 人：");
        label2.setFont(new Font("微软雅黑", 0, 18));
        field1.addActionListener(new Myaction());

        label3.setText("联 系 电 话：");
        label3.setFont(new Font("微软雅黑", 0, 18));
        field2.addActionListener(new Myaction());

//		label4.setText("非会员价格：");
//		label4.setFont(new Font("微软雅黑",0,18));
//		field3.addActionListener(new Myaction());
//
//		label5.setText("菜  品 数 量：");
//		label5.setFont(new Font("微软雅黑",0,18));
//		field4.addActionListener(new Myaction());

        button.setText("添加");
        button.setFont(new Font("微软雅黑", 0, 18));
        button.addActionListener(new Myaction());

        button1.setText("返回网上订餐主界面");
        button1.setFont(new Font("微软雅黑", 1, 18));
        button1.setBorderPainted(false);
        button1.setBackground(Color.WHITE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button1) {
                    dispose();
                    UserSelect select = new UserSelect(adminname);
                    select.getName(adminname);


                }
            }
        });

        box.add(label);
        box0.add(label0);
        box1.add(label6);
        box2.add(label1);
        box2.add(field);
        box3.add(label2);
        box3.add(field1);
        box4.add(label3);
        box4.add(field2);
//        box5.add(label4);
//        box5.add(field3);
//        box6.add(label5);
//        box6.add(field4);
        box7.add(button);
        box7.add(button1);

        base.add(box);
        base.add(Box.createVerticalStrut(40));
        base.add(box0);
        base.add(Box.createVerticalStrut(20));
        base.add(box1);
        base.add(Box.createVerticalStrut(30));
        base.add(box2);
        base.add(Box.createVerticalStrut(30));
        base.add(box3);
        base.add(Box.createVerticalStrut(30));
        base.add(box4);
        base.add(Box.createVerticalStrut(30));
//        base.add(box5);
//        base.add(Box.createVerticalStrut(40));
//        base.add(box6);
        base.add(Box.createVerticalStrut(40));
        base.add(box7);
        base.add(Box.createVerticalStrut(40));

        contenctPanel.add(base);
        add(contenctPanel);
    }

    class Myaction extends JFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
//			DBgoodsNamedecide decide = new DBgoodsNamedecide();
//			DBgoodsInsert insert = new DBgoodsInsert();
//			String name = field.getText();
//			String date = field1.getText();
//			BigDecimal vip = BigDecimal.valueOf(Double.parseDouble(field2.getText()));
//			BigDecimal money = BigDecimal.valueOf(Double.parseDouble(field3.getText()));
//			int num = Integer.parseInt(field4.getText());
//
//			if(decide.decideGoodsname(name)) {
//				JOptionPane.showMessageDialog(null,"商品名不能重复！", "错误",JOptionPane.ERROR_MESSAGE);
//				field.setText("");
//			}else if(insert.Goodsinsert(name, date, vip, money, num)){
//				JOptionPane.showMessageDialog(null,"添加商品成功！","正确", JOptionPane.DEFAULT_OPTION);
//			}


            String address = field.getText();
            String addressName = field1.getText();
            String mobile = field2.getText();
            if (prepareMySql("INSERT INTO address(address,addressName,mobile,username) VALUES(?,?,?,?)")) {
                try {
                    pstmt.setString(1, address);
                    pstmt.setString(2, addressName);
                    pstmt.setString(3, mobile);
                    pstmt.setString(4, adminname);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "添加收货地址成功！", "正确", JOptionPane.DEFAULT_OPTION);

                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    closeMySql();
                }

            }
        }


        public boolean prepareMySql(String sql) {
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
}
