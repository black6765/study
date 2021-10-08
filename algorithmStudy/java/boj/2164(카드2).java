import java.util.*;
import java.io.*;

public class Main {
	public static class Member {
		private int age;
		private String name;
		private int queue;
		
		Member(int age, String name, int queue) {
			this.age = age;
			this.name = name;
			this.queue = queue;
		}
		
		String getName() {
			return this.name;
		}
		
		int getAge() {
			return this.age;
		}
		
		int getQueue() {
			return this.queue;
		}
	}
	
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new ArrayDeque<>();
		for(int i = 1; i <= N; i++) {
			deq.offerLast(i);
		}
		
		
		while(deq.size() != 1) {
			deq.removeFirst();
			deq.offerLast(deq.pollFirst());
		}
		
		System.out.println(deq.pollFirst());
	}
}