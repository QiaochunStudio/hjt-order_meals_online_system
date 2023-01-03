package com.shop.mysql;
/***�û�ɾ��***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBuserDel {

	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public boolean setDeluser(int userid) {
		
		DBconnection db = new DBconnection();
		conn = db.getConn();
		try {
			pres = conn.prepareStatement("delete from user where userID = ?");
			pres.setInt(1, userid);
			int i = pres.executeUpdate();
			if(i == 1){
				return true;
			}
			res.close();
			pres.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
