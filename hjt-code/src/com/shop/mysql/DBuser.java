package com.shop.mysql;
/***��ȡ�����û���Ϣ***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBuser {
	
	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public void getUser() {
		DBconnection db = new DBconnection();
		conn = db.getConn();
		try {
			pres = conn.prepareStatement("select * from user");
			res = pres.executeQuery();	//ִ�в�ѯ���
			out.println("\t\t----�� �� �� ��-----"+"---�� �� ��------"+"--�� �� �� ��------"+"--�� �� �� �� ֤ ��------"+"--�� �� �� ��------"+"--�� �� �� ��------"+"--�� �� �� ַ----");
			
			while(res.next()){
				int id = res.getInt("userId");
				String name = res.getString("userName");
				String pass = res.getString("userPass");
				String card = res.getString("userCard");
				int age = res.getInt("userAge");
				String email = res.getString("userEmail");
				String address = res.getString("userAddress");
						
				System.out.println("\t\t\t"+id+" \t   "+name+"\t   "+pass+"\t    "+card+"\t      "+age+" \t  "+email+"  "+address+"\n");
			}
			
			res.close();
			pres.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
