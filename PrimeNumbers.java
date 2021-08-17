package day16.bridgelabz;

public class PrimeNumbers {
	// driver code
	public static void main(String[] args) {

		// Declare the variables
		int a = 0, b = 1000;
		primeNumbers(a, b);

	}

	private static void primeNumbers(int a, int b) {
		int i, j, flag;
		// TODO Auto-generated method stub

		// Print display message
		System.out.printf("\nPrime numbers between %d and %d are :\n ", a, b);

		// Traverse each number in the interval
		// with the help of for loop
		for (i = a; i <= b; i++) {

			// Skip 0 and 1 as they are
			// neither prime nor composite
			if (i == 1 || i == 0)
				continue;

			// flag variable to tell
			// if i is prime or not
			flag = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			// flag = 1 means i is prime
			// and flag = 0 means i is not prime
			if (flag == 1)
				System.out.print(i + " ");

		}

	}
}
