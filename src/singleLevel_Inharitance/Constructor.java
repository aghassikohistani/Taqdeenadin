package singleLevel_Inharitance;

public class Constructor {

	public Constructor(int a, int b, int c, double d, String e) {
   
	}

	public Constructor(String a, double b, char g) {
		this(33.5,44,"Aghassi Jaan",'A' );
	}

	public Constructor(int a) {

	}

	public Constructor(int a, int b) {

		System.out.println("I am the two parametrized constructor");
	}

	public Constructor(double a, int b, String c, char f) {
     System.out.println(" I am 4 parametrized constructor");
	}

	public static void main(String[] args) {

	}

}
