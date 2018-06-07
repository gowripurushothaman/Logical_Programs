package com.logic;
import java.util.Scanner;

public class Logic {
	int i1,i2,i3,i4,i5,x,num,num1,sum=0;
	public int findPassword(int input1,int input2,int input3,int input4,int input5) {
		i1=input1;
		i2=input2;
		i3=input3;
		i4=input4;
		i5=input5;
		int a[]= {i1,i2,i3,i4,i5};
		for(x=0;x<a.length;x++) {
			num=a[x];
			num1=Integer.toString(num).length();
			int arr[]=new int[num1];
			int b[]=new int[num1];
			int i=0,j=0,count=0,count1=1;
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
				if(count%2==0|count%num1==0) {
					
				}
				else {
				     sum=sum+a[x];
				}
				
					}
		return sum;
		}
	public static void main(String args[]) {
	Logic logic=new Logic();
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the five number which are available in the kids:");
    int input1=scanner.nextInt();
    int input2=scanner.nextInt();
    int input3=scanner.nextInt();
    int input4=scanner.nextInt();
    int input5=scanner.nextInt();
    System.out.println("The password is="+logic.findPassword(input1,input2,input3,input4,input5));
	}
}
