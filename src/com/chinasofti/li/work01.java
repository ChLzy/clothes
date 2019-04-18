package com.chinasofti.li;

public class work01 {

	public static void main(String[] args) {
		// 7. *给定一个数组，把这个数组中所有元素顺序进行颠倒
		int[] arr={44,34,56,66,32,77};
		int[] newarr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			newarr[i]=arr[arr.length-1-i];
			System.out.print(newarr[i]+",");
		}
	}
}
