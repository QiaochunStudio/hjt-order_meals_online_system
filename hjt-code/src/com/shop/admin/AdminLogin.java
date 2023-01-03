package com.shop.admin;

import static java.lang.System.out;

import java.util.Scanner;

import com.shop.index.Welcome;
import com.shop.mysql.DBadminNamedecide;
import com.shop.mysql.DBadminPassdecide;
import com.shop.mysql.DBuserNamedecide;
import com.shop.mysql.DBuserPassdecide;
import com.shop.other.Rand;
import com.shop.other.Timewait;
import com.shop.user.UserRegion;
import com.shop.user.UserShop;

public class AdminLogin {

	Scanner cin = new Scanner(System.in);
	public void getLogin() {
		int cout = 0;//������
		Timewait wait = new Timewait();
		DBadminPassdecide passdecide = new DBadminPassdecide();
		DBadminNamedecide namedecide = new DBadminNamedecide();
		
		out.println("\t\t***************  ��ӭ��¼ Hern �����̳ǹ���Ա�˻�  ***************\n\n");
		out.println("\t\t\t0��û�й���Ա�˻���ע���˻���\n");
		out.println("\t\t\t1���й���Ա�˻����˻���¼��\n");
		out.print("\n\t\t\t���������ֽ�������ѡ��");
		int i = cin.nextInt();
		if(i == 0){
			AdminRegion reg = new AdminRegion();
			reg.getRegion();
		}else if(i != 1){
			System.out.println("\t\t\t�������ѡ���д�����������ѡ��!");
			getLogin();
		}
		out.print("\n\n\t\t\t���������û�����");
		String username = cin.next();//�û���
		String password;//�û�����
	
		if(namedecide.decideAdminname(username)){
			out.print("\n\t\t\t�����������룺");
			password = cin.next();
			if(passdecide.decideAdminpass(username, password)) {
				
				while(true) {
					Rand rand= new Rand();
					int num = rand.getRandom();
					out.print("\n\t\t\t�������������֤�루"+ num +")��");
					int n = cin.nextInt();
					if(n != num) {
						out.println("\n\t\t\t���������֤�벻��ȷ�����������룡\n");
						continue;
					}
					else {
						out.println("\n\t\t\t�𾴵�  "+ username + "  ����Ա��ϲ����¼�ɹ�������");
						out.println("\n\t\t\t\t���������̳ǹ�����棬���Ժ�");
						wait.wait1000();
						AdminWelcome welcome= new AdminWelcome();
						welcome.getWelcome();
					}
				}
				
			}else {
				out.println("\n\t\t\t����������벻��ȷ�����������룡����");
				out.println("\n\t\t\t�������Ѿ����� " + cout + " �����루���ֻ�ܳ����������Σ���");
				if(cout < 4){
					cout++;
					getLogin();
				}else{
					cout = 0;//�ָ�cout��������ֵ
					out.println("\n\t\t\t\t�������Ѿ����� 3 �����룬�뷵�����϶���ϵͳ�������һ����룡");
					out.println("\n\t\t\t\t�����������϶���ϵͳ�����棬���Ժ�");
					wait.wait1000();
					Welcome welcome = new Welcome();
					welcome.getWelcome();
				}
			}
		}else {
			out.println("\n\t\t\t��������û�������ȷ�����������룡����");
			wait.wait1000();
			getLogin();
		}
			
	}
}
