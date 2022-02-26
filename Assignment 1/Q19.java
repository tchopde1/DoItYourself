import java.util.*;

class Q19{
	
	public static void main(String[] args){
		
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem, temp=n, sum =0;
		
		while(n>0){
			rem=n%10;
			sum=(sum*10)+rem;
			n = n/10;
		}
		if(temp==sum)
			System.out.println("Given number is palindrome number.");
		else
			System.out.println("Given number is not a palindrome number.");
	}
}