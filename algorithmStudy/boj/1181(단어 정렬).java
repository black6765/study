// 1181 : 단어 정렬
// 2021-10-04

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String [] arr = new String[N];

		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if(a.length() == b.length()) {
					return a.compareTo(b);
				}
				
				return a.length() - b.length(); 
			}
		});
		
		for(int i = 0; i < N; i++) {
			if(i > 0 && arr[i-1].equals(arr[i]))
				continue;
			bw.write(arr[i]);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}