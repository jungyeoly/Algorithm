import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=0; i<T; i++) {
			String word = scanner.next();
			String first = String.valueOf(word.charAt(0));
			String end = String.valueOf(word.charAt(word.length() - 1));
			System.out.println(first + end);
		}
		scanner.close();
	}
}
