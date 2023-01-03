package com.shop.admin;
/***����Ա�޸���Ʒ����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class AdminUpdategoods {
	
	Scanner cin = new Scanner(System.in);
	
	public void Updategoods() {
		
		Timewait wait = new Timewait();

		DBgoods goods = new DBgoods();

		DBgoodsUP up = new DBgoodsUP();
		
		out.println("\t\t***************  �� �� ��Ʒ �� Ϣ ***************\n\n");
		out.println("\n\t\t\t1���޸���Ʒ����");
		out.println("\n\t\t\t2���޸���Ʒ��������");
		out.println("\n\t\t\t3���޸���Ʒ��Ա�۸�");
		out.println("\n\t\t\t4���޸���Ʒ�ǻ�Ա�۸�");
		out.println("\n\t\t\t5���޸���Ʒ����");
		out.print("\n\n\t\t�����������ֽ���ѡ��");
		int n = cin.nextInt();
		goods.getGoods();
		wait.wait500();
		int goodsid;

		while(true) {
			out.print("\n\n\t\t�������е���Ʒ������������Ʒ��Ž����޸ģ�");
			goodsid = cin.nextInt();
			DBgoodsId id = new DBgoodsId(); 
			if(goodsid < 1 || id.getgoodsID(goodsid) != goodsid || id.getgoodsID(goodsid) == 0) {
				out.print("\n\t\t���������Ʒ��Ų����ڣ����������룺");
				continue;
			}else {
				break;
			}
		}
		
		switch(n) {
			case 1:{
				out.print("\n\t\t�������µĵ���Ʒ���ƣ�");
				String name = cin.next();
				up.setupgoodsName(goodsid, name);
				AdminUpdategoods update = new AdminUpdategoods();
				update.back();
				break;
				
			}case 2:{
				out.print("\n\t\t�������µĵ���Ʒ�������ڣ�");
				String date = cin.next();
				up.setupgoodsDate(goodsid, date);
				AdminUpdategoods update = new AdminUpdategoods();
				update.back();
				break;
				
			}case 3:{
				out.print("\n\t\t�������µĵ���Ʒ��Ա�۸�");
				BigDecimal vipmoney = cin.nextBigDecimal();
				up.setupgoodsVIPmoney(goodsid, vipmoney);
				AdminUpdategoods update = new AdminUpdategoods();
				update.back();
				break;
				
			}case 4:{
				out.print("\n\t\t�������µĵ���Ʒ�ǻ�Ա�۸�");
				BigDecimal money = cin.nextBigDecimal();
				up.setupgoodsMoney(goodsid, money);
				AdminUpdategoods update = new AdminUpdategoods();
				update.back();
				break;
				
			}case 5:{
				out.print("\n\t\t�������µĵ���Ʒ������");
				int num = cin.nextInt();
				up.setupgoodsNum(goodsid, num);
				AdminUpdategoods update = new AdminUpdategoods();
				update.back();
				break;
				
			}default:{
				out.println("\n\t\t������������!");
				break;
			}
		
		}
		
	}
	
	public void back() {
		Timewait wait = new Timewait();
		AdminUpdategoods up = new AdminUpdategoods();
		
		out.println("\n\t\t�޸ĳɹ�!");
		out.print("\n\n\t\t�������Ƿ�Ҫ����ɾ��(���� Y/y ����ִ�в��������򷵻ع���Ա������)��");
		
		String str = cin.next();
		if(str.equals("Y") || str.equals("y")) {
			wait.wait500();
			up.Updategoods();
		}else {
			out.println("\n\n\t\t�������ع���Ա�����棬���Ժ�\n");
			wait.wait1000();
			AdminWelcome welcome = new AdminWelcome();
			welcome.getWelcome();
		}
	}
}
