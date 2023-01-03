package com.shop.mysql;
/***��ȡ�û�����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBuserName {

	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public String getuserName(int usersid) {
		
		DBconnection db = new DBconnection();
		conn = db.getConn();
		
		try{
			pres = conn.prepareStatement("select userID, userName from user where userID = ?");
			pres.setInt(1, usersid);
			res = pres.executeQuery();
			while(res.next()){
				int id = res.getInt("userID");
				if(usersid == id){
					return res.getString("userName");
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "";
	}
}
