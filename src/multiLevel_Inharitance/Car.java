package multiLevel_Inharitance;

public class Car {

	public String startEngine() {

		System.out.println("The engine is ");
		return startEngine();
	}

	public int yearMade(int yearMade) {

		System.out.println("The car was built in year " + yearMade);
		return yearMade;

		
	}

	public int modeNum(int modelNum) {

		System.out.println("the model number for the car is " + modelNum);
		return modelNum;
	}

	public String color(String color) {

		System.out.println("the car color is " + " " + color);
		return color;
	}
    public int vinNumber(int vinNumber) {
    	
    	System.out.println("the vehicle vin number is "+ vinNumber);
    	return vinNumber;
    }
}
