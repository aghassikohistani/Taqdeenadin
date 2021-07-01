package staticKeyWord;

public class StaticVariable {

	int eid;
	String ename;
	static String eCompany = "Vulcan";

	public void display() {
		System.out.println(eid + ename);
	}

	public StaticVariable(int eid, String ename) {

		this.eid = 0;
		this.ename = "";

	}

	public static void main(String[] args) {

		StaticVariable s1 = new StaticVariable(90890, "Aghassi");
		s1.display();

	}

}
