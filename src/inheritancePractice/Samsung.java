package inheritancePractice;

public class Samsung extends Phone {

	public Samsung() {

		super();

	}

	public Samsung(String bname, String modelName, int modelNum, double price) {

		super(bname, modelName, modelNum, price);
	}

	public double taxCal() {
		return getPrice() - 0.02;

	}

	public double discount() {

		return getPrice() - 0.05;
	}

}
