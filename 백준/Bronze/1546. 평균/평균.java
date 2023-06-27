import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 시험 본 과목의 개수
        int[] scores = new int[N]; // 점수를 저장할 배열

        // 점수 입력 받기
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        // 최댓값 구하기
        int maxScore = 0;
        for (int i = 0; i < N; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        double sum = 0; // 점수의 합을 저장할 변수
        for (int i = 0; i < N; i++) {
            double adjustedScore = (double) scores[i] / maxScore * 100; // 점수를 조작하여 계산
            sum += adjustedScore; // 점수의 합 계산
        }

        double average = sum / N; // 평균 계산

        System.out.println(average);
    }
}