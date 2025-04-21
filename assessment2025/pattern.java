package assessment2025;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number rows ");
		int row=scan.nextInt();
		for( int i=0;i<=row;i++) {
			for( int j=0;j<=i;j++) 
			{   for(int k=1;k<j;k++) 
				{
				
				System.out.print(" * ");
			
				}
			}
			System.out.println();
		}
		
}
}
