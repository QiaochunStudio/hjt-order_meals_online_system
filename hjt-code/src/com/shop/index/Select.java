package com.shop.index;
/***�̳�ѡ�����***/

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

public class Select {
	
	public void getSelect()  {
		
		Timewait wait = new Timewait();
		Scanner cin = new Scanner(System.in);
		out.print("\t\t�����������ֽ���ѡ��");
		int n = cin.nextInt();
		switch(n){
			case 1:{//�û�ע��ѡ��
				out.println("\n\t\t\t��ѡ����� �û�ע�� ѡ����Ժ�\n");
				wait.wait500();
				UserRegion region = new UserRegion();
				region.getRegion();
				break;
				
			}case 2:{//�û���¼ѡ��
				out.println("\n\t\t\t��ѡ����� �û���¼ ѡ����Ժ�\n");
				wait.wait500();
				UserLogin login = new UserLogin();
				login.getLogin();
				break;
				
			}case 3:{//�鿴�̳�ѡ��
				out.println("\n\t\t\t��ѡ����� �鿴�̳���Ʒ ѡ����Ժ�\n");
				wait.wait500();
				UserLookgoods look = new UserLookgoods();
				look.getLookgoods();
				break;
				
			}case 4:{//�鿴�ҹ������Ʒѡ��
				out.println("\n\t\t\t��ѡ����� �鿴�ҹ������Ʒ ѡ����Ժ�\n");
				wait.wait500();
				UserLogin login = new UserLogin();
				login.getLogin();
				break;
				
			}case 5:{//����Ա��¼ѡ��
				out.println("\n\t\t\t��ѡ����� ����Ա��¼ ѡ����Ժ�\n");
				wait.wait500();
				AdminLogin login = new AdminLogin();
				login.getLogin();
				break;
				
			}case 6:{//�һ��˻�������
				out.println("\n\t\t\t��ѡ����� �һ��˻������� ѡ����Ժ�\n");
				wait.wait500();
				UserSearch search = new UserSearch();
				search.getSearch();
				break;
				
			}case 7:{//�˳�ϵͳѡ��
				out.println("\n\t\t\t��ѡ����� �˳�ϵͳ ѡ����Ժ�\n");
				wait.wait2000();
				System.exit(0);
				break;
				
			}default:{//�������ѡ��
				out.println("\n\t\t\t�������ѡ���������������룡\n");
				wait.wait500();
				Welcome welcome = new Welcome();
				welcome.getWelcome();
				break;
			}
		}
	}

}
