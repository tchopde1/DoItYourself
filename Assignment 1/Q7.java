import java.util.*;

class Q7{
	
	public static void main(String[] args){
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("The number is "+check(n));
	}
	
	static String check(int n){
		if(n>0)
			return "Positive";
		else if(n<0)
			return "Negative";
		else
			return "Zero";
	}
}