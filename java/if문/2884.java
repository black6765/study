import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		final int DEF_M = 45;
		final int ONE_MINUTE = 60;
		
		int total = (H * ONE_MINUTE + M) - DEF_M;
		
		if (total < 0)
		{
			H = 23;
			M = ONE_MINUTE + total;
		}
		else
		{
			H = total / ONE_MINUTE;
			M = total % ONE_MINUTE;
		}
		
		System.out.println(H + " " + M);
		sc.close();
	}
}
