package com.shop.user;
/***�һ��˻����������***/

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

public class UserSearch {
	Scanner cin = new Scanner(System.in);
	
	public void getSearch() {
		
		while(true) {
			Timewait wait = new Timewait();
			DBuserCarddecide decide = new DBuserCarddecide();
			
			out.print("\n\n\t\t\t�������������֤���룺");
			String card = cin.next();
			out.print("\n\n\t\t\t�������������䣺");
			String email = cin.next();
			if(decide.decideUsercard(card, email)) {
				out.println("\n\t\t\t\t�һ��˻�������!");
				out.print("\n\n\t\t\t����������������϶���ϵͳ�����棺");
				String str = cin.next();

				wait.wait1000();
				Welcome welcome = new Welcome();
				welcome.getWelcome();
				
			}else {
				out.println("\n\n\t\t\t��������û���Ϣ�д�����������!");
				wait.wait1000();
				continue;
			}
		}
		
	}

}
