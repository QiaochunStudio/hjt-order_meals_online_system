package com.shop.admin;
/***����Աɾ���û�����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.Timewait;
import java.sql.*;
import java.util.*;
import java.math.*;
import static java.lang.System.out;

public class AdminuserDel {
	
	public void userDel() {
		Timewait wait = new Timewait();
		
		AdminWelcome welcome = new AdminWelcome();
		
		DBuser user = new DBuser();
		user.getUser();
		
		DBuserDel del = new DBuserDel();
		
		DBuserName username = new DBuserName();
		
		DBuserId id = new DBuserId();
		
		DBcostDel costdel = new DBcostDel();
		
		Scanner cin = new Scanner(System.in);
		out.print("\n\n\t\t�������е��û������������û���Ž���ɾ����");
		int n = cin.nextInt();
		String uname = username.getuserName(n);
		if(n < 1 || id.getuserID(n) != n) {
			out.println("\n\t\t��������û���Ų����ڣ�\n");
			wait.wait1000();
			userDel();
		}else if(del.setDeluser(n)) {
			costdel.Costdel(uname);
			out.println("\n\t\t"+ uname +"�û�ɾ���ɹ���\n");
			out.print("\n\n\t\t�������Ƿ�Ҫ����ɾ��(���� Y/y ����ִ�в��������򷵻ع���Ա������)��");
			String str = cin.next();
			if(str.equals("Y") || str.equals("y")) {
				wait.wait500();
				userDel();
			}else {
				out.println("\n\n\t\t�������ع���Ա�����棬���Ժ�\n");
				wait.wait1000();
				welcome.getWelcome();
			}
		}else {
			out.println("\n\t\t"+ uname +"�û�ɾ��ʧ�ܣ�������ɾ����\n");
			wait.wait2000();
			userDel();
		}
	}
	
}
