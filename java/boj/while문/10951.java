import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int A,B;
		String input = "";
		while ((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
            wr.write(String.valueOf(A+B));
			wr.newLine();
		}
		
		wr.flush();
		wr.close();
		br.close();
	}
}