package Testngproject1.iTCbackoffice1;

import org.testng.TestNG;

public class TestingitcBackoffice {
	static TestNG testNG;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testNG = new TestNG();
		testNG.setTestClasses(new Class[] {messageNotifications.class});
		testNG.run();
		// TODO Auto-generated method stub

	}

}
