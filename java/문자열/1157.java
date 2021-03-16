import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String S = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		
		int max = 0;
		for (int i = 0; i < S.length(); i++) {
			if (arr[S.charAt(i) - 'A'] != 0)
				continue;
			
			for (int j = 0; j < S.length(); j++) {
				if (S.charAt(i) == S.charAt(j))
					arr[S.charAt(i) - 'A']++;
			}
			if (arr[max] < arr[S.charAt(i) - 'A'])
				max = S.charAt(i) - 'A';
		}
		
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[max] == arr[i] && max != i) {
				bw.write("?");
				flag = true;
				break;
			}
		}
		
		if (!flag)
			bw.write(max + 'A');
		
		bw.flush();
		bw.close();
		br.close();
	}
}