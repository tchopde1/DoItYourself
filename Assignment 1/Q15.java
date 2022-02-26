import java.util.*;

class Q15{
	
	public static void main(String[] args){
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0){
			int remainder = n % 10;
			
			System.out.print(remainder);
			
			n = n /10;
		}
	}
}