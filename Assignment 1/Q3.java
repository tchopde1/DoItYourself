import java.util.*;

class Q3{
	
	public static void main(String[] args){
		
		int fact=1;
		System.out.println("Input Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		fact = factorial(n);
		
		System.out.println("Facorial using Recursion is "+fact);
	}
	
	static int factorial(int n){
		
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
}