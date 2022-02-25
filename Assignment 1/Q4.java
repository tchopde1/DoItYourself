import java.util.*;

class Q4{
	
	public static void main(String[] args){
		
		System.out.println("Enter first number to swap, x: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter second number to swap, y: ");
		int y = sc.nextInt();
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("The swapped numbers are, x : "+x+" and y : "+y);
		
	}
}