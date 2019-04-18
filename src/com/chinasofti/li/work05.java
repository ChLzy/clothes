package com.chinasofti.li;

import java.util.Scanner;

public class work05 {

	public static void main(String[] args) {
		/*4. 自定义一个整数数组a，读入一个整数n，如果n 在数组中存在，则输出n 的
		下标；如果不存在，则输出-1。*/
		int[] arr={1,2,3,4,5};
		System.out.println("请输入一个整数：");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(n==arr[i]){
				System.out.println(i);
				break;
			}else if(i==arr.length-1){
				System.out.println("-1");
			}
		}
		
		
	}

}
