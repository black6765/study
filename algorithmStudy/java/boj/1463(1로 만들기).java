import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] d = new int[N+1];
		
		Arrays.fill(d, -1);
		
		d[1] = 0;
		for(int i = 1; i <= N; i++) {
			if(i % 6 == 0) {
				d[i] = Math.min(d[i-1], Math.min(d[i/2], d[i/3])) + 1;
			}
			else if(i % 2 == 0) {
				d[i] = Math.min(d[i-1], d[i/2]) + 1;
			}
			else if(i % 3 == 0) {
				d[i] = Math.min(d[i-1], d[i/3]) + 1;
			}
			else {
				d[i] = d[i-1] + 1;
			}
		}
		
		System.out.println(d[N]);
		
		br.close();
	}
}