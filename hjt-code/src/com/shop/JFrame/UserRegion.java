package com.shop.JFrame;
/***�û�ע��***/

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

public class UserRegion extends JFrame{

	private final JPanel contenctPanel = new JPanel();
	
	private final JTextField field = new JTextField(10);//����
	private final JTextField field1 = new JTextField(10);//����
	private final JTextField field2 = new JTextField(10);//���֤����
	private final JTextField field3 = new JTextField(10);//����
	private final JTextField field4 = new JTextField(10);//�����ַ
	private final JTextField field5 = new JTextField(10);//��ϵ��ַ
	private final JTextField field6 = new JTextField(10);//�����֤��
	private final JTextField field7 = new JTextField(10);

	private final JPasswordField password1 = new JPasswordField();//�����ı���
	
	private final JLabel label = new JLabel();//�ı���ǩ
	private final JLabel label0 = new JLabel();//�ı���ǩ
	private final JLabel label1 = new JLabel();//�û���
	private final JLabel label2 = new JLabel();//����
	private final JLabel label3 = new JLabel();//���֤����
	private final JLabel label4 = new JLabel();//����
	private final JLabel label5 = new JLabel();//�����ַ
	private final JLabel label6 = new JLabel();//��ϵ��ַ
	private final JLabel label7 = new JLabel();//�����֤��
	
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
	
	public UserRegion(){
		
		setTitle("��ӭʹ��  ���϶���ϵͳ");
		setBounds(300,100,900,900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		contenctPanel.setBackground(Color.WHITE);
		label.setText("���϶���ϵͳ");
		label.setFont(new Font("΢���ź�",1,32));
		label.setForeground(Color.BLUE);
		
		label0.setText("��  ��  ע  ��  ��  ��\n");
		label0.setFont(new Font("΢���ź�",1,25));
		
		//�û���
		label1.setText("�û�������ĸ�����֣���");
		label1.setFont(new Font("΢���ź�",0,18));
		field.addActionListener(new Myaction());
		
		//����
		label2.setText("��    �루��ĸ�����֣���");
		label2.setFont(new Font("΢���ź�",0,18));
		field1.addActionListener(new Myaction());
		password1.setText(password);
		
		//���֤����
		label3.setText("��  ��  ��  �� ֤  �� �� ��");
		label3.setFont(new Font("΢���ź�",0,18));
		field2.addActionListener(new Myaction());
		
		//����
		int a;
		label4.setText("��  ��(18 ~ 65 ��֮��)��");
		label4.setFont(new Font("΢���ź�",0,18));
		field3.addActionListener(new Myaction());
		
		//�����ַ
		label5.setText("��   ��   ��    ��   ��  ַ��");
		label5.setFont(new Font("΢���ź�",0,18));
		field4.addActionListener(new Myaction());
		
		//��ϵ��ַ
		label6.setText("��   ��   ��   ϵ   ��   ַ��");
		label6.setFont(new Font("΢���ź�",0,18));
		field5.addActionListener(new Myaction());
		
		//�����֤��
		Rand rand= new Rand();
		int num = rand.getRandom();
		label7.setText("�� �� �� ֤ �� ( "+ num +" )��");
		label7.setFont(new Font("΢���ź�",0,18));
		field6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == field6) {
					String str = field6.getText();
					int n = Integer.parseInt(str);
					if(n != num) {
						JOptionPane.showMessageDialog(null,"��֤�벻��ȷ", "����",JOptionPane.ERROR_MESSAGE); 
						field6.setText("");
					}
				}
			}			
		});
		
		button.setText("ע��");
		button.setFont(new Font("΢���ź�",0,18));
		button.addActionListener(new Myaction());
		
		button1.setText("�������϶���ϵͳ������");
		button1.setFont(new Font("΢���ź�",1,18));
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
		box0.add(label0);
		box1.add(label1);
		box1.add(field);
		box2.add(label2);
		box2.add(password1);
		box3.add(label3);
		box3.add(field2);
		box4.add(label4);
		box4.add(field3);
		box5.add(label5);
		box5.add(field4);
		box6.add(label6);
		box6.add(field5);
		box7.add(label7);
		box7.add(field6);
		box8.add(button);
		box8.add(button1);
		
		base.add(box);
		base.add(Box.createVerticalStrut(40));
		base.add(box0);
		base.add(Box.createVerticalStrut(40));
		base.add(box1);
		base.add(Box.createVerticalStrut(25));
		base.add(box2);
		base.add(Box.createVerticalStrut(25));
		base.add(box3);
		base.add(Box.createVerticalStrut(25));
		base.add(box4);
		base.add(Box.createVerticalStrut(25));
		base.add(box5);
		base.add(Box.createVerticalStrut(25));
		base.add(box6);
		base.add(Box.createVerticalStrut(25));
		base.add(box7);
		base.add(Box.createVerticalStrut(50));
		base.add(box8);
		base.add(Box.createVerticalStrut(50));
		
		contenctPanel.add(base);
		add(contenctPanel);
		
	}
	
	class Myaction extends JFrame implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			DBuserNamedecide dbusername = new DBuserNamedecide();//����û����Ƿ��ظ�
			UserDecide userdecide = new UserDecide();//����û����������Ƿ�ΪӢ�ĺ�������ϣ����Ҽ������������Ϲ淶
			DBuserregion insert = new DBuserregion();//���û���Ϣ��ӵ����ݿ�
			// TODO Auto-generated method stub
			
			if(e.getSource() == button) {
				
				//��ȡ�ı����������Ϣ
				username = field.getText();
				password = password1.getText();
				card = field2.getText();
				String str = field3.getText();
				age= Integer.parseInt(str);
				useremail = field4.getText();
				address = field5.getText();
				String option =username + "  �û���ϲ��ע��ɹ�";
				
				//�ж��û��������롢���䡢���֤�������ַ����ȷ����֮��������ݿ�
				if(userdecide.Decide(username) == false || dbusername.decideUsername(username)) {
					JOptionPane.showMessageDialog(null,"�û��������ظ�������ĸ��������ɣ�����Ϊ6λ��", "����",JOptionPane.ERROR_MESSAGE); 
					field.setText("");
				}else if(userdecide.Decide(password) == false) {
					JOptionPane.showMessageDialog(null,"�����������ĸ��������ɣ�����Ϊ6λ��", "����",JOptionPane.ERROR_MESSAGE); 
					field1.setText("");
				}else if(card.length() != 18) {
					JOptionPane.showMessageDialog(null,"���֤���벻����Ҫ��", "����",JOptionPane.ERROR_MESSAGE); 
					field2.setText("");
				}else if(age < 18 || age > 65) {
					JOptionPane.showMessageDialog(null,"��������� 18~65 ֮�䣡", "����",JOptionPane.ERROR_MESSAGE); 
					field3.setText("");
				}else if(userdecide.Email(useremail) == false) {
					JOptionPane.showMessageDialog(null,"���������ַ����ȷ��", "����",JOptionPane.ERROR_MESSAGE); 
					field4.setText("");
				}else if(insert.insertUser(username, password, card, age, useremail, address)) {
					JOptionPane.showMessageDialog(null, option, "��ȷע��",JOptionPane.DEFAULT_OPTION); 
					IndexWelcome welcome = new IndexWelcome();
					dispose();
				}
			}
		}
		
	}
}
