import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			for (int j = 1; j <= T; j++) {
				if (j <= T - i)
					wr.write(" ");
				else
					wr.write("*");
			}
			wr.newLine();
		}
		
		wr.flush();
		wr.close();
		br.close();
	}
}