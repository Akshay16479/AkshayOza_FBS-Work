package innerclasses;

public class Bank {

	// inner class
	class locker {
		private float cash = 123.43f;

		public void amethod() {
			System.out.println(cash);
		}

	}

	public static void main(String[] args) {

		Bank b = new Bank();

		locker l = b.new locker();
		l.amethod();

	}

}
