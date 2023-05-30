import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
        scan.close();

        int newH = H;
        int newM = M - 45;

        if (newM < 0) {
            newH -= 1;
            newM += 60;

            if (newH < 0) {
                newH += 24;
            }
        }

        System.out.println(newH + " " + newM);
    }
}