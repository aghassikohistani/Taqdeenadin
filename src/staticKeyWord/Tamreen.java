package staticKeyWord;

public class Tamreen {

	private int eId;
	private double eSal;
	private String fName;
	static String company = "Kohistani group";
	static int count = 0;

	public Tamreen() {

		this.eId = 0;
		this.eSal = 0;
		this.fName = "";
		count++;
	}

	public Tamreen(int eId, double d, String fName) {

		this.eId = 0;
		this.eSal = 0;
		this.fName = "";
		count++;
	}

	public int getEid() {
		return eId;
	}

	public void setEid(int eId) {
		eId = this.eId;
	}

	public double geteSal() {
		return eSal;
	}

	public void setEsal(double eSal) {
		eSal = this.eSal;
	}

	public String getFname() {
		return fName;
	}

	public void setFname(String fName) {
		this.fName = fName;
	}

	public void printValues() {
		System.out.println(eId + " " + eSal + " " + fName);
	}

	public static int size() {
		return count;

	}

	public String toString() {
		return "Employee id " + eId + "eSal" + eSal + "Employee Name " + getFname();
	}

	public static void main(String[] args) {

		Tamreen t1 = new Tamreen(8989, 333.99, "Aghassi");
		System.out.println(Tamreen.size());
		Tamreen t2 = new Tamreen(8989, 3223, "John Smith");
		System.out.println(Tamreen.size());
		System.out.println(t1);

	}

}
