package inheritance_Constructor;

public class Parent {

	int age;
	int studentId;
	String name;
	double marks;

	public Parent() {

		age = 0;
		studentId = 0;
		name = "";
		marks = 0;
		System.out.println("I am the default");

	}

	public Parent(int age, int studentId, String name, double marks) {

		this.age = 0;
		this.studentId = 0;
		this.name = "";
		this.marks = 0;
		System.out.println("I am the parametrized");

	}

  public String studentName(String name) {
	  
	  return name;
  }


}
