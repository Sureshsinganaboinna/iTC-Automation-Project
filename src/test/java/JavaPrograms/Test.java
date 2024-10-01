package JavaPrograms;

public class Test {
	 static int x;  // static variable x

	    public static void main(String[] args) {
	        Test obj1 = new Test();  // Creating first instance of Test class
	        obj1.x = 10;  // Setting static variable x to 10 via obj1

	        Test obj2 = new Test();  // Creating second instance of Test class
	        obj2.x = 20;  // Setting static variable x to 20 via obj2

	       x = 30;  // Setting static variable x to 30 directly (using class name)

	        System.out.println("x=" + obj1.x);  // Printing x from obj1 (prints 30)
	        System.out.println("x=" + obj2.x);  // Printing x from obj2 (prints 30)
	    }

}
