package com.shop.mysql;
/***ɾ���û�����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBcostDel {

	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public void Costdel(String name) {
		
		DBconnection db = new DBconnection();
		conn = db.getConn();
		
		try {
			pres = conn.prepareStatement("delete from cost where userName = ?");
			pres.setString(1, name);
			int i = pres.executeUpdate();
			
			res.close();
			pres.close();
			conn.close();
		}catch(Exception e) {
		}
	}
}
