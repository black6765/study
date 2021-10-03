// 10828 : 스택
// 2021-10-03

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Deque<Integer> deq = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String check = st.nextToken();
			if(check.equals("push"))
				deq.offerLast(Integer.parseInt(st.nextToken()));
			if(check.equals("pop")) {
				if(deq.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(deq.pollLast());
				}
			}
			if(check.equals("size"))
				System.out.println(deq.size());
			if(check.equals("empty")) {
				if(deq.isEmpty()) System.out.println("1");
				else System.out.println("0");
			}
			if(check.equals("top")) {
				if(deq.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(deq.peekLast());
				}
			}
		}
	}
}