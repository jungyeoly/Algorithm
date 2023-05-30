import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		int requireTime = scan.nextInt();

		scan.close();

		// 시간과 분을 분 단위로 변환하여 계산
		int currentTimeInMinutes = H * 60 + M;
		int endTimeInMinutes = currentTimeInMinutes + requireTime;

		// 계산된 분 단위를 시와 분으로 변환
		int newH = endTimeInMinutes / 60 % 24; // 24 시간 표현 유지
		int newM = endTimeInMinutes % 60;

		System.out.println(newH + " " + newM);
	}
}
