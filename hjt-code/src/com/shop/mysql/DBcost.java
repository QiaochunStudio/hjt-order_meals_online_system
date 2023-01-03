package com.shop.mysql;
/***��ȡ�����¼***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBcost {

	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public void getCost(String username) {
		
		DBconnection db = new DBconnection();
		conn = db.getConn();
		
		try{
			pres = conn.prepareStatement("select * from cost where userName = ?");
			pres.setString(1, username);
			res = pres.executeQuery();
			System.out.println("\t\t---- ��  Ʒ �� �� ----"+" ��  Ʒ  ��  �� ----" + " ��  Ʒ �� �� ----"+" �� �� �� �� ----" + " ��  Ʒ �� �� �� �� ----");
			while(res.next()){
				int id = res.getInt("goodsID");
				String name = res.getString("goodsName");
				BigDecimal vipmoney = res.getBigDecimal("goodsVIPmoney");
				int num = res.getInt("goodsNum");
				BigDecimal usercost = res.getBigDecimal("userCost");
				System.out.println("\t\t\t"+id+"\t        "+name+"\t      "+vipmoney+"\t\t"+num+"\t\t"+usercost);
			}
			res.close();
			pres.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
