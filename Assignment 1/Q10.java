import java.util.*;
import java.io.*;

class Q10{
	
	public static void main(String[] args){
		
		System.out.println("Input number : ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0){
			int remainder = n % 10;
			
			System.out.println(remainder);
			
			n = n /10;
		}
	}
}

/*
	--another solution using inbuilt method--
	
	String s1 = Integer.toString(n);
	
	for(int i=0; i<s1.length();i++){
		System.out.println(s1.charAt(i));
	}

*/