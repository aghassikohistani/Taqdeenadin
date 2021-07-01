package singleLevel_Inharitance;

public class Corolla extends Toyota {

	public void carFule() {

		System.out.println("Petrol is expensive");
	}

	public int modelNumber(int modelNumber) {
		System.out.println(modelNumber);

		return modelNumber;
	}

	public char gradeOfTheCar(char grade) {
		System.out.println("The garde of the car is " + grade);

		return grade;
	}

}
