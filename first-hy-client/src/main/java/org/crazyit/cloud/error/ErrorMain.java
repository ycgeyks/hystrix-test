package org.crazyit.cloud.error;

public class ErrorMain {

	public static void main(String[] args) {
		ErrorCommand command = new ErrorCommand();
		String result = command.execute();
		System.out.println(result);
	}

}
