
package com.jspiders.bridge_labz;

public class Program 
{
	public static void main(String[] args) 
	{
		int rs = 4968;
		int n1 = 0;
		
		if(rs>=1000)
		{
			 n1 = rs/1000;
			rs = rs%1000;
			System.out.println("Give " +n1+" thousand note");
		}
		
		if(rs>=500 && rs<1000)
		{
			 n1 = rs/500;
			rs = rs%500;
			System.out.println("Give " +n1+" five hundred note");
		}
		if(rs>=100 && rs<500)
		{
			 n1 = rs/100;
			rs = rs%100;
			System.out.println("Give " +n1+" hundred note");
		}
		
		
		if(rs>=50 && rs<100)
		{
			 n1 = rs/50;
			rs = rs%50;
			System.out.println("Give " +n1+" fifty note");
		}
		
		
		if(rs>=10 && rs<50)
		{
			 n1 = rs/10;
			rs = rs%10;
			System.out.println("Give " +n1+" ten's note");
		}
		
		
		if(rs>=5 && rs<10)
		{
			 n1 = rs/5;
			rs = rs%5;
			System.out.println("Give " +n1+" five rupee coin");
		}
		
		
		if(rs>=2 && rs<5)
		{
			 n1 = rs/2;
			rs = rs%2;
			System.out.println("Give " +n1+" two's rupee coin");
		}
		
		
		if(rs==1)
		{
			 n1 = rs;
			System.out.println("Give " +n1+" one rupee coin");
		}
		
	}
}