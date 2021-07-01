package singleLevel_Inharitance;

public class Runner {

	public static void main(String[] args) {

		Toyota t1 = new Toyota();
		t1.color();
		t1.giveMecolor("Black");
		t1.yearBuild(1997);

		Corolla c1 = new Corolla();

		c1.carFule();
		c1.modelNumber(7867876);
		c1.giveMecolor("Yellow");
		c1.gradeOfTheCar('A');
	}

}
