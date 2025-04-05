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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int a = 1;
		int b = 1;
		for(int i = N; i > N - K; i--) {
			a *= i;
		}
		
		for(int i = 1; i <= K; i++) {
			b *= i;
		}
		
		System.out.println(a / b);
	}
}