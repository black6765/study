import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		// M~N까지
		for(int i = M; i <= N; i++) {
			if(i == 2) {
				bw.write(String.valueOf(i));
				bw.newLine();
				continue;
			}else if(i == 1 || i % 2 == 0)
				continue;
			
			boolean isPrime = true;
			for(int j = 3; j <= Math.sqrt(i); j += 2) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}