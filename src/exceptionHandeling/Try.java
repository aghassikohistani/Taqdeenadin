package exceptionHandeling;

public class Try {

	public static void main(String[] args) {

		int a = 100;

		try {
			System.out.println(a / 0);
		} catch (Exception e) {

			System.out.println("this exception was handled by try and catch block");
		} finally {

			System.out.println("this is the finally block");
		}

		System.out.println("contiued with the rest of the program");
	}

}
