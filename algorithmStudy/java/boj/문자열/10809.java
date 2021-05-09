import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		
		// 'a' ~ 'z'까지 c의 값을 하나씩 올림
		for (char c = 'a'; c <= 'z'; c++) {
			// 각 문자에 대해 문자열의 원소 하나 하나를 비교
			for (int i = 0; i < S.length(); i++) {
				if (c == S.charAt(i)) {
					// 'a' 문자에 대한 인덱스는 0, 즉 c - 'a'로 인덱스 접근
					// i는 문자열에서 해당 문자가 위치한 인덱스를 의미
					arr[c - 'a'] = i;
					break;
				}
				// if문에 걸리지 않아 break 되지 않는다면 초기값인 -1이 남게 됨
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}

		
		bw.flush();
		bw.close();
		br.close();
	}
}