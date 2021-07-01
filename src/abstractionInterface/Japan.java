package abstractionInterface;

public class Japan implements KohistaniGroupOfCompanies {

	@Override
	public void kabulBranch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void kandaharBranch() {
		int koon = 10;

		if (koon < 9) {
			System.out.println("koon kandahar");
		} else
			System.out.println("Kandahar is my friends hometown");

	}

	@Override
	public void kapisaBranch() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Japan jp = new Japan();
		jp.kandaharBranch();
	}

	@Override
	public void doYouWantTo() {
		// TODO Auto-generated method stub

	}

}
