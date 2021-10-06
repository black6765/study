import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int count = 0;
			String s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '(')
					count++;
				else count--;
				
				if(count < 0) {
					bw.write("NO");
					bw.newLine();
					break;
				}
			}
			if(count == 0) {
				bw.write("YES");
				bw.newLine();
			} else if(count > 0) {
				bw.write("NO");
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}