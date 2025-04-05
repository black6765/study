import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = 0;
		int B = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			A += Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			B += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(Math.max(A,B));
		
		
		br.close();
	}
}