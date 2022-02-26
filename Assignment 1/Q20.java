import java.util.*;

class Q20{
	
	public static void main(String[] args){
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2;i<n;i++){
			
			while(n%i==0){
				System.out.print("Prime factors are : "+i+" , ");
				n=n/i;
			}
		}
		
		if(n>2)
			System.out.println(n);
	}
}