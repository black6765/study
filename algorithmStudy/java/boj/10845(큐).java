// 10845 : 큐
// 2021-10-03

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		List<Integer> list = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String check = st.nextToken();
			if(check.equals("push"))
				list.add(Integer.parseInt(st.nextToken()));
			if(check.equals("pop")) {
				if(list.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(list.get(0));
					list.remove(0);
				}
			}
			if(check.equals("size"))
				System.out.println(list.size());
			if(check.equals("empty")) {
				if(list.isEmpty())	System.out.println("1");
				else System.out.println("0");
			}
			if(check.equals("front")) {
				if(list.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(list.get(0));
				}
			}
			if(check.equals("back")) {
				if(list.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(list.get(list.size() - 1));
				}
			}
		}
	}
}