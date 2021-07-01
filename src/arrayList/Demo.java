package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> best = new ArrayList<String>();

		best.add("Koon");
		best.add("khoja");
		best.add("nooria");
		best.add("nahida");
		best.add("marwa");

		// System.out.println(best.size());

		best.remove(2);// remove Nooria
		best.add(3, "Zia");

		for (String string : best) {
			System.out.println(best);

		}

		System.out.println(best);
	}

}
