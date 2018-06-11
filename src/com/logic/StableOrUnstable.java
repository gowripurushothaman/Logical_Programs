package com.logic;

public class StableOrUnstable {
	
	public static void main(String[] args) {
	//int n=1234;
	//int len=Integer.toString(n).length();
	//System.out.println(len);
	//int s=128;
	//int l=String.valueOf(s).length();
	//System.out.println(l);
		int num=122;//num value is 12
		int num1=Integer.toString(num).length();//value of num1 is 2
		int arr[]=new int[num1];//int[2]
		int i=0,j=0,count=0;
	while(num>0) {
		int r=num%10;
		arr[i]=r;
		num=num/10;
		i++;
		
		}
	for(i=0;i<num1;i++) {
		for(j=0;j<num1;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
	}
		if(count%2==0) {
			System.out.println("this is stable number");
		}
		else 
			System.out.println("this is not stable number");
			}

}
