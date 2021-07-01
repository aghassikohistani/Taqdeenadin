package optionalArgements;

public class OptionalArgument {

	public void abc(String... abc) {

		if (abc.length > 0) {
			System.out.println("working as zero parameter");

		} else {
			System.out.println("default method");
		}

	}

	public static void main(String[] args) {

		OptionalArgument op = new OptionalArgument();

		op.abc();
		op.abc("German Role");
		op.abc("Jhonny");

	}

}
