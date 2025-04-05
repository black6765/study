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
		Member [] arr = new Member[N];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			Member m = new Member(Integer.parseInt(st.nextToken()), st.nextToken(), i);
			arr[i] = m;
		}
		
		Arrays.sort(arr, new Comparator<Member>() {
			@Override
			public int compare(Member a, Member b) {
				
				if(a.getAge() == b.getAge()) {
					return a.getQueue() - b.getQueue();
				}
				
				return a.getAge() - b.getAge();
			}
		});
		
		for(Member m : arr) {
			bw.write(m.getAge() + " " + m.getName());
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

