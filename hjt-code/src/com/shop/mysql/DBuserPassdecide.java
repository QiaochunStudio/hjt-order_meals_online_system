package com.shop.mysql;
/***�ж��û������Ƿ���ȷ***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBuserPassdecide {
	
	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public boolean decideUserpass(String username, String userpass){
			
		DBconnection db = new DBconnection();
		conn = db.getConn();
			
		try{
			pres = conn.prepareStatement("select userPass from user where userName = ?");
			pres.setString(1, username);
			res = pres.executeQuery();
			while(res.next()){
				String pass = res.getString("userPass");
				if(pass.equals(userpass)){
					return true;
				}
			}
			res.close();
			pres.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
}
