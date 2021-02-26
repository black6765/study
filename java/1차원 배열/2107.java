import java.io.*;

public class Main {
	public static void main (String [] args) throws IOException {
		int[] arr = new int[10];
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i])
				{
					count++;
					break;
				}
			}
		}
		
		bw.write(String.valueOf(10 - count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}