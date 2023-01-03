package com.shop.admin;
/***����Աע�����***/

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

public class AdminRegion {
	
	public void getRegion() {
		
		Scanner cin = new Scanner(System.in);
		Timewait wait = new Timewait();
		out.println("\t\t***************  ��ӭע�� Hern �����̳ǹ���Ա�˻�  ***************\n\n");
		out.print("\t\t���������û��������֡���ĸ��ϣ����ȴ���5λ��С��16λ����");
		
		String adminname = cin.next();//�û���
		String password;//�û�����
		
		DBadminNamedecide dbadminname = new DBadminNamedecide();
		DBadminRegion insert = new DBadminRegion();
		if( dbadminname.decideAdminname(adminname)){
			out.println("\n\t\t��������û����Ѵ��ڣ�������ע�ᣡ");
			wait.wait500();
			getRegion();	
		}else if(adminname.length() < 6 || adminname.length() > 16){
			out.println("\n\t\t������ĳ��Ȳ����Ϲ淶��������ע�ᣡ\n");
			wait.wait500();
			getRegion();
		}else {
			UserDecide userdecide = new UserDecide();
			if(userdecide.Decide(adminname) == false) {
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
					if(insert.insertAdmin(adminname,password )) {
						out.println("\n\n\t\t    �𾴵�  " + adminname + "  ����Ա����ϲ��ע��ɹ���\n");
						out.println("\n\n\t\t\t\t�����������Ա�����棬���Ժ�");
						wait.wait2000();
						AdminWelcome welcome = new AdminWelcome();
						welcome.getWelcome();
					}
				}
			}
		}
	}
}
