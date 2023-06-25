import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] arr = new int[N];

		for (int a = 0; a < N; a++) {
			arr[a] = a + 1;
		}

		for (int b = 0; b < M; b++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			
			int temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
		}
		for(int number:arr) {
			System.out.print(number + " ");
		}
	}
}
