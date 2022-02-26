import java.util.*;

class Q13{
	
	public static void main(String[] args){
		
		System.out.println("Enter 3 numbers : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x<=y){
			
			if(x<=z){
				System.out.println("The smallest number is : "+x);
			}
			else
				System.out.println("The smallest number is : "+z);
		}
		else{
			
			if(y<=z){
				System.out.println("The smallest number is : "+y);
			}
			else
				System.out.println("The smallest number is : "+z);
		}
			
	}
}