import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String,Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			map.put(br.readLine(), 1);
		}
		
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < M; i++) {
			String s = br.readLine();
			if(map.containsKey(s))
				list.add(s);
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		
		System.out.println(list.size());
		for(String s : list) {
			System.out.println(s);
		}
		
		br.close();
	}
}