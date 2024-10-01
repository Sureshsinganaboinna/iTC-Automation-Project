package JavaPrograms;
import java.util.Scanner;
public class FahrenheittoCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java program to convert from Fahrenheit to Celsius?
	/*	 Scanner sc = new Scanner(System.in);
		   System.out.println("Input temperature in Fahrenheit: ");
		   double fahrenheit = sc.nextDouble();
		   double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
		   System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius + "in celsius");
*/
		 //  Java program to swap two numbers?
		   int x, y, z; 
		   Scanner sc = new Scanner(System.in);
		   x = sc.nextInt(); y = sc.nextInt(); 
		   System.out.println("Before swapping\n x = " + x + "\n y = " + y);
		   z = x; 
		   x = y;
		   y = z; 
		   System.out.println("After swapping\n x = " + x + "\n y = " + y); 
		   
		/*   //Java program to swap two numbers without using third variable?
		      int x = 10;
		         int y = 5;
		         x = x + y;
		         y = x - y;
		         x = x - y;
		         System.out.println("After swapping: " + " x is " + x + " and " + "y is "+ y);*/
		//Java program to add two numbers?
	/*	  Scanner sc = new Scanner(System.in);
		  int a = sc.nextInt(); int b = sc.nextInt();
		  int sum = a + b;
		  System.out.println("Sum of two numbers is: " + sum);
		*/
		//Java program to check whether a given number is Armstrong ?
		
	 /*   int c=0,a,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        temp = num;
        while(num>0){
            a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if(temp==c) { 
           System.out.println(temp +  " is an Armstrong number");
        } else
            System.out.println(temp + " is not an armstrong number");
		
		
		
		int n = 370;
		int temp = n;
		int ld,Amn = 0;
		while(n>0)
		{
			ld = n%10;
			Amn = ld*ld*ld+Amn;
			n = n/10;
			
		}
		if(temp == Amn)
		{
			System.out.println(Amn);
		}
		else
		{
			System.out.println("It's not a amstrong number");
		}
		
		*/
		//Java program for printing the prime numbers?
	 /*   boolean flag = false;
        System.out.println("Enter input number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if(!flag){
                System.out.println(num + " is a prime number");
            } else{
                System.out.println(num + " is not a prime number");
            }*/
	/*    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Enter multiplication range");
        int range = sc.nextInt();
        for(int i=1;i<=range;i++){
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }*/
		
	/*     int vCount = 0, cCount = 0;    
         
	        //Declare a string    
	       String str = "This is a really simple sentence";    
	           
	        //Converting entire string to lower case to reduce the comparisons    
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
	            //Checks whether a character is a vowel    
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                //Increments the vowel counter    
	                vCount++;    
	            }    
	            //Checks whether a character is a consonant    
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                //Increments the consonant counter    
	                cCount++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vCount);    
	        System.out.println("Number of consonants: " + cCount);  
	   */     
	        
	        
		
	/*   String str = "This is a really simple sentence";    
	    int count = 0;
	    int vcount = 0;
	    int ccount = 0;
	    str = str.toLowerCase();
	    for(int i=0; i<str.length(); i++)
	    {
	    	if(str.charAt(i)!=' ') {
	    	
	    	count++;
	    	}
	
	   
	    	if(str.charAt(i)== 'a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
	    	{
	    		vcount++;
	    	}
	    	else if(str.charAt(i)>='a' && str.charAt(i)<='z')
	    	{
	    		ccount++;
	    	}
	    }
	    System.out.println(count);
	    System.out.println(vcount);
	    System.out.println(ccount);*/
	    }    
    }
    
		
	


