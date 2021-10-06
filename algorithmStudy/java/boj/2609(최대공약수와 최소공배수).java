import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int r = 0;
		
		int C = A*B;
		
		while(B != 0) {
			r = A % B;
			A = B;
			B = r;
		}
		
		System.out.println(A);
		System.out.println((C/A));
	}
}