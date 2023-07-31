import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int answer = -1;

        for (int fiveQuotient = N / 5; fiveQuotient >= 0; fiveQuotient--) {
            int fiveRemainder = N - (fiveQuotient * 5);
            if (fiveRemainder % 3 == 0) {
                int threeQuotient = fiveRemainder / 3;
                answer = fiveQuotient + threeQuotient;
                break;
            }
        }

        System.out.println(answer);
    }
}
