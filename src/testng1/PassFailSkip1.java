package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PassFailSkip1 {

	@Test
	public void pass() {
		System.out.println("a");
		System.out.println("b");
		Assert.assertTrue(true);
	}

	@Test
	public void fail() {
		int a = 10;
		int b = 20;
		boolean c = a > b;
		Assert.assertTrue(c);
	}

	@Test(dependsOnMethods = "fail")
	public void skip() {
		System.out.println("c");
		System.out.println("d");
	}

	
}
