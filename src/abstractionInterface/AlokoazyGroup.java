package abstractionInterface;

public class AlokoazyGroup implements KohistaniGroupOfCompanies, KakarGroup {

	@Override
	public void cashInestmrnt() {
		System.out.println("");

	}

	@Override
	public void businessMoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public void kabulBranch() {
		System.out.println("Kabul is my where i was born");

	}

	@Override
	public void kandaharBranch() {
		String Kandahar = "Kandahar";
		System.out.println(Kandahar);

	}

	@Override
	public void kapisaBranch() {
		System.out.println();

	}

	public static void main(String[] args) {

		AlokoazyGroup alk = new AlokoazyGroup();
		alk.kabulBranch();
	}

	@Override
	public void doYouWantTo() {
		// TODO Auto-generated method stub

	}

}
