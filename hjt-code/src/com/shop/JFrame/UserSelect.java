package com.shop.JFrame;
/***�û�ѡ�����***/

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
import com.shop.JFrame.UserLogin;
import com.shop.JFrame.UserRegion.Myaction;

public class UserSelect extends JFrame {
	
	private final JPanel contenctPanel = new JPanel();
	
	private final JButton button = new JButton();
	private final JButton button1 = new JButton();
	private final JButton button2 = new JButton();
	private final JButton button3 = new JButton();
	/*�����ӵĵ�ַ*/
	private final JButton button4 = new JButton();
	private final JButton button5= new JButton();
	private final JButton button6= new JButton();
	private final JButton button7= new JButton();

	private final JLabel label = new JLabel();//�ı���ǩ
	private final JLabel label0 = new JLabel();//�ı���ǩ
	private final JLabel label1 = new JLabel();//�û���
	private final JLabel label2 = new JLabel();//�û���
	
	private final Box base = Box.createVerticalBox();
	private final Box box = Box.createHorizontalBox();
	private final Box box0 = Box.createHorizontalBox();
	private final Box box1 = Box.createHorizontalBox();
	private final Box box2 = Box.createHorizontalBox();
	private final Box box3 = Box.createHorizontalBox();
	private final Box box4 = Box.createHorizontalBox();
	private final Box box5 = Box.createHorizontalBox();
	/*�����ӵĵ�ַ*/
	private final Box box6 = Box.createHorizontalBox();
	private final Box box7 = Box.createHorizontalBox();
	private final Box box8 = Box.createHorizontalBox();
	private final Box box9 = Box.createHorizontalBox();

	private String username;
	
	public void getName(String name) {
		this.username = name;
	}
	
	public UserSelect(String username) {
		
		setTitle("��ӭʹ��  ���϶���ϵͳ");
		setBounds(300,100,900,900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		contenctPanel.setBackground(Color.WHITE);
		label.setText("���϶���ϵͳ");
		label.setFont(new Font("΢���ź�",1,32));
		label.setForeground(Color.BLUE);
		
		label0.setText("��  ��  ��  ��  ��  ��  ѡ  ��  ��  ��\n");
		label0.setFont(new Font("΢���ź�",1,25));
		
		
		label1.setText("��ӭ  " + username + "  VIP�û�");
		label1.setFont(new Font("΢���ź�",0,20));
		//������Ʒ
		button.setText("1�� ��  ��  ��  Ʒ ");
		button.setFont(new Font("΢���ź�",1,18));
		button.setBorderPainted(false);
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button) {
					dispose();
					UserBuy buy = new UserBuy(username);
					buy.getName(username);
				}
			}			
		});
		//�鿴���ﳵ
		button2.setText("2�� ��  ��  ��  �� ��  �� ");
		button2.setFont(new Font("΢���ź�",1,18));
		button2.setBorderPainted(false);
		button2.setBackground(Color.WHITE);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button2) {
					dispose();
					UserBuylook look = new UserBuylook(username);
					look.getName(username);
				}
			}			
		});


		/*�����ӵĵ�ַ*/
		button4.setText("3�� �� �� �� �� �� ַ ");
		button4.setFont(new Font("΢���ź�",1,18));
		button4.setBorderPainted(false);
		button4.setBackground(Color.WHITE);
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button4) {
					dispose();
					UserBuy1 buy = new UserBuy1(username);
					buy.getName(username);
				}
			}
		});

		/*�����ӵĵ�ַ*/
		button5.setText("4�� �� �� �� �� �� ַ ");
		button5.setFont(new Font("΢���ź�",1,18));
		button5.setBorderPainted(false);
		button5.setBackground(Color.WHITE);
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button5) {
					dispose();
					AdminGoodsInsert1 buy = new AdminGoodsInsert1(username);
					buy.getName(username);
				}
			}
		});

		/*����������ע*/
		button6.setText("5�� �� �� �� �� �� ע");
		button6.setFont(new Font("΢���ź�",1,18));
		button6.setBorderPainted(false);
		button6.setBackground(Color.WHITE);
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button6) {
					dispose();
					AdminGoodsInsert2 buy = new AdminGoodsInsert2(username);
					buy.getName(username);
				}
			}
		});


		/*���������б�*/
		button7.setText("6�� �� �� �� ע �� ��");
		button7.setFont(new Font("΢���ź�",1,18));
		button7.setBorderPainted(false);
		button7.setBackground(Color.WHITE);
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button7) {
					dispose();
					UserBuy2 buy = new UserBuy2(username);
					buy.getName(username);
				}
			}
		});
				
		//�˳���¼
		button1.setText("7�� ��    ��    ��    ¼");
		button1.setFont(new Font("΢���ź�",1,18));
		button1.setBorderPainted(false);
		button1.setBackground(Color.WHITE);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button1) {
					Option2 option = new Option2();
					dispose();
				}
			}			
		});
		//�������϶���ϵͳ������
		button3.setText("8���� �� �� �� ��  �� �� �� ��");
		button3.setFont(new Font("΢���ź�",1,18));
		button3.setBorderPainted(false);
		button3.setBackground(Color.WHITE);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button3) {
					dispose();
					IndexWelcome welcome = new IndexWelcome();
				}
			}			
		});
		box.add(label);
		box0.add(label0);
		box1.add(label1);
		//box1.add(Box.createVerticalStrut(40));
		box2.add(button);
		box2.add(Box.createVerticalStrut(40));
		box3.add(button2);
		box3.add(Box.createVerticalStrut(40));

		/**�����ӵ�*/
		box6.add(button4);
		box6.add(Box.createVerticalStrut(40));
		box7.add(button5);
		box7.add(Box.createVerticalStrut(40));
		box8.add(button6);
		box8.add(Box.createVerticalStrut(40));
		box9.add(button7);
		box9.add(Box.createVerticalStrut(40));

		box4.add(button1);
		box4.add(Box.createVerticalStrut(40));



		box5.add(button3);
		box5.add(Box.createVerticalStrut(40));


		
		
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
		/**�����ӵ�*/
		base.add(box6);
		base.add(Box.createVerticalStrut(25));
		base.add(box7);
		base.add(Box.createVerticalStrut(25));
		base.add(box8);
		base.add(Box.createVerticalStrut(25));
		base.add(box9);
		base.add(Box.createVerticalStrut(25));

		base.add(box4);
		base.add(Box.createVerticalStrut(25));




		base.add(box5);
		base.add(Box.createVerticalStrut(25));
		
		contenctPanel.add(base);
		add(contenctPanel);
		
	}
}
