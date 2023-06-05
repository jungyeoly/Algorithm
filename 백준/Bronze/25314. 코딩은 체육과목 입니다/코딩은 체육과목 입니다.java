
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int inputByte = scan.nextInt();
		int longCount = inputByte / 4;

		for (int i = 1; i <= longCount; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
