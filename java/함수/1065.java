import java.io.*;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		
		int N = Integer.parseInt(br.readLine());
		
		// 1~N까지 for 문 실행
		// 리턴 값이 0이면 한수라는 뜻으로 cnt++
		for (int i = 1; i <= N; i++) {
			if(func(i) == 0 ) {
				cnt++;
			}
		}
		
		// 결과 값 출력
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int func (int n) {
		// 정수 n을 String으로 변경
		// 인덱스 접근(charAt)을 통해 공차를 쉽게 구하기 위함
		String target = String.valueOf(n);
		
		// 두자리 수 이하는 모두 한수
		if (target.length() <= 2) {
			return 0;
		}
		
		// d는 등차수열의 공차
		int d = target.charAt(1) - target.charAt(0);
		for (int i = 1; i < target.length() - 1; i++) {
			// 만약 두 수의 차이가 공차와 같지 않다면 한수가 아니므로 1을 반환
			if (d != target.charAt(i+1) - target.charAt(i)) {
				return 1;
			}
		}
		// for문을 통과했다면 n은 한수이므로 0을 리턴
		return 0;
	}
}