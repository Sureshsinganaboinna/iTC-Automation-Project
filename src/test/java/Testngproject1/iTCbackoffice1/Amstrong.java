package Testngproject1.iTCbackoffice1;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int r ;
		int n = 122;
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			r = n % 10;
			sum = sum * 10 + r;
			n = n/10;
		}
	 if(temp == sum)
	 {
		 System.out.println("Palindrom number is a number that same after reverse :- "+ sum);
	 }
	 else
	 {
		 System.out.println("Number is not a palindrum");
	 }
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Factorial means product of all positive descending integers
/*		int temp = 6;
		int n = 1;
		while(temp > 0)
		{
			n = n * temp;
			temp = temp - 1;
		}
		System.out.println(n);*/
	
	 //Amstrong number is a number equal to sum of cub of its digits.	
/*	int n = 153;
	int temp = n;
	int t = 0;
    int ld = 0;
    while(n>0) {
    	
    	ld = n%10;
    	t = t +ld*ld*ld;
    	n = n / 10;
    	
    }
     if (temp == t) {
    	System.out.println("Amstrong number is equal to sum of each digit of the number = " + temp );
    }
    else
    {
    	System.out.println("It's not aa Amstrong number");
    }
    */
		int n = 145;
		int temp = n;
		int ld; 
		int EDFS = 0;
		while(n>0) {
			int f=1;
			ld = n%10;
		while(ld>0)
		{
			f = f * ld;
			ld--;
			
		}
		EDFS = EDFS + f;
		n=n/10;
		}
		if(temp == EDFS)
		{
			System.out.println("Given number is Strong number" + EDFS);
		}
		else
		{
			System.out.println("Given number is not a Strong number" + EDFS);
		}
				
		
		
		
		
		
}
		
	
}