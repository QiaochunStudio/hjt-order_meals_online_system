package com.shop.user;
/***�û�ע�����***/

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

public class UserRegion {
	
	public void getRegion() {
		
		Scanner cin = new Scanner(System.in);
		Timewait wait = new Timewait();
		out.println("\t\t***************  ��ӭע�� Hern �����̳��˻�  ***************\n\n");
		out.print("\t\t���������û��������֡���ĸ��ϣ����ȴ���5λ��С��16λ����");
		
		String username = cin.next();//�û���
		String password;//�û�����
		String card;//�û����֤��
		int age;//�û�����
		String useremail;//�û�����
		String address;//�û���ַ
		
		DBuserNamedecide dbusername = new DBuserNamedecide();
		DBuserregion insert = new DBuserregion();
		if( dbusername.decideUsername(username)){
			out.println("\n\t\t��������û����Ѵ��ڣ�������ע�ᣡ");
			wait.wait500();
			getRegion();	
		}else if(username.length() < 6 || username.length() > 16){
			out.println("\n\t\t������ĳ��Ȳ����Ϲ淶��������ע�ᣡ\n");
			wait.wait500();
			getRegion();
		}else {
			UserDecide userdecide = new UserDecide();
			if(userdecide.Decide(username) == false) {
				out.println("\n\t\t��������û��������Ϲ淶��������ע�ᣡ\n");
				wait.wait500();
				getRegion();
			}
			
			out.print("\n\t\t�����������룺");
			password = cin.next();
			if(userdecide.Decide(password) == false) {
				out.println("\n\t\t����������벻���Ϲ淶��������ע�ᣡ\n");
				wait.wait500();
				getRegion();
			}
			out.print("\n\t\t�����������֤���룺");
			card = cin.next();
			if(card.length() != 18) {
				out.println("\n\t\t����������֤�����Ϲ淶��������ע�ᣡ\n");
				wait.wait500();
				getRegion();
			}
			out.print("\n\t\t������������(Ҫ��������18~65��֮��)��");
			age = cin.nextInt();
			if(age < 18 || age > 65) {
				out.println("\n\t\t����������䲻���Ϲ淶��������ע�ᣡ\n");
				wait.wait500();
				getRegion();
			}
			out.print("\n\t\t�������������ַ��");
			useremail = cin.next();
			if(userdecide.Email(useremail) == false) {
				out.println("\n\t\t����������䲻���Ϲ淶��������ע�ᣡ\n");
				wait.wait500();
				getRegion();
			}
			
			out.print("\n\t\t����������ϵ��ַ��");
			address = cin.next();
			while(true) {
				Rand rand= new Rand();
				int num = rand.getRandom();
				out.print("\n\t\t�������������֤�루"+ num +")��");
				int n = cin.nextInt();
				if(n != num) {
					out.println("\t\t���������֤�벻��ȷ�����������룡\n");
					continue;
				}
				else {
					if(insert.insertUser(username, password, card, age, useremail, address)) {
						out.println("\n\t\t    �𾴵�  " + username + "  ��Ա����ϲ��ע��ɹ���\n");
						out.println("\n\n\t\t�����������϶���ϵͳ�����棬���Ժ�");
						wait.wait2000();
						Welcome welcome = new Welcome();
						welcome.getWelcome();
					}
				}
			}
		}
	}
}
