import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		scan.close();

		boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
		if (isLeapYear) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
