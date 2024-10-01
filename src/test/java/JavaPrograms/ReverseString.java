package JavaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String RVS = "";
		char ch;
		String STR ;

		Scanner scanner = new Scanner(System.in);
		STR = scanner.next();
		
		for(int i=0; i<STR.length(); i++)
		{
		      ch = STR.charAt(i);
		      RVS = ch+RVS;
		      
		}
		System.out.println(RVS);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		String str = "COA Network";
		String Rvstr = "";
		char ch;
		
		for(int i = 0; i<str.length(); i++)
		{
			ch = str.charAt(i);
			Rvstr = ch+Rvstr;
		
		}
		System.out.println(Rvstr);

	}

}
