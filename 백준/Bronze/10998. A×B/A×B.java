import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int A;
		int B;

		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();

		int result = A * B;

		System.out.println(result);
	}
}