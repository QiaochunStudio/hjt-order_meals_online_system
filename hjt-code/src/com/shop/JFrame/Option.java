package com.shop.JFrame;
/***�����˳��̳ǽ�����ʾ����***/

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
import com.shop.JFrame.UserRegion;

public class Option extends JFrame {

	private final JPanel contenctPanel = new JPanel();
	
	private final JButton button = new JButton();
	private final JButton button1 = new JButton();
	
	private final JLabel label = new JLabel();//�ı���ǩ
	
	private final Box base = Box.createVerticalBox();
	private final Box box1 = Box.createHorizontalBox();
	private final Box box2 = Box.createHorizontalBox();
	
	public Option() {
		setTitle("��Ҫ��Ϣ��ʾ��");
		setBounds(600, 400, 400, 200);
		setVisible(true);
		setForeground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		contenctPanel.setBackground(Color.WHITE);
		
		label.setText("�� �� �� �� �� ť ���� ��  Hern �� �� ��");
		label.setFont(new Font("΢���ź�",1,15));
		label.setForeground(Color.RED);
		
		button.setText("��	��");
		button.setFont(new Font("΢���ź�",1,15));
		button.setForeground(Color.RED);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				System.exit(0);
			}
			
		});
		
		
		button1.setText("ȡ	��");
		button1.setFont(new Font("΢���ź�",1,15));
		button1.setForeground(Color.RED);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				IndexWelcome welcome = new IndexWelcome();
				dispose();
			}
			
		});
		
		box1.add(label);
		box1.add(Box.createVerticalStrut(100));
		box2.add(button);
		box2.add(Box.createHorizontalStrut(50));
		box2.add(button1);
		box2.add(Box.createHorizontalStrut(50));
		base.add(box1);
		base.add(Box.createVerticalStrut(20));
		base.add(box2);
		base.add(Box.createVerticalStrut(20));
		contenctPanel.add(base);
		add(contenctPanel);
		
	}
	
}
