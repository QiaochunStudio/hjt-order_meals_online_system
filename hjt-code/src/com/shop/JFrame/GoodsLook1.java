package com.shop.JFrame;
/***查看商城商品信息界面***/

import com.shop.mysql.DBconnection;
import com.shop.mysql.DBuser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GoodsLook1 extends JFrame {

	static Connection conn;	//声明Connection对象
	static PreparedStatement pres;	//向数据库发送SQL语句
	static ResultSet res;	//执行数据库查询

	private final JPanel contenctPanel = new JPanel();

	//private final JPasswordField password = new JPasswordField();//密码文本框

	private final JLabel label = new JLabel();
	private final JLabel label0 = new JLabel();
	private final JLabel label1 = new JLabel();
	private final JLabel label2 = new JLabel();

	private final JButton button = new JButton();
	private final JButton button1 = new JButton();

	private final Box base = Box.createVerticalBox();
	private final Box box = Box.createHorizontalBox();
	private final Box box1 = Box.createHorizontalBox();
	private final Box box2 = Box.createHorizontalBox();
	private final Box box3 = Box.createHorizontalBox();
	private JTextArea text= new JTextArea();

	public GoodsLook1() {
		setTitle("欢迎使用  网上订餐系统");
		setBounds(300,100,900,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DBuser user = new DBuser();
		
		contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		contenctPanel.setBackground(Color.WHITE);
		label.setText("网上订餐系统");
		label.setFont(new Font("微软雅黑",1,32));
		label.setForeground(Color.BLUE);
		
		label0.setText("查  看    最  新  菜  品  信  息  界  面\n");
		label0.setFont(new Font("微软雅黑",1,25));
		
		text.setSize(800, 800);
		DBconnection db = new DBconnection();
		conn = db.getConn();
		try{
			pres = conn.prepareStatement("select * from address ");
			res = pres.executeQuery();
			text.append("收 货 序 号     "+"                收 货 地 址 " + "                          收  货   人 "+"                联  系  电  话 " +"\n");
			while(res.next()){
				int id = res.getInt("addressID");
				String address = res.getString("address");
				String addressName = res.getString("addressName");
				String mobile = res.getString("mobile");
//				BigDecimal money = res.getBigDecimal("goodsMoney");
//				int num = res.getInt("goodsNum");
				text.append("\n "+id+"\t "+address+"\t "+addressName+"\t "+mobile+"\t   "+"\n");
			}
			res.close();
			pres.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		JScrollPane scroll = new JScrollPane(text);
//		scroll.setSize(800, 800);
//		button.setText("购 买  菜 品");
//		button.setFont(new Font("微软雅黑",1,18));
//		button.setBorderPainted(false);
//		button.setBackground(Color.WHITE);
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				if(e.getSource() == button) {
//					dispose();
//					UserLogin login = new UserLogin();
//				}
//			}
//		});
				
		button1.setText("返回网上订餐系统主界面");
		button1.setFont(new Font("微软雅黑",1,18));
		button1.setBorderPainted(false);
		button1.setBackground(Color.WHITE);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button1) {
					dispose();
					IndexWelcome welcome = new IndexWelcome();	
				}
			}			
		});
		
		box.add(label);
		box1.add(label0);
		box2.add(scroll);
		box3.add(button);
		box3.add(button1);
		
		base.add(box);
		base.add(Box.createVerticalStrut(40));
		base.add(box1);
		base.add(Box.createVerticalStrut(40));
		base.add(box2);
		base.add(Box.createVerticalStrut(40));
		base.add(box3);
		base.add(Box.createVerticalStrut(40));
		
		contenctPanel.add(base);
		add(contenctPanel);
		setVisible(true);
	}

}
