package com.shop.admin;
/***����Ա��Ʒɾ������***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.Timewait;
import java.sql.*;
import java.util.*;
import java.math.*;
import static java.lang.System.out;

public class AdmingoodsDel {
	
	public void goodsDel() {
		
		Timewait wait = new Timewait();
		
		DBgoods goods = new DBgoods();
		goods.getGoods();
		
		DBgoodsId id = new DBgoodsId();
		
		DBgoodsDel del = new DBgoodsDel();
		
		DBgoodsName goodsname = new DBgoodsName();
		Scanner cin = new Scanner(System.in);
		out.print("\n\n\t\t�������е���Ʒ������������Ʒ��Ž���ɾ����");
		int n = cin.nextInt();
		String gname = goodsname.getgoodsName(n);
		if(n < 1 || id.getgoodsID(n) != n || id.getgoodsID(n) == 0) {
			out.println("\n\t\t���������Ʒ��Ų����ڣ�\n");
			wait.wait1000();
			goodsDel();
		}else if(del.setDelgoods(n)) {
			out.println("\n\t\t"+ gname +"��Ʒɾ���ɹ�\n");
			out.print("\n\n\t\t�������Ƿ�Ҫ����ɾ��(���� Y/y ����ִ�в��������򷵻ع���Ա������)��");
			String str = cin.next();
			if(str.equals("Y") || str.equals("y")) {
				wait.wait500();
				goodsDel();
			}else {
				out.println("\n\n\t\t�������ع���Ա�����棬���Ժ�\n");
				wait.wait1000();
				AdminWelcome welcome = new AdminWelcome();
				welcome.getWelcome();
			}
		}
	}
}
