package com.shop.JFrame;
/***�̳��������ؽ�����***/

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

public class ProgressBar extends JFrame {

private static final long serialVersionUID = 1L;
	
	private JProgressBar processBar = new JProgressBar();//������
	
	private final JLabel label = new JLabel();//�ı���ǩ
	private final JLabel label1 = new JLabel();
	
	private final JButton button = new JButton();
	
	private final Box base = Box.createVerticalBox();//����
	private final Box box1 = Box.createHorizontalBox();
	private final Box box2 = Box.createHorizontalBox();
	private final Box box3 = Box.createHorizontalBox();
	private final Box box4 = Box.createHorizontalBox();
	
	public ProgressBar() {
		
		setTitle("��ӭʹ��  ���϶���ϵͳ");
		setBounds(600,600,400,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());//�������Ϊ��ʽ����

		label.setText("���ڽ���  ���϶���ϵͳ");
		label.setFont(new   java.awt.Font("΢���ź�", 1,18));//���������ʽ����ϸ����С
		label1.setText(" ");
		
		processBar.setStringPainted(true);//������ʾ��Ϣ
		processBar.setBackground(Color.darkGray);//���ñ���ɫ
	    processBar.setForeground(Color.BLUE);//����ǰ��ɫ
		
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i += 5) {
					try {
						Thread.sleep(100); // �õ�ǰ�߳�����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					processBar.setValue(i); // ���ý�������ֵ
				}
				processBar.setString("����  ����  ��ť ���϶���ϵͳ");// ������ʾ��Ϣ
			}
		}.start();
		
		button.setText("��  ��");
		button.setFont(new Font("΢���ź�",1,18));
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button) {
					dispose();
					IndexWelcome index = new IndexWelcome();
				}
				
			}
			
		});
		
		box1.add(label);//�ı���ǩ
		box2.add(label1);//�հ��ı���ǩ
		box3.add(processBar);//������
		box4.add(button);
		base.add(box1);//��ˮƽ������ӵ���ֱ�����У������ɴ�ֱ����
		base.add(box2);
		base.add(box3);
		base.add(Box.createVerticalStrut(30));
		base.add(box4);
		
		contentPane.add(base);// �������Ӵ�ֱ����
		add(contentPane);//������������
		
	}

}
