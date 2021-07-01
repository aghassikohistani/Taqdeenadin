package inheritancePractice;

public class Phone {

	private String bName;
	private String modelName;
	private int modelNum;
	private double price;

	public Phone() {

		this.bName = "";
		this.modelName = "";
		this.modelNum = 0;
		this.price = 0;
	}

	public Phone(String bname, String modelName, int modelNum, double price) {

		this.bName = "";
		this.modelName = "";
		this.modelNum = 0;
		this.price = 0;
	}

	public String getbName() {
		return this.bName;
	}

	public void setBname(String bName) {
		bName = this.bName;
	}

	public String getModelName() {
		return this.getModelName();
	}

	public void setModelName(String modelName) {
		modelName = this.modelName;
	}

	public int getModelNum() {
		return this.modelNum;
	}

	public void setModelNum(int modelNum) {
		modelNum = this.modelNum;
	}

	public double getPrice() {
		return this.price;
	}
    @Override
	public String toString() {

		return "";
	}
    
    public void display() {
    	System.out.println(bName + modelName + modelNum + price );
    }
    
    
    
	public double taxCal() {
		return price * 0.01;
	}

}
