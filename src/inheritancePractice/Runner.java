package inheritancePractice;

public class Runner {




public static void main(String[] args) {
	
	
	
	Nokia obj1 = new Nokia();
	obj1.getbName();
	obj1.setModelName("Nokia");
	obj1.setBname("Iphone");
	obj1.setModelNum(989898);
	System.out.println(obj1);
	
	Samsung obj2 = new Samsung("Amari", "dokan", 343334, 989.99);
	Phone x = new Samsung();
	x.taxCal();
	System.out.println(x);
	
	
}

}
