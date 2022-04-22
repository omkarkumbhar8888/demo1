package testng1;

import org.testng.annotations.Test;

public class ParallelClassExecution3 {
	@Test
	public void testCase5() {
		System.out.println("Test case 5 ");
	}

	@Test(description = "")
	public void testCase6() {
		System.out.println("Test case 6 ");
	}

}
