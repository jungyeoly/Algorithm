import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			BigInteger n = sc.nextBigInteger();
			BigInteger m = sc.nextBigInteger();

			BigInteger oneMoney = n.divide(m);
			BigInteger remainMoney = n.remainder(m);

			System.out.println(oneMoney);
			System.out.println(remainMoney);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
