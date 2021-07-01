package multiLevel_Inharitance;

public class GalaxyS10 extends Samsung {

	public void s10() {

		System.out.println("this is the 2nd child class");
	}

	public String countryOfOrigin(String countryOfOrigin) {
		System.out.println("the phone was made in " + countryOfOrigin);

		return countryOfOrigin;
	}
    
	public static void main(String[] args) {
		
		GalaxyS10 s1 = new GalaxyS10();
		s1.BrandName();
		s1.countryOfOrigin("Afghanistan");
		s1.mobilePrice(1200.99);
		s1.color();
		s1.modeNum(2345444);
		s1.PhoneName("iphone");
	}


}
