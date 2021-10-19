import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Set<Integer> set = new HashSet<>();
		
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "add":
				set.add(Integer.parseInt(st.nextToken()));
				break;
			case "remove":
				set.remove(Integer.parseInt(st.nextToken()));
				break;
			case "check":
				int k = Integer.parseInt(st.nextToken());
				if(set.contains(k)) {
					bw.write("1");
					bw.newLine();
				}
				else {
					bw.write("0");
					bw.newLine();
				}
				break;
			case "toggle":
				int num = Integer.parseInt(st.nextToken());
				if(set.contains(num))
					set.remove(num);
				else
					set.add(num);
				break;
			case "all":
				for(int j = 1; j <= 20; j++)
					set.add(j);
				break;
			case "empty":
				set.clear();
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}