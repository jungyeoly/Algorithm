import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int C = scanner.nextInt();

		for (int i = 0; i < C; i++) {
			int N = scanner.nextInt();
			int score[] = new int[N];

			int sum = 0;

			for (int j = 0; j < N; j++) {
				int inputScore = scanner.nextInt();
				score[j] = inputScore;
				sum += inputScore;
			}

			double average = (double) sum / N;

			int count = 0;

			for (int j = 0; j < N; j++) {
				if (score[j] > average) {
					count++;
				}
			}
			double ratio = (double) count / N * 100; // 평균을 넘는 학생의 비율 계산

			System.out.printf("%.3f%%\n", ratio); // 결과 출력
		}
		scanner.close();
	}
}
