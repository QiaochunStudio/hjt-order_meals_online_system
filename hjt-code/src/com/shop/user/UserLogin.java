package com.shop.user;
/***�û���¼����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class UserLogin {
	
	Scanner cin = new Scanner(System.in);
	public void getLogin() {
		int cout = 0;//������
		Timewait wait = new Timewait();
		DBuserPassdecide passdecide = new DBuserPassdecide();
		DBuserNamedecide namedecide = new DBuserNamedecide();
		
		out.println("\t\t***************  ��ӭ��¼ Hern �����̳��˻�  ***************\n\n");
		out.println("\t\t\t0��û���̳��˻���ע���˻���\n");
		out.println("\t\t\t1�����̳��˻����˻���¼��\n");
		out.print("\n\t\t\t���������ֽ�������ѡ��");
		int i = cin.nextInt();
		if(i == 0){
			UserRegion reg = new UserRegion();
			reg.getRegion();
		}else if(i != 1){
			System.out.println("\t\t\t�������ѡ���д�����������ѡ��!");
			getLogin();
		}
		out.print("\n\n\t\t\t���������û�����");
		String username = cin.next();//�û���
		String password;//�û�����
	
		if(namedecide.decideUsername(username)){
			out.print("\n\t\t\t�����������룺");
			password = cin.next();
			if(passdecide.decideUserpass(username, password)) {
				
				while(true) {
					Rand rand= new Rand();
					int num = rand.getRandom();
					out.print("\n\t\t\t�������������֤�루"+ num +")��");
					int n = cin.nextInt();
					if(n != num) {
						out.println("\n\t\t\t���������֤�벻��ȷ�����������룡\n");
						continue;
					}
					else {
						out.println("\n\t\t\t�𾴵�  "+ username + "  ��Ա��ϲ����¼�ɹ�������");
						out.println("\n\t\t\t\t���������û����棬���Ժ�");
						wait.wait1000();
						
						UserSelect userselect = new UserSelect();
						userselect.Select(username);
					}
				}
				
			}else {
				out.println("\n\t\t\t����������벻��ȷ�����������룡����");
				out.println("\n\t\t\t�������Ѿ����� " + cout + " �����루���ֻ�ܳ����������Σ���");
				if(cout < 4){
					cout++;
					getLogin();
				}else{
					cout = 0;//�ָ�cout��������ֵ
					out.println("\n\t\t\t\t�������Ѿ����� 3 �����룬�뷵�����϶���ϵͳ�������һ����룡");
					out.println("\n\t\t\t\t�����������϶���ϵͳ�����棬���Ժ�");
					wait.wait1000();
					Welcome welcome = new Welcome();
					welcome.getWelcome();
				}
			}
		}else {
			out.println("\n\t\t\t��������û�������ȷ�����������룡����");
			wait.wait1000();
			getLogin();
		}
			
	}
	
}
