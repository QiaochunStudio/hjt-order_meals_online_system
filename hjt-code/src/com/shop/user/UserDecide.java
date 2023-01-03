package com.shop.user;
/***��ĸ�����ּ��***/

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

public class UserDecide {
	
	public boolean Decide(String str) {
		
		boolean isDigit = false;//�ж��Ƿ�������
		boolean isLetter = false;//�ж��Ƿ�Ϊ�ַ�
		boolean ischar = false;//�ж��Ƿ�Ϊ��ĸ������
		
		for(int i = 0; i < str.length(); i++){
			if(Character.isDigit(str.charAt(i))){//�ж��Ƿ�Ϊ����
				isDigit = true;
			}else if(Character.isLetter(str.charAt(i))){//�ж��Ƿ�Ϊ��ĸ
				isLetter = true;
			}else if( Character.isDigit(str.charAt(i)) == false && Character.isLetter(str.charAt(i)) == false){
				//Ҫ��ֻ�������ֺ���ĸ
				ischar = true;
				break;
			}
		}
		
		if(isDigit == false){
			return false;
		}else if(isLetter == false ){
			return false;
		}else if(ischar == true ){
			return false;
		}
		
		return true;
		
	}
	
	public boolean Email(String str) {
		boolean isLetter = false;
		boolean isSpot = false;
		boolean iscom = false;
		if(str.contains(".com") ||str.contains(".cn") || str.contains(".net") || str.contains(".edu")) {
			iscom = true;
		}
		
		if(str.contains("@")) {
			isLetter = true;
		}
		
		if(str.contains(".")) {
			isSpot = true;
		}
		
		if(isSpot == false || isLetter == false || iscom == false) {
			return false;
		}
		
		return true;
	}

}
