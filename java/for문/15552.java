import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String str;
		StringTokenizer st;
		
		int A,B;
		
		for (int i = 0; i < T; i++)
		{
			str = br.readLine();
			st = new StringTokenizer(str);
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			bw.write(A+B + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}