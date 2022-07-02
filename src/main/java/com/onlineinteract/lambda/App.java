package com.onlineinteract.lambda;

public class App {
	private TestLambda testLambda;
	private String localStateValue = "Local State";

	public static void main(String[] args) {
		new App().testApp();
	}

	public void testApp() {
		addTestLambda((value, value2, someLocalStateValue) -> {
			System.out.println("The values passed in are: " + value + " and " + value2 + " and local state: " + someLocalStateValue);
		});

		execute("Canada", "USA");
	}

	public void addTestLambda(TestLambda testLambda) {
		this.testLambda = testLambda;
	}

	public void execute(String value, String value2) {
		testLambda.execute(value, value2, localStateValue);
	}
}
