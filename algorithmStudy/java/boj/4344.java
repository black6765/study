import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int C = Integer.parseInt(br.readLine());
		int[] arr;
		String input;
		double[] resultArr = new double[C];
		
		for (int i = 0; i < C; i++) {
			input = br.readLine();
			st = new StringTokenizer(input);
			arr = new int[Integer.parseInt(st.nextToken())];
			
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			int count = 0;
			for (int j2 = 0; j2 < arr.length; j2++) {
				if (sum / arr.length < arr[j2]) {
					count++;
				}
			}
			
			resultArr[i] = (count / (double)arr.length) * 100;
			bw.write(String.format("%.3f%%\n", resultArr[i]));
		}	
		
		bw.flush();
		bw.close();
		br.close();
	}
}