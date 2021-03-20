import java.io.*;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] check = new int[26];
		int ans = 0;
		boolean isBreak = false;
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			
			isBreak = false;
			for (int j = 0; j < check.length; j++) {
				check[j] = 0;
			}
			
			check[s.charAt(0) - 'a']++;
			for (int j = 1; j < s.length(); j++) {
				if (check[s.charAt(j) - 'a'] != 0 && s.charAt(j) != s.charAt(j - 1)) {
					isBreak = true;
					break;
				}
				
				check[s.charAt(j) - 'a']++;
			}
			if (!isBreak)
				ans++;
		}
		
		System.out.println(ans);
		br.close();
	}
}