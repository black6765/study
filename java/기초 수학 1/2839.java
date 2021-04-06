import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// -1이 출력되는 경우는 4 또는 7
		if (N == 4 || N == 7) System.out.println("-1");
		// 4 또는 7 이외의 모든 수는 아래의 조건문에 해당
		else if (N % 5 == 0) System.out.println(N / 5);
		else if (N % 5 == 1 || N % 5 == 3) System.out.println(N / 5 + 1);
		else if (N % 5 == 2 || N % 5 == 4) System.out.println(N / 5 + 2);
		
		br.close();
	}
}
