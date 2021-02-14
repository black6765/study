import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// br.readLine 메소드로 공백 있는 한 라인을 읽음
		String str = br.readLine();
		
		// StringTokenizer를 이용해 공백을 구분하여 출력 가능
		StringTokenizer st = new StringTokenizer(str);
		
		// hasMoreTokens 메소드는 토큰이 남아있으면 true를 반환
		// 토큰이 없다면 false를 반환
		// 즉 해당 while문을 통해 모든 토큰 모두 출력
		while (st.hasMoreTokens())
		{
			bw.write(st.nextToken());
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}