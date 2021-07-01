package multiLevel_Inharitance;

public class Rav4 extends Camry {

	@Override
	public void camry() {

		System.out.println("i am the camry class");

	}

	public static void main(String[] args) {

		Rav4 r4 = new Rav4();

		r4.yearMade(2020);
		r4.modeNum(799327467);
		r4.color("Blue");
		r4.vinNumber(23434212);
		
		Camry cm = new Camry();
		cm.yearMade(2019);
		cm.modeNum(3432323);
		cm.color("Pink");
		cm.vinNumber(7878787);

	}

}
