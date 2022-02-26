import java.util.*;

class Q12{
	
	public static void main(String[] args){
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int digit, sum = 0;
		
		for(int i=1;i<=n;i++){
			
			while(n>0){
				
				digit = n % 10;
				
				sum = sum + digit;
				
				n = n / 10;
				
			}
			
		System.out.println("Sum of digits of the given number is : "+sum);
		
		}
	}
}