import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] arr = new int[N];

		for (int a = 0; a < M; a++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int k = scanner.nextInt();

			for (int b = i - 1; b < j; b++) {
				arr[b] = k;
			}
		}

		for (int c = 0; c < N; c++) {
			System.out.print(arr[c] + " ");
		}
	}
}
