package Testngproject1.iTCbackoffice1;

import org.testng.TestNG;

public class testRunner {
	
	static TestNG testNG;

	public static void main(String[] args) {
		
		testNG = new TestNG();
		testNG.setTestClasses(new Class[] {ToolsFunctionality.class});
		 testNG.run();
		// TODO Auto-generated method stub

	}

}
