package com.shop.mysql;
/***�ж���Ʒ���Ƿ��ظ�***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBgoodsNamedecide {
	
	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public boolean decideGoodsname(String goodsname){
			
		DBconnection db = new DBconnection();
		conn = db.getConn();
			
		try{
			pres = conn.prepareStatement("select goodsName from goods where goodsName = ?");
			pres.setString(1, goodsname);
			res = pres.executeQuery();
			while(res.next()){
				String name = res.getString("goodsName");
				if(name.equals(goodsname)){
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
