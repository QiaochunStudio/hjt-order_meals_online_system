package com.shop.admin;
/***����Ա�鿴�û�����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.*;
import java.sql.*;
import java.util.*;
import java.math.*;
import static java.lang.System.out;

public class AdminSearchuser {
	
	public void Searchuser() {
		Timewait wait = new Timewait();
		Scanner cin = new Scanner(System.in);
		DBuser user = new DBuser();
		user.getUser();
		out.print("\n\n\t\t�������е��û���������������ع���Ա�����棺");
		String str = cin.next();
		out.println("\n\n\t\t�������ع���Ա�����棬���Ժ�");
		wait.wait2000();
		AdminWelcome welcome = new AdminWelcome();
		welcome.getWelcome();
	}

}
