package com.shop.JFrame;
/***�̳�������***/

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

public class IndexWelcome extends JFrame {
	
	private final JPanel contenctPanel = new JPanel();
	
	private final JButton button1 = new JButton();
	private final JButton button2 = new JButton();
	private final JButton button3 = new JButton();
	private final JButton button4 = new JButton();
	private final JButton button5 = new JButton();
	private final JButton button6 = new JButton();
	private final JButton button7 = new JButton();
	private final JButton button8 = new JButton();

	private final JLabel label = new JLabel();//�ı���ǩ
	private final JLabel label1 = new JLabel();//�ı���ǩ
	
	private final Box base = Box.createVerticalBox();
	private final Box box1 = Box.createHorizontalBox();
	private final Box box2 = Box.createHorizontalBox();
	private final Box box3 = Box.createHorizontalBox();
	private final Box box4 = Box.createHorizontalBox();
	private final Box box5 = Box.createHorizontalBox();
	private final Box box6 = Box.createHorizontalBox();
	private final Box box7 = Box.createHorizontalBox();
	private final Box box8 = Box.createHorizontalBox();
	private final Box box9 = Box.createHorizontalBox();

	/**���ӵ�*/
	private final Box box10 = Box.createHorizontalBox();


	public IndexWelcome() {
		
		setTitle("��ӭʹ��  ���϶���ϵͳ");
		setBounds(300,100,900,900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contenctPanel.setBackground(Color.WHITE);
		label.setText("���϶���ϵͳ");
		label.setFont(new Font("΢���ź�",1,32));
		label.setForeground(Color.BLUE);
		
		label1.setText("��    ��    ��    ��    ��");
		label1.setFont(new Font("΢���ź�",0,25));
		
		button1.setText("1����       ��       ע       ��");
		button1.setBackground(Color.WHITE);
		button1.setFont(new Font("΢���ź�",0,18));
		button1.setBorderPainted(false);
		
		button2.setText("2����       ��       ��       ¼");
		button2.setBackground(Color.WHITE);
		button2.setFont(new Font("΢���ź�",0,18));
		button2.setBorderPainted(false);
		
		button3.setText("3����   ��   ��   ��  ��   Ʒ");
		button3.setBackground(Color.WHITE);
		button3.setFont(new Font("΢���ź�",0,18));
		button3.setBorderPainted(false);
		
		button4.setText("4����  ��  ��  ��  ��  �� �� Ʒ");
		button4.setBackground(Color.WHITE);
		button4.setFont(new Font("΢���ź�",0,18));
		button4.setBorderPainted(false);
		
		button5.setText("5����    ��    Ա    ��    ¼");
		button5.setBackground(Color.WHITE);
		button5.setFont(new Font("΢���ź�",0,18));
		button5.setBorderPainted(false);
		
		button6.setText("6����  ��  ��  ������  ��");
		button6.setBackground(Color.WHITE);
		button6.setFont(new Font("΢���ź�",0,18));
		button6.setBorderPainted(false);


		button8.setText("7����  ��  ��  ַ");
		button8.setBackground(Color.WHITE);
		button8.setFont(new Font("΢���ź�",0,18));
		button8.setBorderPainted(false);
		
		button7.setText("8����  ��  ��  ��  ��  ��  ϵ  ͳ");
		button7.setBackground(Color.WHITE);
		button7.setFont(new Font("΢���ź�",0,18));
		button7.setBorderPainted(false);
		
		box8.add(label);
		box9.add(label1);

		box1.add(button1);
		box1.add(Box.createVerticalStrut(40));
		box2.add(button2);
		box2.add(Box.createVerticalStrut(40));
		box3.add(button3);
		box3.add(Box.createVerticalStrut(40));
		box4.add(button4);
		box4.add(Box.createVerticalStrut(40));
		box5.add(button5);
		box5.add(Box.createVerticalStrut(40));
		box6.add(button6);
		box6.add(Box.createVerticalStrut(40));

		/*���ӵ�ѡ��*/
		box10.add(button8);
		box10.add(Box.createVerticalStrut(40));

		box7.add(button7);
		box7.add(Box.createVerticalStrut(40));



		base.add(box8);
		base.add(Box.createVerticalStrut(40));
		base.add(box9);
		base.add(Box.createVerticalStrut(40));
		base.add(box1);
		base.add(Box.createVerticalStrut(40));
		base.add(box2);
		base.add(Box.createVerticalStrut(40));
		base.add(box3);
		base.add(Box.createVerticalStrut(40));
		base.add(box4);
		base.add(Box.createVerticalStrut(40));
		base.add(box5);
		base.add(Box.createVerticalStrut(40));
		base.add(box6);
		base.add(Box.createVerticalStrut(40));


		/*���ӵ�ѡ��*/
		base.add(box10);
		base.add(Box.createVerticalStrut(40));

		base.add(box7);
		base.add(Box.createVerticalStrut(40));




		contenctPanel.add(base);
		add(contenctPanel);
		

		/***�û�ע��***/
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == button1) {
					dispose();//���ٴ���
					UserRegion region = new UserRegion();
					
				}
			}	
		});
		

		/***�û���¼***/
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == button2) {
					dispose();//���ٴ���
					UserLogin login = new UserLogin();
					
				}
			}	
		});
		

		/***�鿴�̳���Ʒ***/
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == button3) {
					dispose();//���ٴ���
					GoodsLook look = new GoodsLook();
					
				}
			}	
		});
		

		/***�鿴�ҹ������Ʒ***/
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == button4) {
					dispose();//���ٴ���
					UserLogin login = new UserLogin();
					
				}
			}	
		});
		

		/***����Ա��¼***/
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == button5) {
					dispose();//���ٴ���
					AdminLogin admin = new AdminLogin();
					
				}
			}	
		});
		

		/***�һ��˻�������***/
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == button6) {
					dispose();//���ٴ���
					UserSearch search = new UserSearch();
					
				}
			}	
		});
		

		/***�˳�ϵͳ***/
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == button7) {
					Option option = new Option();
					dispose();
				}
			}	
		});


		/**���ӵ�*/
		/***�鿴�̳���Ʒ***/
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if(e.getSource() == button8) {
					dispose();//���ٴ���
					GoodsLook1 look = new GoodsLook1();

				}
			}
		});
		
	}

}
