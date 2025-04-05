// 10866 : 덱
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
			if(check.equals("push_front"))
				deq.offerFirst(Integer.parseInt(st.nextToken()));
			if(check.equals("push_back"))
				deq.offerLast(Integer.parseInt(st.nextToken()));
			if(check.equals("pop_front")) {
				if(deq.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(deq.pollFirst());
				}
			}
			if(check.equals("pop_back")) {
				if(deq.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(deq.pollLast());
				}
			}
			if(check.equals("size"))
				System.out.println(deq.size());
			if(check.equals("empty")) {
				if(deq.isEmpty())	System.out.println("1");
				else System.out.println("0");
			}
			if(check.equals("front")) {
				if(deq.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(deq.peekFirst());
				}
			}
			if(check.equals("back")) {
				if(deq.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(deq.peekLast());
				}
			}
		}
	}
}