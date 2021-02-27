import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main (String [] args) throws IOException {
		int[] arr;
		int M = -9999;
		double avr = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			avr += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (M < arr[i]) {
					M = arr[i];
			}
		}
		
		avr = ((avr / N ) / M) * 100;
		
		bw.write(String.valueOf(avr));
		
		bw.flush();
		bw.close();
		br.close();
	}
}