package com.shop.JFrame;
/***����Աע�����***/

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
import com.shop.JFrame.UserSelect;
import com.shop.JFrame.UserRegion.Myaction;

public class AdminRegion extends JFrame {
	
	private final JPanel contenctPanel = new JPanel();
	
	private final JTextField field = new JTextField(10);
	private final JTextField field1 = new JTextField(10);
	private final JTextField field2 = new JTextField(10);
	
	private final JLabel label = new JLabel();
	private final JLabel label0 = new JLabel();
	private final JLabel label1 = new JLabel();
	private final JLabel label2 = new JLabel();
	private final JLabel label3 = new JLabel();
	private final JLabel label4 = new JLabel();

	private final JPasswordField password1 = new JPasswordField();//�����ı���
	
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
	private final Box box8 = Box.createHorizontalBox();
	
	private String username, password, address, useremail, card;
	private int age;

	private String adminname;
	
	public void getName(String name) {
		this.adminname = name;
	}
	
	public AdminRegion(String adminname) {
		setTitle("��ӭʹ��  ���϶���ϵͳ");
		setBounds(300,100,900,900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		contenctPanel.setBackground(Color.WHITE);
		label.setText("���϶���ϵͳ");
		label.setFont(new Font("΢���ź�",1,32));
		label.setForeground(Color.BLUE);
		
		label0.setText("��  ��  ��  ��  Ա  ��  ��\n");
		label0.setFont(new Font("΢���ź�",1,25));
		
		label1.setText("��ӭ  " + adminname + "  ����Ա");
		label1.setFont(new Font("΢���ź�",0,20));
		
		//�û���
		label2.setText("�û�������ĸ��������ɣ�����Ϊ6λ����");
		label2.setFont(new Font("΢���ź�",0,18));
		field.addActionListener(new Myaction());
		
		//����
		label3.setText("�� �루��ĸ �� ���� ��ɣ�����Ϊ6λ����");
		label3.setFont(new Font("΢���ź�",0,18));
		field1.addActionListener(new Myaction());
		password1.setText(password);
		//�����֤��
		Rand rand= new Rand();
		int num = rand.getRandom();
		label4.setText("��   ��   ��   ��   ��   ��   ֤   �� ( "+ num +" )��");
		label4.setFont(new Font("΢���ź�",0,18));
		field2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == field2) {
					String str = field2.getText();
					int n = Integer.parseInt(str);
					if(n != num) {
						JOptionPane.showMessageDialog(null,"��֤�벻��ȷ", "����",JOptionPane.ERROR_MESSAGE); 
						field2.setText("");
					}
				}
			}			
		});
		
		button.setText("ע��");
		button.setFont(new Font("΢���ź�",0,18));
		button.addActionListener(new Myaction());
		
		button1.setText("���ع���Ա����������");
		button1.setFont(new Font("΢���ź�",1,18));
		button1.setBorderPainted(false);
		button1.setBackground(Color.WHITE);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button1) {
					AdminSelect select = new AdminSelect(adminname);
					select.getName(adminname);
					dispose();
				}
			}			
		});
		
		box.add(label);
		box0.add(label0);
		box1.add(label1);
		box2.add(label2);
		box2.add(field);
		box3.add(label3);
		box3.add(password1);
		box4.add(label4);
		box4.add(field2);
		box5.add(button);
		box5.add(button1);
		
		base.add(box);
		base.add(Box.createVerticalStrut(30));
		base.add(box0);
		base.add(Box.createVerticalStrut(20));
		base.add(box1);
		base.add(Box.createVerticalStrut(30));
		base.add(box2);
		base.add(Box.createVerticalStrut(30));
		base.add(box3);
		base.add(Box.createVerticalStrut(40));
		base.add(box4);
		base.add(Box.createVerticalStrut(30));
		base.add(box5);
		base.add(Box.createVerticalStrut(40));
		
		contenctPanel.add(base);
		add(contenctPanel);
	}
	
	class Myaction extends JFrame implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			// TODO Auto-generated method stub

			DBadminNamedecide dbadminname = new DBadminNamedecide();
			DBadminRegion insert = new DBadminRegion();
			UserDecide userdecide = new UserDecide();
			if(e.getSource() == button) {
				
				//��ȡ�ı����������Ϣ
				username = field.getText();
				password = password1.getText();
				
				String option = username + "  ����Ա��ӳɹ�";
				
				if(dbadminname.decideAdminname(username) == true || username.length() < 6 || userdecide.Decide(username) == false) {
					JOptionPane.showMessageDialog(null,"�û����ظ�������ĸ��������ɣ���������Ϊ6λ��", "����",JOptionPane.ERROR_MESSAGE); 
					field.setText("");
				}else if(userdecide.Decide(password) == false) {
					JOptionPane.showMessageDialog(null,"����������ĸ��������ɣ���������Ϊ6λ��", "����",JOptionPane.ERROR_MESSAGE); 
					field1.setText("");
				}else if(insert.insertAdmin(username,password )) {
						JOptionPane.showMessageDialog(null, option, "��ȷע��",JOptionPane.DEFAULT_OPTION); 
						AdminSelect select = new AdminSelect(adminname);
						select.getName(adminname);
						dispose();
				}
				
			}
		}
	}
}
