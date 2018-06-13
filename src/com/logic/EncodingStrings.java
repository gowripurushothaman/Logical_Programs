package com.logic;

import java.util.Scanner;

public class EncodingStrings {
	String s1,s2,s3;
	int i,j,k=0,l=3,z;
	char a,b,c,d,e,f;
	String output1,output2,output3;
	String frontInput1,middleInput1,endInput1,frontInput2,middleInput2,endInput2,frontInput3,middleInput3,endInput3;
	public void stringFunction(String string1,String string2,String string3) {
		s1=string1;
		s2=string2;
		s3=string3;
		String arr[]= {string1,string2,string3};
		int num[]= {s1.length(),s2.length(),s3.length()};
		
		for(i=0;i<arr.length;i++) {
			if(num[i]%3==0&num[i]>=9) {
				int start=num[i]/3;
				int end=start;
				int middle=num[i]-(start+end);
				 frontInput3=arr[i].substring(k,start);
				System.out.println("frontinput3="+frontInput3);
				 middleInput3=arr[i].substring(start,num[i]-end);
				System.out.println("middleinput3="+middleInput3);
				 endInput3=arr[i].substring(num[i]-end,num[i]);
				System.out.println("endinput3="+endInput3);
			}
			
			else if(num[i]%3==1) {
				int start=num[i]%3;//4%3=1
				int end=start;//4/3=1
				int middle=num[i]-(start+end);//4-2=2
			    frontInput1=arr[i].substring(k,start);
				System.out.println("frontinput1="+frontInput1);
				 middleInput1=arr[i].substring(start,num[i]-end);
				System.out.println("middleinput1="+middleInput1);
			    endInput1=arr[i].substring(num[i]-end,num[i]);
				System.out.println("endinput1="+endInput1);
			}
			else if(num[i]%3==2) {//2
				int start=num[i]%3;//5%3=2
				int end=start;//2
				int middle=num[i]-(start+end);//5-4=1
			    frontInput2=(arr[i].substring(k,start));
				System.out.println("frontinput2="+frontInput2);
				middleInput2=(arr[i].substring(start,num[i]-end));
				System.out.println("middleinput2="+middleInput2);
				endInput2=(arr[i].substring(num[i]-end,num[i]));
				System.out.println("endinput2="+endInput2);
			}
		}
		output1=frontInput1.concat(middleInput2.concat(endInput3));
		output2=middleInput1.concat(endInput2.concat(frontInput3));
		output3=endInput1.concat(frontInput2.concat(middleInput3));
      System.out.println("output1="+output1);
      System.out.println("output2="+output2);
      //System.out.println("output3="+output3);
	}
		  public void toggle(String output3) {
			String str = "";
			int num1=output3.length();
			for(i=0;i<num1;i++) {
				char character=output3.charAt(i);
				if(Character.isUpperCase(character)) {
					char ch = Character.toLowerCase(character);	
					str = str + ch; 
				} else if(Character.isLowerCase(character)) {
					char ch = Character.toUpperCase(character);
					str = str + ch;
				}				
			}
		
			System.out.println("output3="+str);
		  }
		  
		public static void main(String[] args) {
			EncodingStrings testing=new EncodingStrings();
			Scanner scanner=new Scanner(System.in);
			String string1=scanner.next();
			String string2=scanner.next();
			String string3=scanner.next();
			testing.stringFunction(string1,string2,string3);
			testing.toggle(testing.output3);
			
			}
}
