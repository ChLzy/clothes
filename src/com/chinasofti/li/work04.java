package com.chinasofti.li;

import java.util.Scanner;

public class work04 {

	public static void main(String[] args) {
		// 3. 写一个函数，计算一个整数数组的平均值
		double[] arr={1,2,3,4,5};
		avg(arr);
	}
	public static void avg(double[] arr){
		double sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println(sum/arr.length);
	}

}
