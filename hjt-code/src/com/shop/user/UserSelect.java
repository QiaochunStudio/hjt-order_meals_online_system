package com.shop.user;
/***�û�ѡ�����***/

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

public class UserSelect {
	
	public void Select(String username) {
		Scanner cin = new Scanner(System.in);
		Timewait wait = new Timewait();
		
		while(true) {
			out.println("\n\t\t\t�𾴵�  "+ username + "  ��Ա");
			out.println("\n\t\t\t  1���鿴���ﳵ");
			out.println("\n\t\t\t  2��������Ʒ");
			out.println("\n\t\t\t  0���˳��û���¼");
			out.print("\n\n\t\t\t���������ֽ���ѡ��");
			int selectnum  = cin.nextInt();
			if(selectnum == 1) {
				UserShop shop = new UserShop();
				shop.Shop(username);
			}else if(selectnum == 2) {
				Userbuy buy = new Userbuy();
				buy.Buy(username);
				
			}else if(selectnum == 0){
				out.println("\n\t\t    �𾴵�  " + username + "  ��Ա�������������϶���ϵͳ�����棬���Ժ�");
				wait.wait2000();
				Welcome welcome = new Welcome();
				welcome.getWelcome();
			}else {
				out.println("\n\n\t\t\t���������������������룡");
				wait.wait500();
				continue;
			}
			
		}
	}

}
