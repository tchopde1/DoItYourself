import java.util.*;

class Q5{
	
	public static void main(String[] args){
		
		System.out.println("Enter 1st number x : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("Enter 2nd number y : ");
		int y = sc.nextInt();
		
		x = x * y;
		y = x / y;
		x = x / y;
		
		System.out.println("Swapped numbers are, x : "+x+" and y :"+y);
	}
}