import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String input = st.nextToken();
			
			char[] S = new char[input.length() * R]; 
			for (int j = 0; j < input.length(); j++) {
				for (int k = j*R; k < (j+1)*R; k++) {
					S[k] = input.charAt(j);
				}
			}
			bw.write(S);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}