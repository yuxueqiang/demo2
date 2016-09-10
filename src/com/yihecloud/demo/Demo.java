package com.yihecloud.demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
			String beginTime="";
			String endTime="";
			Scanner scanner = new Scanner(System.in);// 创建输入流扫描器
			System.out.println("please input beginTime：");// 提示用户输入
			beginTime = scanner.nextLine();// 获取用户输入的一行文本
			System.out.println("please input endTime：");// 提示用户输入
			endTime = scanner.nextLine();// 获取用户输入的一行文本
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
			System.out.println("次数："+count);
	}
	
	
	/**
	 * 
	 * <pre>
	 *	转换时间字符串为整形字符串30
	 * </pre>
	 * @author: yijay
	 * @param str
	 * @return
	 * @date 2016年9月10日 上午11:56:26
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
