package com.shop.user;
/***�鿴�̳���Ʒ����***/

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

public class UserLookgoods {
	
	public void getLookgoods() {
		Scanner cin = new Scanner(System.in);
		Timewait wait = new Timewait();
		DBgoods goods = new DBgoods();
		goods.getGoods();
		
		out.println("\n\t\t\t�����̳����е���Ʒ��");
		out.print("\n\n\t\t\t���� Y/y ������Ʒ,���򷵻����϶���ϵͳ�����棺");
		String str = cin.next();
		if(str.equals("Y") || str.equals("y")) {
			wait.wait1000();
			UserLogin login = new UserLogin();
			login.getLogin();
		}else {
			out.println("\n\n\t\t\t�����������϶���ϵͳ�����棬���Ժ�\n");
			wait.wait1000();
			Welcome welcome = new Welcome();
			welcome.getWelcome();
		}
	}

}
