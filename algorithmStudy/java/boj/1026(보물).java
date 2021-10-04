// 1026 : 보물
// 2021-10-04

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		Integer [] arr1 = new Integer[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++)
			arr1[i] = Integer.parseInt(st.nextToken());
		
		Integer [] arr2 = new Integer[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++)
			arr2[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		
		int ans = 0;
		
		for(int i = 0 ; i < N; i++) {
			ans += arr1[i] * arr2[i];
		}
		
		System.out.println(ans);
	}
}