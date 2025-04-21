package assessment2025;
import java.util.Scanner;
public class gaming {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean a=true;
		int result=0;
		while(a==true) {
			System.out.println("1. Call of Warfare - ₹1500");
			System.out.println("2. Speed Racers - ₹1200");
			System.out.println("3. Mystery Mansion - ₹1000");
			System.out.println("4. Pixel Adventure - ₹800");
			System.out.println("5. Puzzle Mania - ₹500");
			System.out.println("6 exit");
			System.out.println("enter the game number");
			int num=scan.nextInt();
			
			switch(num) {
			case 1:{
				     System.out.println("game(s) added to your cart!");
				     int game1=1500;
				     System.out.println("how many copies do you want");
				     int copy=scan.nextInt();
				     game1=game1*copy;
				     result=game1+result;
				     continue;
				  }
			case 2:{
					System.out.println("game(s) added to your cart!");
					int game2=1200;
					System.out.println("how many copies do you want");
					int copy=scan.nextInt();
					game2=game2*copy;
					result=game2+result;
					continue;
				  }
			case 3:{
					System.out.println("game(s) added to your cart!");
					int game3=1000;
					System.out.println("how many copies do you want");
					int copy=scan.nextInt();
					game3=game3*copy;
					result=game3+result;
					continue;	        
				  }
			case 4:{
					System.out.println("game(s) added to your cart!");
					int game4=800;
					System.out.println("how many copies do you want");
					int copy=scan.nextInt();
					game4=game4*copy;
					result=game4+result;
					continue;
					}
			case 5:{
					System.out.println("game(s) added to your cart!");
					int game5=500;
					System.out.println("how many copies do you want");
					int copy=scan.nextInt();
					game5=game5*copy;
					result=game5+result;
					continue;
	               }
			case 6:{
					a=false;
			        System.out.println("the total result is"+result);
			        continue;
			        }
	               	          
			default:System.out.println("enter the valid game");
			break;
		}
			
	}
}
}