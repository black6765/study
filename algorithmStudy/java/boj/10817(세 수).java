import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] A = new int[3]; 
		A[0] = Integer.parseInt(st.nextToken());
		A[1] = Integer.parseInt(st.nextToken());
		A[2] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(A);
		
		System.out.println(A[1]);
		
		br.close();
	}
}