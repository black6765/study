import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(0);
		}
		
		int cnt = -1;
		int count = 1;
		while(list2.size() != N) {;
			cnt++;
			
			cnt %= N;
			if(list.get(cnt) == 1)
				continue;
			if(count % K == 0) {
				list.set(cnt, 1);
				list2.add(String.valueOf(cnt + 1));
			}
			count++;
		}
		
		System.out.println("<" + String.join(", ", list2) + ">");
		
		bw.close();
		br.close();
	}
}