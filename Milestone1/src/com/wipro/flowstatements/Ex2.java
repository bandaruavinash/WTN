package com.wipro.flowstatements;

public class Ex2 {

	public static void main(String[] args) {
		Integer a=Integer.parseInt(args[0]);
		Integer b=Integer.parseInt(args[1]);	
		System.out.println("->"+lastDigit(a,b));
		// TODO Auto-generated method stub

	}
	 static boolean lastDigit(Integer a, Integer b)
		{
			int a_lastDigit=a%10;
			int b_lastDigit=b%10;
			if(a_lastDigit==b_lastDigit)
				return true;
			else
				return false;
		}

}
 