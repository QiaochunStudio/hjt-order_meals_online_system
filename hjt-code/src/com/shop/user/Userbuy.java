package com.shop.user;
/***������Ʒ����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.mysql.*;
import com.shop.other.Timewait;
import com.shop.index.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.math.*;
import static java.lang.System.out;

public class Userbuy {
	
	public void Buy(String username) {
		Scanner cin = new Scanner(System.in);
		Timewait wait = new Timewait();
		
		while(true) {
			DBgoods goods = new DBgoods();
			goods.getGoods();
			DBgoodsId goodsid = new DBgoodsId();
			DBgoodsName goodsname = new DBgoodsName();
			DBgoodsVIPmoney money = new DBgoodsVIPmoney();
			DBgoodsNum goodsnum = new DBgoodsNum();
			DBcostInsert insert = new DBcostInsert();
			DBgoodsUP update = new DBgoodsUP();
			out.println("\n\t\t\t�𾴵�  "+ username + "  ��Ա");
			out.println("\n\t\t\t�����̳����е���Ʒ��");
			out.print("\n\n\t\t\t������Ʒ��Ž��й���");
			int id = cin.nextInt();
			
			if(goodsid.getgoodsID(id) == id) {
				out.print("\n\n\t\t\t���빺�����Ʒ������");
				int num = cin.nextInt();
				int n = goodsnum.getgoodsNum(id);
				if(num > n || num == 0) {
					out.println("\n\n\t\t\t\t��Ʒ��治�������������룡");
					continue;
				}else {
					String name = goodsname.getgoodsName(id);//��ȡ��Ʒ����
					BigDecimal vip = money.getgoodsVIPmoney(id);//��ȡ��Ʒ�۸�
					BigDecimal cost = vip.multiply(BigDecimal.valueOf(num));
					
					if(insert.Goodsinsert(username, id, name, vip, num, cost)) {
						out.println("\n\n\t\t\t\t����ɹ���");
						out.println("\n\n\t\t\t���������û������棡");
						
						update.setupgoodsNum(id, n-num);//ͬʱ������Ʒ����
						wait.wait1000();
						UserSelect userselect = new UserSelect();
						userselect.Select(username);
					}
				}
			}else {
				out.println("\n\n\t\t\t���������Ʒ��Ų���ȷ�����������룡");
				continue;
			}
		}

	}

}
