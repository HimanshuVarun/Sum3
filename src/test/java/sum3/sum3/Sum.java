package sum3.sum3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sum
{
	@BeforeTest
	public void beforMethod()
	{
		System.out.println("Hello in before testtttttttttttttttttttttttttttttttttttttttttt");
	}
	@Test
	public void trstMethod()
	{
		System.out.println("Hello in  testtttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
	}

}
