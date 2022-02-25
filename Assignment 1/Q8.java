import java.util.*;

class Q8{
	
	public static void main(String[] args){
		
		System.out.println("Enter a year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		boolean leap = false;
		
		if(year % 400 == 0)
			leap = true;
		
		else if(year % 100 == 0)
			leap = true;
		
		else if(year % 4 == 0)
			leap = true;
		
		else
			leap = false;
		
		/*
		Alternate condition
		
		if(year % 400 == 0 || year % 100 == 0 || year % 4 == 0)
			leap = true;
		else
			leap = false;
		*/
		
		System.out.println(leap);
	}
}