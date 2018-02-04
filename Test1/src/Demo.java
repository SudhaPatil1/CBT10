import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int n = sc.nextInt();
	
	int a[]=new int[n];
	Demo d = new Demo();
	int rs=d.countNum(a);
	System.out.println(rs);
	}
	
	int countNum(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
			else if(a[i]=='a') {
				count++;
			}
			else if(a[i]=='b') {
				count++;
			}
		}
		return count;
		
}
}
