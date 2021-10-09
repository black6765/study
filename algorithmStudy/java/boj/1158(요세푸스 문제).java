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
		List<Integer> list2 = new ArrayList<>();
		
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
				list2.add(cnt + 1);
			}
			count++;
		}
		
		bw.write("<");
		
		for(int i = 0; i < list2.size(); i++) {
			if(i == list2.size() - 1) {
				bw.write(list2.get(i) + ">");
				break;
			}
			bw.write(list2.get(i) + ", ");
		}
		
		bw.close();
		br.close();
	}
}