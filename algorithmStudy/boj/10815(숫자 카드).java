// 숫자 카드
// 2021-10-03

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int [] arr = new int[N];
		
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		Arrays.sort(arr);
		int [] ans = new int[M];
		for(int i = 0; i < M; i++) {
			if(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0)
				ans[i] = 1;
		}
		for(int i : ans) {
			bw.write(i + " ");
		}
		bw.close();
		br.close();
	}
}