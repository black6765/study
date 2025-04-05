import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = 1000 - Integer.parseInt(br.readLine());
		int ans = 0;
		int remain = 0;

		int [] coin = {500, 100, 50, 10, 5, 1};
		
		for(int k : coin) {
			remain = N / k;
			ans += remain;
			N -= k*remain;
		}

		bw.write(String.valueOf(ans));
		bw.close();
		br.close();
	}
}