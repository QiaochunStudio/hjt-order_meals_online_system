package com.shop.mysql;
/***��ȡ������Ʒ***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class DBgoods {
	
	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public void getGoods() {
		
		DBconnection db = new DBconnection();
		conn = db.getConn();
		
		try{
			pres = conn.prepareStatement("select * from goods ");
			res = pres.executeQuery();
			System.out.println("\t\t---- ��  Ʒ �� �� ----"+" ��  Ʒ  ��  �� ----" + " ��  Ʒ �� �� �� �� ----"+" �� Ա �� �� ----" + " �� �� Ա �� �� ----" + " ��  Ʒ �� �� ----");
			while(res.next()){
				int id = res.getInt("goodsID");
				String name = res.getString("goodsName");
				String date = res.getString("goodsDate");
				BigDecimal vipmoney = res.getBigDecimal("goodsVIPmoney");
				BigDecimal money = res.getBigDecimal("goodsMoney");
				int num = res.getInt("goodsNum");
				System.out.println("\t\t\t"+id+"\t        "+name+"\t      "+date+"\t "+vipmoney+"\t\t"+money+"\t\t  "+num);
			}
			res.close();
			pres.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
