package com.yihecloud.demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
			String beginTime="";
			String endTime="";
			Scanner scanner = new Scanner(System.in);// ����������ɨ����
			System.out.println("please input beginTime��");// ��ʾ�û�����
			beginTime = scanner.nextLine();// ��ȡ�û������һ���ı�
			System.out.println("please input endTime��");// ��ʾ�û�����
			endTime = scanner.nextLine();// ��ȡ�û������һ���ı�
			int[] be = parseStrToInt(beginTime),
			 	  af = parseStrToInt(endTime);
			float x = be[0]%12*43200/11.f,
				  y = af[0]%12*43200/11.f;
			int bs = be[0]%12*3600+be[1]*60+be[2],
				as = af[0]%12*3600+af[1]*60+af[2],
				temp = af[0]-be[0],
				count=temp+1;
			count-=count/12;
			count=(temp%12)==11?count+1:count;
			if(bs>(int)x)count--;
			if(as<(int)y)count--;
			System.out.println("������"+count);
	}
	
	
	/**
	 * 
	 * <pre>
	 *	ת��ʱ���ַ���Ϊ�����ַ���30
	 * </pre>
	 * @author: yijay
	 * @param str
	 * @return
	 * @date 2016��9��10�� ����11:56:26
	 */
	public static int[] parseStrToInt(String str){
		String[] strs = str.split(":");
		int[] nums = new int[strs.length];
		if(strs!=null){
			for(int i=0;i<strs.length;i++){
				nums[i]=Integer.parseInt(strs[i]);
			}
		}
		return nums;
	}
}
