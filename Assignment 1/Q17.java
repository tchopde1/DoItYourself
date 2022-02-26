import java.util.*;

class Q17{
	
	public static void main(String[] args){
		
		System.out.println("Enter 2 numbers : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int gcd = 1;
		for(int i=1;i<=x && i<=y; i++){
			
			if(x%i==0 && y%i==0)
				
			gcd=i;
		}
		
		int lcm = (x*y)/gcd;
		
		System.out.println("Lcm is : "+lcm);
	}
}