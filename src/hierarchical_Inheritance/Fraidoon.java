package hierarchical_Inheritance;

public class Fraidoon extends MohammadMosa {

	public void nice() {

		System.out.println("Fraidoon is a good man");
	}

	public String address(String address) {

		System.out.println("Fraidoon kaka lives in Khair Khana " + address);
		return address;
	}

	public static void main(String[] args) {

		
		Fraidoon f1 = new Fraidoon();
		f1.babim();
		f1.age(98);
		f1.address("Kabul");
		f1.nice();
		
		MohammadAlam dad = new MohammadAlam();
		dad.lives();
		dad.name("Agha Gul");
		
		
	}

}
