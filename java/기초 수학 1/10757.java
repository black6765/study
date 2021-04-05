import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// StringTokenizer로 공백을 기준으로 구분
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 입력받은 두 수를 저장
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		// A+B의 결과를 출력(add 메소드)
		System.out.println(A.add(B));
		
		br.close();
	}
}
