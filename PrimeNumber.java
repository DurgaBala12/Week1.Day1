package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		boolean flag = false;
		int remainder;
		for (int i = 2; i <= num / 2; i++) {
			remainder = num % i;
			if (remainder == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}
