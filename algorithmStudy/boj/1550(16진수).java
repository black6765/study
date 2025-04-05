import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = Integer.toHexString(15).toUpperCase();
		
		bw.write(s);
		
		bw.flush();
		bw.close();
		br.close();
	}
}