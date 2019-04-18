package com.chinasofti.li;


public class work02 {

	public static void main(String[] args) {
	/*	8. *数组的扩容。
		给定一个数组，要求写一个expand 函数，把原有数组的长度扩容一倍，并
		保留原有数组原有的内容。
		例如，给定一个数组int[] a = {1,2,3}，则扩容之后，a 数组为：{1,2,3，
		0,0,0}*/
		int[] a={1,2,3,4,7,8};		
		expand(a);
	
	}
	public static void expand(int[]a){
		int[] newa=new int[a.length*2];
		for(int i=0;i<a.length*2;i++){
			if(i<a.length){
				newa[i]=a[i];			
			}else if( i>=a.length){
				newa[i]=0;
			}
			System.out.print(newa[i]+",");
		}
				
		
		
	}
	

}
