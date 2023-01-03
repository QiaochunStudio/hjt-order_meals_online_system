package com.shop.JFrame;
/***����Ա����ѡ�����***/

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

public class AdminSelect extends JFrame {

    private final JPanel contenctPanel = new JPanel();

    private final JButton button1 = new JButton();
    private final JButton button2 = new JButton();
    private final JButton button3 = new JButton();
    private final JButton button4 = new JButton();
    private final JButton button5 = new JButton();
    private final JButton button6 = new JButton();
    private final JButton button7 = new JButton();

    /**
     * �޸Ķ�����Ϣ
     */
    private final JButton button8 = new JButton();

    private final JLabel label = new JLabel();//�ı���ǩ
    private final JLabel label0 = new JLabel();//�ı���ǩ
    private final JLabel label1 = new JLabel();//�ı���ǩ
    private final JLabel label2 = new JLabel();//�ı���ǩ

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
    private final Box box9 = Box.createHorizontalBox();
    /**
     * �޸Ķ�����Ϣ
     */
    private final Box box10 = Box.createHorizontalBox();

    private String adminname;


    public void getName(String name) {
        this.adminname = name;
    }

    public AdminSelect(String adminname) {
        setTitle("��ӭʹ��  ���϶���ϵͳ");
        setBounds(300, 100, 900, 900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contenctPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        contenctPanel.setBackground(Color.WHITE);
        label.setText("���϶���ϵͳ");
        label.setFont(new Font("΢���ź�", 1, 32));
        label.setForeground(Color.BLUE);

        label0.setText("��  ��  Ա  ��  ��  ѡ  ��  ��  ��\n");
        label0.setFont(new Font("΢���ź�", 1, 25));

        label1.setText("��ӭ  " + adminname + "  ����Ա");
        label1.setFont(new Font("΢���ź�", 0, 20));

        button1.setText("1���� �� �� �� �� Ա");
        button1.setBackground(Color.WHITE);
        button1.setFont(new Font("΢���ź�", 1, 18));
        button1.setBorderPainted(false);
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button1) {
                    dispose();
                    AdminRegion region = new AdminRegion(adminname);
                    region.getName(adminname);
                }

            }

        });

        button2.setText("2���� �� �� �� �� �� �� �� Ϣ");
        button2.setBackground(Color.WHITE);
        button2.setFont(new Font("΢���ź�", 1, 18));
        button2.setBorderPainted(false);
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button2) {
                    dispose();
                    AdminUserLook look = new AdminUserLook(adminname);
                    look.getName(adminname);
                }
            }

        });

        button3.setText("3��ɾ �� �� �� �� Ϣ");
        button3.setBackground(Color.WHITE);
        button3.setFont(new Font("΢���ź�", 1, 18));
        button3.setBorderPainted(false);
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button3) {
                    dispose();
                    AdminUserDel del = new AdminUserDel(adminname);
                    del.getName(adminname);

                }
            }

        });

        button4.setText("4��ɾ �� ��  Ʒ �� Ϣ");
        button4.setBackground(Color.WHITE);
        button4.setFont(new Font("΢���ź�", 1, 18));
        button4.setBorderPainted(false);
        button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button4) {
                    dispose();
                    AdminGoodsDel del = new AdminGoodsDel(adminname);
                    del.getName(adminname);

                }
            }

        });

        button5.setText("5���� �� ��  Ʒ �� Ϣ");
        button5.setBackground(Color.WHITE);
        button5.setFont(new Font("΢���ź�", 1, 18));
        button5.setBorderPainted(false);
        button5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button5) {
                    dispose();
                    AdminGoodsInsert insert = new AdminGoodsInsert(adminname);
                    insert.getName(adminname);
                }

            }

        });

        button6.setText("6���� �� ��  Ʒ �� Ϣ");
        button6.setBackground(Color.WHITE);
        button6.setFont(new Font("΢���ź�", 1, 18));
        button6.setBorderPainted(false);
        button6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button6) {
                    dispose();
                    AdminGoodsUpdate update = new AdminGoodsUpdate(adminname);
                    update.getName(adminname);
                }
            }

        });

        button8.setText("7���� �� �� �� �� Ϣ");
        button8.setBackground(Color.WHITE);
        button8.setFont(new Font("΢���ź�", 1, 18));
        button8.setBorderPainted(false);
        button8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button8) {
                    dispose();
                    AdminGoodsUpdate1 update = new AdminGoodsUpdate1(adminname);
                    update.getName(adminname);
                }
            }

        });

        button7.setText("8���˳� ����Ա ��¼");
        button7.setBackground(Color.WHITE);
        button7.setFont(new Font("΢���ź�", 1, 18));
        button7.setBorderPainted(false);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == button7) {
                    OptionPane option = new OptionPane();
                    dispose();
                }
            }
        });

        box.add(label);
        box0.add(label0);
        box9.add(label1);
        box1.add(button1);
        box2.add(button2);
        box3.add(button3);
        box4.add(button4);
        box5.add(button5);
        box6.add(button6);
        /**�޸Ķ�����Ϣ*/
        box10.add(button8);
        box7.add(button7);


        base.add(box);
        base.add(Box.createVerticalStrut(40));
        base.add(box0);
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
        /**�޸Ķ�����Ϣ*/
        base.add(box10);
        base.add(Box.createVerticalStrut(40));
        base.add(box7);
        base.add(Box.createVerticalStrut(40));

        contenctPanel.add(base);
        add(contenctPanel);
    }

}
