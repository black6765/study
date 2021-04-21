import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		for (int i = N; i >= 1; i--)
		{
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

/* 
// bw.write는 문자열을 출력 : bw.wirte(i); bw.newLine();을 하면 제어문자 값이 출력되는 문제
// bw.write에 들어가는 정수 값(i)을 String.valueOf 메소드를 이용해 스트링 값으로 바꿔준 후 출력
// String.valueOf와 Integer.toString 메소드가 사용 가능하지만, 예외 처리상 String.valueOf가 더 낫다고 함(추후 확인할 것)
// 위의 코드 대비 아래 코드가 실행 속도가 20%정도 향상됨

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		for (int i = N; i >= 1; i--)
		{
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
*/