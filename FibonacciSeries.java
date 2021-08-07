package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8, firstNum = 0, secNum = 1, sum;
		System.out.println("Fibonacci Series are : ");
		for (int i = 1; i <= range; i++) {
			System.out.println(+firstNum);
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
		}
	}
}
