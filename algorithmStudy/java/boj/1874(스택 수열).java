import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] arr = new int[N];
		Deque<Integer> deq = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		boolean flag = false;
		StringBuilder sb = new StringBuilder("");
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if (deq.peekLast() == null || deq.peekLast() < arr[i] ) {
				int k = arr[i] - cnt;
				for(int j = 0; j < k; j++) {
					sb.append("+\n");
					deq.offerLast(++cnt);
				}
				sb.append("-\n");
				deq.pollLast();
			}
			else if(deq.peekLast() == arr[i]) {
				deq.pollLast();
				sb.append("-\n");
			}
			else {
				flag = true;
				break;
			}
		}
		if(flag)
			bw.write("NO");
		else {
			bw.write(String.valueOf(sb));
		}
		bw.close();
		br.close();
	}
}