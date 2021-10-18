import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<Integer,String> map = new HashMap<>();
		Map<String,Integer> map2 = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			map.put(i + 1, s);
			map2.put(s, i + 1);
		}
		
		
		for(int i = 0; i < M; i++) {
			String s = br.readLine();
			
			if(s.charAt(0) >= '0' && s.charAt(0) <= '9') {
				bw.write(map.get(Integer.parseInt(s)));
				bw.newLine();
			}
			else {
				bw.write(String.valueOf(map2.get(s)));
				bw.newLine();
			}
			bw.flush();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}