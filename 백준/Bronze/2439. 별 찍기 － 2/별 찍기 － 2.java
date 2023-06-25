import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i=1; i<=N; i++) { //1~N번째 줄 출력
			for(int j=1; j<=N-i; j++) { //공백 출력
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) { // * 출력
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
