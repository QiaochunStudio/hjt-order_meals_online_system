package com.shop.admin;
/***����Աѡ�����***/

import com.shop.user.*;
import com.shop.admin.*;
import com.shop.index.*;
import com.shop.mysql.*;
import com.shop.other.*;
import java.sql.*;
import java.util.*;
import java.math.*;
import static java.lang.System.out;

public class AdminSelect {
	
	public void getSelect() {
		Timewait wait = new Timewait();
		Scanner cin = new Scanner(System.in);
		out.print("\t\t�����������ֽ���ѡ��");
		int n = cin.nextInt();
		
		switch(n){
		
			case 1:{//�����Ʒ
				
				out.println("\n\t\t\t��ѡ����� �����Ʒ ѡ����Ժ�\n");
				AdminInsertgoods insert = new AdminInsertgoods();
				insert.Insertgoods();
				wait.wait500();
				break;
				
			}case 2:{//�޸���Ʒ
				out.println("\n\t\t\t��ѡ����� �û���¼ ѡ����Ժ�\n");
				AdminUpdategoods update = new AdminUpdategoods();
				update.Updategoods();
				wait.wait500();
				break;
				
			}case 3:{//ɾ����Ʒ
				
				out.println("\n\t\t\t��ѡ����� �޸���Ʒ ѡ����Ժ�\n");
				wait.wait500();
				AdmingoodsDel del = new AdmingoodsDel();
				del.goodsDel();
				break;
				
			}case 4:{//�鿴�û��б�
				
				out.println("\n\t\t\t��ѡ����� �鿴�û��б� ѡ����Ժ�\n");
				AdminSearchuser user =  new AdminSearchuser();
				user.Searchuser();
				break;
				
			}case 5:{//ɾ���û�
				
				out.println("\n\t\t\t��ѡ����� ɾ���û� ѡ����Ժ�\n");
				wait.wait500();
				AdminuserDel del = new AdminuserDel();
				del.userDel();
				break;
				
			}case 6:{//����Աע��
				
				out.println("\n\t\t\t��ѡ����� ����Աע�� ѡ����Ժ�\n");
				wait.wait500();
				AdminRegion region = new AdminRegion();
				region.getRegion();
				break;
				
			}case 7:{//�˳�����Ա��¼
			
				out.println("\n\t\t\t��ѡ����� �˳�����Ա��¼ ѡ����Ժ�\n");
				wait.wait500();
				out.println("\n\t\t\t�����������϶���ϵͳ�����棬���Ժ�\n");
				wait.wait1500();
				Welcome welcome = new Welcome();
				welcome.getWelcome();
				break;
				
			}default:{//�������ѡ��
				
				out.println("\n\t\t\t�������ѡ���������������룡\n");
				wait.wait500();
				AdminWelcome welcome = new AdminWelcome();
				welcome.getWelcome();
				break;
			}
		}
	}

}
