import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int count = 0;
		
		if (B >= C)
			count = -1;
		else { 
			while(A >= (C - B)*count ) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}