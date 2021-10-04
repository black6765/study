// 1046 : 에디터
// 2021-10-04

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Character> stack1 = new ArrayDeque<>();
		Deque<Character> stack2 = new ArrayDeque<>();
		
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			stack1.addLast(s.charAt(i));
		}
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			
			switch(input.charAt(0)) {
				case 'L':
					if(!stack1.isEmpty())
						stack2.addLast(stack1.removeLast());
					break;
				case 'D':
					if(!stack2.isEmpty())
						stack1.addLast(stack2.removeLast());
					break;
				case 'B':
					if(!stack1.isEmpty())
						stack1.removeLast();
					break;
				case 'P':
					stack1.addLast(input.charAt(2));
					break;	
			}
		}
		
		while(!stack1.isEmpty()) {
			bw.write(stack1.removeFirst());
		}
		
		while(!stack2.isEmpty()) {
			bw.write(stack2.removeLast());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}