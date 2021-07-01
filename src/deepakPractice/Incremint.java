package deepakPractice;

public class Incremint {

	int deepak;

	public void incremint() {

		deepak = deepak + 1;
	}

	public static void main(String[] args) {

		Incremint c1 = new Incremint();

		c1.incremint();
		System.out.println(c1.deepak);
		Incremint obj2 = new Incremint();
		System.out.println(obj2.deepak);
		Incremint obj3 = new Incremint();
		System.out.println(obj3.deepak);

	}

}
