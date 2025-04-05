import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[7];
			int cnt = 0;
			int sum = 0;
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < 7; j++) {
				int k = Integer.parseInt(st.nextToken());
				if(k % 2 == 0) {
					if(min > k) {
						min = k;
					}
					arr[cnt++] = k;
					sum += k;
				}
			}
			System.out.println(sum + " " + min);
		}
	}
}