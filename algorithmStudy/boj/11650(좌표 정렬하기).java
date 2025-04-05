// 11650 : 좌표 정렬하기
// 2021-10-04

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Integer [][] arr = new Integer[N][2];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<Integer []>() {
			@Override
			public int compare(Integer [] a, Integer [] b) {
				// ==를 이용하여 값을 비교하면 오답
				if(a[0].equals(b[0])) {
					return a[1] - b[1];
				}
				
				return a[0] - b[0];
			}
		});
		
		for(int i = 0; i < N; i++) {
			bw.write(String.valueOf(arr[i][0] + " " + arr[i][1]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}