import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int MAX_INDEX = 2000001;
		int[] arr = new int[MAX_INDEX];
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(st.nextToken())+1000000]++;
		}
		
		int min = 0;
		int max = 0;
		for (int i = 0; i <= 2000000; i++) {
			if (arr[i] != 0)
			{
				min = i - 1000000;
				break;
			}
		}
		
		for (int i = 2000000; i >= 0; i--) {
			if (arr[i] != 0)
			{
				max = i - 1000000;
				break;
			}
		}
		
		System.out.println(min + " " + max);
	}
}