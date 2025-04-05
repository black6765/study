import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int combo = 0;
		List<String> list = new ArrayList<>();
		
		int i = 0;
		while(list.size() != 10000) {
			combo = 0;
			String s = String.valueOf(i);
			for(int j = 1; j < s.length(); j++) {
				if(combo == 2)
					break;
				if(s.charAt(j-1) == '6' && s.charAt(j) == '6')
					combo++;
				else combo = 0;
			}
			if(combo >= 2)
				list.add(s);
			i++;
		}
		
		System.out.println(list.get(N-1));
	}
}