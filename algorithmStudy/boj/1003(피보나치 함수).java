import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int [][] dp = new int[41][2];
		
		for(int i = 0; i <= 40; i++) {
			if(i == 0) {
				dp[i][0] = 1;
				dp[i][1] = 0; 
			}else if(i == 1) {
				dp[i][0] = 0;
				dp[i][1] = 1;
			}
			else {
				dp[i][0] = dp[i-2][0] + dp[i-1][0];
				dp[i][1] = dp[i-2][1] + dp[i-1][1];
			}
		}


		for(int i = 0; i < N; i++) {
			int k = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(dp[k][0])+ " " + String.valueOf(dp[k][1]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}