package com.shop.user;
/***�û����ﳵ����***/

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

public class UserShop {
	
	public void Shop(String username) {
		
		Scanner cin = new Scanner(System.in);
		Timewait wait = new Timewait();
		while(true) {
			DBcost cost = new DBcost();
			cost.getCost(username);
			
			DBcostDel costdel = new DBcostDel();
			out.println("\n\t\t\t�𾴵�  "+ username + "  ��Ա");
			out.println("\n\t\t\t���������������Ʒ��");
			out.print("\n\n\t\t\t���� Y ������Ʒ,���� N ��չ��ﳵ��");
			String str = cin.next();
			if(str.equals("Y") || str.equals("y") || str.equals("N") || str.equals("n")) {
				costdel.Costdel(username);
				out.println("\n\n\t\t\t\t�ɹ�!!!");
				wait.wait500();
				out.println("\n\t\t\t\t���������û������棬���Ժ�");
				wait.wait2000();
				UserSelect userselect = new UserSelect();
				userselect.Select(username);
			}else {
				out.println("\n\n\t\t\t���������������������룡");
				wait.wait1500();
				continue;
			}
		}

	}
}
