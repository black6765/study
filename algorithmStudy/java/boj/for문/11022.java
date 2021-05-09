import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int A,B;
		String str;

		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			wr.write(String.format("Case #%d: %d + %d = %d", i, A, B, A+B));
			wr.newLine();
		}
		
		wr.flush();
		wr.close();
		br.close();
	}
}