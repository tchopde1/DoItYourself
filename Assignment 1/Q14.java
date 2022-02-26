import java.util.*;

class Q14{
	
	public static void main(String[] args){
		
		System.out.println("Enter 1st number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int y = sc.nextInt();
		
		int add=0;
		
		if(x>y){
			
			for(int i=1;i<=y;i++){

				x++;
			}
			System.out.println("Addition of 2 digits is : "+x);
		}
		else{
			
			for(int i=1;i<=x;i++){

				y++;  
			}
			System.out.println("Addition of 2 digits is : "+y);
		}
		
		
	}
}