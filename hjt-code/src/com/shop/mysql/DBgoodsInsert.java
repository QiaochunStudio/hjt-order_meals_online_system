package com.shop.mysql;
/***�����Ʒ***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBgoodsInsert {

	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public boolean Goodsinsert(String goodsname, String goodsdate, BigDecimal goodsvip, BigDecimal goodsmoney, int goodsnum) {
		
		DBconnection db = new DBconnection();
		conn = db.getConn();
		try{
			pres = conn.prepareStatement("insert into goods (goodsName, goodsDate, goodsVIPmoney, goodsMoney, goodsNum) values(?,?,?,?,?)");
			pres.setString(1, goodsname);
			pres.setString(2, goodsdate);
			pres.setBigDecimal(3, goodsvip);
			pres.setBigDecimal(4, goodsmoney);
			pres.setInt(5, goodsnum);
			int i = pres.executeUpdate();
			if(i == 1){
				return true;
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
