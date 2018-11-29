package automation;

public class Demo5 {

	public static void main(String[] args) {

		digitCount(-1);
		digitCount(10);
		digitCount(100);

	}

	public static void digitCount(int n) {
		int a = n;
		int count = 0;

		while (a != 0) {
			count++;
			a = a / 10;
		}
		System.out.println("Digit count of " + n + " is " + count);
	}
}
