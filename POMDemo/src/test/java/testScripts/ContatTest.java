package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Loginpage;

public class ContatTest extends TestBase{
	
	Loginpage loginPage;
	@BeforeTest
	public void setup()
	{
		intialize();
	}
	@Test
		public void validateUser()
	{
		loginPage = new Loginpage();
	}
	

}
