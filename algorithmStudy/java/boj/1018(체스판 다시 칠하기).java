import java.util.*;
import java.io.*;

public class Main {
	
	public static int check(int x, int y, String [] arr) {
		int [] cnt = {0,0};
		
		for(int k = 0; k <= 1; k++) {
			int start = k;
		for(int i = x; i < x + 8; i++) {
			for(int j = y; j < y + 8; j++) {
					if(start % 2 == 0) {
						if(arr[i].charAt(j) == 'W')
							cnt[k]++;
					}else {
						if(arr[i].charAt(j) == 'B')
							cnt[k]++;
					}
					start++;
				}
			start++;
			}
		}
		return Math.max(cnt[0], cnt[1]);
	}
	
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String [] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		int max = -1;
		for(int i = 0; i <= N - 8; i++) {
			for(int j = 0; j <= M - 8; j++) {
				int k = check(i,j,arr);
				if(max < k)
					max = k;
			}
		}
		
		bw.write(String.valueOf(64 - max));
		
		bw.flush();
		bw.close();
		br.close();
	}
}