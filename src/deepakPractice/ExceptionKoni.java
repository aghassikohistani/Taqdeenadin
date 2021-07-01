package deepakPractice;

public class ExceptionKoni {

	public static void main(String[] args) {
          System.out.println("first line of thhe code");
		try {
			int i = 10 / 0;
		} catch (Exception e) {
         
			e.printStackTrace();

			System.out.println("tried to catch the exception");
		}

	}
}
