package singleLevel_Inharitance;

public class MthodChaining {

	public void sum() {

		int a = 5;
		int b = 5;
		int c = 4;
		int d = 5;
		int z = a + b + c + d;
		System.out.println(z);
	}

	public void nums(int b) {

	}

	public void display() {

	}

	public int sum(int a, int b) {
		return a + b;
	}

	public void numbers(int a, double b, int g, char d, int e) {
		System.out.println("I am the good method");
     this.sum(44,44);
	} 

	public void manf(int a, int b, int c) {

	}

	public static void main(String[] args) {

	

	MthodChaining m1 = new MthodChaining();
	m1.sum(99, 33);
	System.out.println(m1.sum(33, 10));

	}
}
