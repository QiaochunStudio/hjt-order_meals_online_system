package com.shop.JFrame;
/***����Ա��¼����***/

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

public class AdminLogin extends JFrame {
	
private final JPanel contenctPanel = new JPanel();
	
	private final JTextField field = new JTextField(10);//����
	private final JTextField field1 = new JTextField(10);//����
	private final JTextField field2 = new JTextField(10);//�����֤��

	private final JPasswordField password1 = new JPasswordField();//�����ı���
	
	private final JLabel label = new JLabel();//�ı���ǩ
	private final JLabel label0 = new JLabel();//�ı���ǩ
	private final JLabel label1 = new JLabel();//�û���
	private final JLabel label2 = new JLabel();//����
	private final JLabel label3 = new JLabel();//�����֤��
	
	private final JButton button = new JButton();
	private final JButton button1 = new JButton();
	
	private final Box base = Box.createVerticalBox();
	private final Box box = Box.createHorizontalBox();
	private final Box box0 = Box.createHorizontalBox();
	private final Box box1 = Box.createHorizontalBox();
	private final Box box2 = Box.createHorizontalBox();
	private final Box box3 = Box.createHorizontalBox();
	private final Box box4 = Box.createHorizontalBox();
	
	private String username, password, address, useremail, card;
	private int age;
	
	public AdminLogin() {
		
		setTitle("��ӭʹ��  ���϶���ϵͳ");
		setBounds(300,100,900,900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		contenctPanel.setBackground(Color.WHITE);
		label.setText("���϶���ϵͳ");
		label.setFont(new Font("΢���ź�",1,32));
		label.setForeground(Color.BLUE);
		
		label0.setText("��  ��  Ա  ��  ¼  ��  ��\n");
		label0.setFont(new Font("΢���ź�",1,25));
		
		//�û���
		label1.setText("�� �� �� �� �� ����");
		label1.setFont(new Font("΢���ź�",0,18));
		field.addActionListener(new Myaction());
				
		//����
		label2.setText("��   ��  ��  ��  �룺");
		label2.setFont(new Font("΢���ź�",0,18));
		field1.addActionListener(new Myaction());
		password1.setText(password);
		//�����֤��
		Rand rand= new Rand();
		int num = rand.getRandom();
		label3.setText("�� ֤ �� ( "+ num +" )��");
		label3.setFont(new Font("΢���ź�",0,18));
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
		
		
		//��¼��ť
		button.setText("��  ¼");
		button.setFont(new Font("΢���ź�",0,18));
		button.addActionListener(new Myaction());
		
		//�������϶���ϵͳ������
		button1.setText("   �������϶���ϵͳ������");
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
		box4.add(button);
		box4.add(button1);
		
		base.add(box);
		base.add(Box.createVerticalStrut(40));
		base.add(box0);
		base.add(Box.createVerticalStrut(40));
		base.add(box1);
		base.add(Box.createVerticalStrut(30));
		base.add(box2);
		base.add(Box.createVerticalStrut(30));
		base.add(box3);
		base.add(Box.createVerticalStrut(50));
		base.add(box4);
		base.add(Box.createVerticalStrut(50));
		
		contenctPanel.add(base);
		add(contenctPanel);
	}
	
	class Myaction extends JFrame implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			DBadminPassdecide passdecide = new DBadminPassdecide();
			DBadminNamedecide namedecide = new DBadminNamedecide();
			
			if(e.getSource() == button) {
				
				//��ȡ�ı����������Ϣ
				username = field.getText();
				password = password1.getText();
				
				String option =username + "  �û���ϲ��ע��ɹ�";
				
				//�ж��û���������
				if(namedecide.decideAdminname(username) == false) {
					JOptionPane.showMessageDialog(null,"�û������ڣ����������룡", "����",JOptionPane.ERROR_MESSAGE); 
					field.setText("");
				}else if(passdecide.decideAdminpass(username, password) == false) {
					JOptionPane.showMessageDialog(null,"���벻��ȷ�����������룡", "����",JOptionPane.ERROR_MESSAGE); 
					field1.setText("");
				}else{
					dispose();
					AdminSelect select = new AdminSelect(username);//��ת������Ա����ѡ�����
					select.getName(username);
					
				}
			}
		}
		
	}
}
