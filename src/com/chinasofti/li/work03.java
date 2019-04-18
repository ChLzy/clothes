package com.chinasofti.li;

public class work03 {
	static int[] a = {1,3,2,5,7};
	static int index = 5;
	public static void main(String[] args) {
		//9. *数组的插入和删除
		delete(2);
		delete(1);	

		insert(1,4);
	}
	public static void delete(int pos){
		int[] newa=new int[5];		
		for(int i=0;i<index-1;i++){
			if(i<pos){
				newa[i]=a[i];
			}else{
				newa[i]=a[i+1];
			}
			System.out.print(newa[i]+",");			
		}
		index--;
		a=newa;
		System.out.println();
	}
	public static void insert(int pos,int value){
		int[] newa=new int[index];
		int i;
		if(a.length>=5){
			index=index+1;
		}
		for( i=0;i<index;i++){		
				newa[i]=a[i];
			if( i==pos){		
				newa[i]=a[i];
			}
		    for(i=newa.length-1;i>pos;i--){
				newa[i+1]=a[i];
			}
		}
		
			System.out.print(newa[i]+",");	
	
		a=newa;
		System.out.println();
	}

}
