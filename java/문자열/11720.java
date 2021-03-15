import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			// (int)'0' -> 48이므로 각 아스키 코드 문자에서 48을 뺀 값이 정수값 
			sum += s.charAt(i) - '0';			
		}

		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
		br.close();
	}
}