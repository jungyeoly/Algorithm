import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int line1 = scan.nextInt();
		String line2 = scan.next();

		scan.close();

		int line3 = line1 * Character.getNumericValue(line2.charAt(2));
		int line4 = line1 * Character.getNumericValue(line2.charAt(1));
		int line5 = line1 * Character.getNumericValue(line2.charAt(0));

		int line6 = line1 * Integer.parseInt(line2);
		System.out.println(line3);
		System.out.println(line4);
		System.out.println(line5);
		System.out.println(line6);

	}
}
