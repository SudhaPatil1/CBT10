import java.util.Scanner;

public class ValidOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the expresion:");
		String exp=sc.next();
		System.out.println("enter the inputs");
		String input=sc.next();
		checkValid(exp,input);


	}

	private static void checkValid(String exp,String input) {
		char arr1[]=exp.toCharArray();
		char arr2[]=input.toCharArray();
		int find=0;
		for(int i=0;i<arr1.length;i++)
		{

			if(arr1[i]==arr2[i] && arr1[i]!=0)
			{
				find=1;
			}
			else
				find=0;

		}
		if(find ==1)
			System.out.println("valid"); 
		else
			System.out.println("invalid");


	}

}
