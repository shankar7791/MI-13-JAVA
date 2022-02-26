import java.util.Scanner;

public class FutureInvestmentValue {

	public static void main(String[] args) {

		System.out.println("Compute future investment value at a given rate of interest for a specified no of years");
	    future_Investment_Value();
	}
	public static void future_Investment_Value() {

		Scanner sc = new Scanner(System.in);
		double f = 0;

		System.out.println("\n\nEnter the present value :");
		double p = sc.nextInt();

		System.out.println("Enter the rate of interest :");
		double r = sc.nextInt();

		System.out.println("Enter the time period in years");
		double y = sc.nextInt();

		System.out.println("Years        FutureValue");
		for (int i = 1; i <= y; i++) {
			f = p * Math.pow((1 + r / 100), i);
			System.out.println(i + "             " + f);
		}

	}

}
