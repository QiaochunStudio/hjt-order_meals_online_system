package com.shop.JFrame;
/***����Ա�����Ʒ��Ϣ����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.*;
import java.sql.*;
import java.util.*;
import java.math.*;
import static java.lang.System.out;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.concurrent.TimeUnit;
import com.shop.JFrame.*;
import com.shop.JFrame.AdminSelect;
import com.shop.JFrame.UserSelect;
import com.shop.JFrame.UserRegion.Myaction;

public class AdminGoodsInsert extends JFrame {

	private String adminname;
	
	private final JPanel contenctPanel = new JPanel();
	
	private final JTextField field = new JTextField(10);//����
	private final JTextField field1 = new JTextField(10);//����
	private final JTextField field2 = new JTextField(10);//���֤����
	private final JTextField field3 = new JTextField(10);//����
	private final JTextField field4 = new JTextField(10);//�����ַ

	//private final JPasswordField password = new JPasswordField();//�����ı���
	
	private final JLabel label = new JLabel();//�ı���ǩ
	private final JLabel label0 = new JLabel();//�ı���ǩ
	private final JLabel label1 = new JLabel();//�û���
	private final JLabel label2 = new JLabel();//����
	private final JLabel label3 = new JLabel();//���֤����
	private final JLabel label4 = new JLabel();//����
	private final JLabel label5 = new JLabel();//�����ַ
	private final JLabel label6 = new JLabel();//��ϵ��ַ
	
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
	
	public AdminGoodsInsert(String adminname) {
		setTitle("��ӭʹ��  ���϶���ϵͳ");
		setBounds(300,100,900,900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		contenctPanel.setBackground(Color.WHITE);
		label.setText("��ӭʹ��  ���϶���ϵͳ");
		label.setFont(new Font("΢���ź�",1,32));
		label.setForeground(Color.BLUE);
		
		label0.setText("��  ��  ��  Ʒ  ��  Ϣ  ��  ��\n");
		label0.setFont(new Font("΢���ź�",1,25));
		
		label6.setText("��ӭ  " + adminname + "  ����Ա");
		label6.setFont(new Font("΢���ź�",0,20));
		
		label1.setText("��  Ʒ �� �ƣ�");
		label1.setFont(new Font("΢���ź�",0,18));
		field.addActionListener(new Myaction());
		
		label2.setText("�� �� �� �ڣ�");
		label2.setFont(new Font("΢���ź�",0,18));
		field1.addActionListener(new Myaction());
		
		label3.setText("�� Ա �� ��");
		label3.setFont(new Font("΢���ź�",0,18));
		field2.addActionListener(new Myaction());
		
		label4.setText("�ǻ�Ա�۸�");
		label4.setFont(new Font("΢���ź�",0,18));
		field3.addActionListener(new Myaction());
		
		label5.setText("��  Ʒ �� ����");
		label5.setFont(new Font("΢���ź�",0,18));
		field4.addActionListener(new Myaction());
		
		button.setText("���");
		button.setFont(new Font("΢���ź�",0,18));
		button.addActionListener(new Myaction());
		
		button1.setText("���ع���Ա������");
		button1.setFont(new Font("΢���ź�",1,18));
		button1.setBorderPainted(false);
		button1.setBackground(Color.WHITE);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button1) {
					dispose();
					AdminSelect select = new AdminSelect(adminname);
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
		box5.add(label4);
		box5.add(field3);
		box6.add(label5);
		box6.add(field4);
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
		base.add(box5);
		base.add(Box.createVerticalStrut(40));
		base.add(box6);
		base.add(Box.createVerticalStrut(40));
		base.add(box7);
		base.add(Box.createVerticalStrut(40));
		
		contenctPanel.add(base);
		add(contenctPanel);
	}
	
	class Myaction extends JFrame implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			DBgoodsNamedecide decide = new DBgoodsNamedecide();
			DBgoodsInsert insert = new DBgoodsInsert();
			String name = field.getText();
			String date = field1.getText();
			BigDecimal vip = BigDecimal.valueOf(Double.parseDouble(field2.getText()));
			BigDecimal money = BigDecimal.valueOf(Double.parseDouble(field3.getText()));
			int num = Integer.parseInt(field4.getText());
			
			if(decide.decideGoodsname(name)) {
				JOptionPane.showMessageDialog(null,"��Ʒ�������ظ���", "����",JOptionPane.ERROR_MESSAGE); 
				field.setText("");
			}else if(insert.Goodsinsert(name, date, vip, money, num)){
				JOptionPane.showMessageDialog(null,"�����Ʒ�ɹ���","��ȷ", JOptionPane.DEFAULT_OPTION); 
			}
		}
	}

}
