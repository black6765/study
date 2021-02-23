import java.io.*;

public class Main {
	public static void main (String [] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = Integer.MIN_VALUE;
		int idx = 0;
		int tmp;
		for (int i = 0; i < 9; i++) {
			if(max < (tmp = Integer.parseInt(br.readLine()))) {
				max = tmp;
				idx = i;
			}
		}
		
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(idx+1));
		
		bw.flush();
		bw.close();
		br.close();
	}
}