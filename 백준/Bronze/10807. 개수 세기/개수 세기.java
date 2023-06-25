import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] arr = new int[N]; // N만큼 크기의 배열 생성
		int count = 0; // 개수 세줄 변수 선언 및 생성

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt(); // 각 배열 인덱스에 정수 넣기
		}
		int v = scanner.nextInt();

		for (int j = 0; j < N; j++) {
			if (arr[j] == v) { // arr[j]와 v 비교하여 같으면 count 증가
				count++;
			}
		}
		scanner.close();
		System.out.println(count); // 결과 출력
	}
}
