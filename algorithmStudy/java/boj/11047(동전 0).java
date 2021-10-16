import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> deq = new ArrayDeque<>();
		
		String [] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		for(int i = 0; i < N; i++) {
			deq.offerLast(Integer.parseInt(br.readLine()));
		}
		
		int ans = 0;
		
		while(K > 0 && !deq.isEmpty()) {
			int r = deq.pollLast();
			
			ans += K / r;
			K = K % r;
		}
		
		System.out.println(ans);
		
		br.close();
	}
}