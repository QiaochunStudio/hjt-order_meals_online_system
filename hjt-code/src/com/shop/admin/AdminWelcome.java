package com.shop.admin;
/***����Ա��ӭ����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.*;
import java.sql.*;
import java.util.*;
import java.math.*;
import static java.lang.System.out;

public class AdminWelcome {
	
	public void getWelcome() {
		
		out.println("\t\t***************  ��ӭ���� Hern �̳ǹ���Ա���� ***************\n");
		out.println(" \t\t\t\t1�������Ʒ\n");
		out.println(" \t\t\t\t2���޸���Ʒ\n");
		out.println(" \t\t\t\t3��ɾ����Ʒ\n");
		out.println(" \t\t\t\t4���鿴�û��б�\n");
		out.println(" \t\t\t\t5��ɾ���û�\n");
		out.println(" \t\t\t\t6������Աע��\n");
		out.println(" \t\t\t\t7���˳�����Ա��¼\n");
		AdminSelect select = new AdminSelect();
		select.getSelect();
	}

}
