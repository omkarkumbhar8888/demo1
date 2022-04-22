package assignment1;

import org.testng.annotations.Test;

public class A {

	@Test(invocationCount = 1000)
	public void m1() {
		System.out.println("m1 method");
	}

}
