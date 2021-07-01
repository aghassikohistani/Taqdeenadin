package singleLevel_Inharitance;

public class Rihana extends Aghassi {

	public void info() {

		System.out.println("Rihana is Aghassi Kohistani's daughter");
	}

	public int age(int age) {

		System.out.println("Rihana is " + age);
		return age;
	}

	public double weight(double weight) {

		System.out.println("her weight is " + weight);
		return weight;

	}

	public static void main(String[] args) {

		Aghassi ko = new Aghassi();

		ko.good();
		ko.age(32);
		
		Rihana hi = new Rihana();
		hi.info();
		hi.age(2);
		hi.info();
		hi.weight(18.9);
		
	}

}
