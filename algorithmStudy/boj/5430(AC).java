import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder[] ans = new StringBuilder[T];
		int cnt = 0;
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder(br.readLine());
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length()-1);
			
			st = new StringTokenizer(String.valueOf(sb), ",");
			Deque<Integer> deq = new ArrayDeque<>();
			
			for(int j = 0; j < n; j++) {
				deq.addLast(Integer.parseInt(st.nextToken()));
			}
			boolean eFlag = false;
			boolean flag = false;
			for(int k = 0; k < p.length(); k++) {
				switch(p.charAt(k)) {
				case 'R':
					if(flag)
						flag = false;
					else flag = true;
					break;
				case 'D':
					if(deq.isEmpty()) {
						ans[cnt++] = new StringBuilder("error");
						k += p.length();
						eFlag = true;
						break;
					}
					if(flag) {
						deq.pollLast();
					} 
					else {
						deq.pollFirst();
					}
					break;
				default:
					break;
				}
			}
			if(eFlag)
				continue;
			if(n == 0) {
				ans[cnt++] = new StringBuilder("[]");
				continue;
			}
			int size = deq.size();
			ans[cnt] = new StringBuilder("[");
			if(flag) {
				for(int m = 0; m < size; m++) {
					if(m == size-1)
						ans[cnt].append(String.valueOf(deq.pollLast()));
					else ans[cnt].append(String.valueOf(deq.pollLast()) + ",");
				}
				ans[cnt++].append("]");
				
			}
			else {
				for(int m = 0; m < size; m++) {
					if(m == size-1)
						ans[cnt].append(String.valueOf(deq.pollFirst()));
					else ans[cnt].append(String.valueOf(deq.pollFirst()) + ",");
					
				}
				ans[cnt++].append("]");
			}
		}
		
		for(StringBuilder sb : ans) {
			System.out.println(sb);
		}
		
		bw.close();
		br.close();
	}
}