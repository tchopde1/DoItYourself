import java.util.*;

class Q9{
	
	public static void main(String[] args){
		
		method(1);
	}
	
	public static void method(int n){
		
		if(n<=10){
			System.out.println(n);
			method(n+1);
		}
	}
}