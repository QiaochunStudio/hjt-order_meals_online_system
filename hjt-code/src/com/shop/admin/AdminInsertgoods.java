package com.shop.admin;
/***����Ա�����Ʒ����***/

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

public class AdminInsertgoods {
	
	public void Insertgoods() {
		Scanner cin = new Scanner(System.in);
		Timewait wait = new Timewait();
		
		DBgoodsNamedecide decide = new DBgoodsNamedecide();
		
		DBgoodsInsert insert = new DBgoodsInsert();
		
		out.print("\n\t\t����������Ʒ���ƣ�");
		String goodsname = cin.next();
		if(decide.decideGoodsname(goodsname)) {
			out.println("\n\t\t���������Ʒ�����Ѵ��ڣ����������룡");
			wait.wait500();
			Insertgoods();
		}
		
		out.print("\n\t\t����������Ʒ�������ڣ���ʽ��2018-01-01����");
		String date = cin.next();
		out.print("\n\t\t����������Ʒ�Ļ�Ա�۸�");
		BigDecimal vipmoney = cin.nextBigDecimal();
		out.print("\n\t\t����������Ʒ�ķǻ�Ա�۸�");
		BigDecimal money = cin.nextBigDecimal();
		out.print("\n\t\t����������Ʒ��������");
		int num = cin.nextInt();
		if(insert.Goodsinsert(goodsname, date, vipmoney, money, num)) {
			out.println("\n\t\t\t��Ʒ��ӳɹ���\n");
			out.print("\n\n\t\t�������Ƿ�Ҫ����ɾ��(���� Y/y ����ִ�в��������򷵻ع���Ա������)��");
			String str = cin.next();
			if(str.equals("Y") || str.equals("y")) {
				wait.wait500();
				Insertgoods();
			}else {
				out.println("\n\n\t\t�������ع���Ա�����棬���Ժ�\n");
				wait.wait1000();
				AdminWelcome welcome = new AdminWelcome();
				welcome.getWelcome();
			}
		}else {
			out.println("\n\t\t\t��Ʒ���ʧ�ܣ�����������ӣ�\n");
			wait.wait2000();
			Insertgoods();
		}
	}

}
