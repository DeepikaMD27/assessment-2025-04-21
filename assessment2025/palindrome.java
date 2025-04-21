package assessment2025;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number  ");
		int num=scan.nextInt();
		int m=num;
		int rev=0;
		while(num!=0) {
			int div=num%10;
			rev=rev*10+div;
			num=num/10;
			
		}
		
		if(m==rev)
		{
			System.out.println("the "+m+"is a  plindrome");
		}
		else {
			System.out.println("the"+m+"is not  a plindrome");
		}
}
}