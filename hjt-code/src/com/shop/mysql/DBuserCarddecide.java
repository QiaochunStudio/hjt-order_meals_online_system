package com.shop.mysql;
/***��ȡ�û��˺š�����***/
import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBuserCarddecide {

	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public boolean decideUsercard(String usercard, String useremail){
			
		DBconnection db = new DBconnection();
		conn = db.getConn();
			
		try{
			pres = conn.prepareStatement("select userName, userCard, userPass, userEmail from user where userCard = ? and userEmail = ?");
			pres.setString(1, usercard);
			pres.setString(2, useremail);
			res = pres.executeQuery();
			while(res.next()){
				String card = res.getString("userCard");
				String name = res.getString("userName");
				String pass = res.getString("userPass");
				String email = res.getString("userEmail");
				if(card.equals(usercard) && email.equals(useremail)){
					out.println("\n\t\t\t�����û����ǣ�"+name);
					out.println("\n\t\t\t�����������ǣ�"+pass);
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
