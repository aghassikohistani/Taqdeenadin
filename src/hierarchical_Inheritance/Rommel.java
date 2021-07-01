package hierarchical_Inheritance;

public class Rommel extends AghaGul {

	public void intro() {

		System.out.println("Rommel is the second child of agha gul");
	}

	public static void main(String[] args) {

		Aghassi ak = new Aghassi();
		ak.lastName("Kohistani");
		ak.homeAddress("First Mackrorayan");
		ak.property(898989898.98);

		Rommel rm = new Rommel();
		rm.lastName("Shah rukh");
		rm.homeAddress("Germany");
		rm.property(89898989);

	}
}