package com.shop.index;

/***�̳ǻ�ӭ����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.*;
import java.sql.*;
import java.util.*;
import java.math.*;
import static java.lang.System.out;

public class Welcome {
	
	public void getWelcome() {
		out.println("\t\t***************  ��ӭ���� ��ӭʹ��  ���϶���ϵͳ ***************\n");
//		out.println(" \t\t\t\t1���û�ע��\n");
//		out.println(" \t\t\t\t2���û���¼\n");
//		out.println(" \t\t\t\t3���鿴�̳���Ʒ\n");
//		out.println(" \t\t\t\t4���鿴�ҹ������Ʒ\n");
//		out.println(" \t\t\t\t5������Ա��¼\n");
//		out.println(" \t\t\t\t6���һ��˻�������\n");
//		out.println(" \t\t\t\t7���˳�ϵͳ\n");
		Select select = new Select();
		select.getSelect();
	}
}
