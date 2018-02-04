package Arrays;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter the string");
		String s=sc.next();


		System.out.println("input string is "+s);
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>'a'&& s.charAt(i)<'z')
			{
				
				for(int j=0;j<s.charAt(i+1);j++)
				{
					
				System.out.print(s.charAt(i));
				
				}




		
			}
		}




		System.out.println();
		sc.close();
		
	
		
		
	}

}
 