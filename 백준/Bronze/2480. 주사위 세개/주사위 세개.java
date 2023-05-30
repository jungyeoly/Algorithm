
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dice1 = scan.nextInt();
		int dice2 = scan.nextInt();
		int dice3 = scan.nextInt();

		scan.close();

		if (dice1 == dice2 && dice2 == dice3) {
			System.out.println(10000 + dice1 * 1000);
		} else if (dice1 == dice2 || dice2 == dice3 || dice3 == dice1) {
			// 주사위 눈이 두 개만 같은 경우
			int sameDice = 0;
			if (dice1 == dice2) {
				sameDice = dice1;
			} else if (dice2 == dice3) {
				sameDice = dice2;
			} else {
				sameDice = dice3;
			}
			System.out.println(1000 + sameDice * 100);
		} else {
			// 모든 눈이 다른 경우
			int maxDice = Math.max(Math.max(dice1, dice2), dice3);
			System.out.println(maxDice * 100);
		}

	}
}
