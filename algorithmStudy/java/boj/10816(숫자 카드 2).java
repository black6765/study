import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int [] arr = new int[20000001];
		
		for(int i = 0; i < N; i++)
			arr[Integer.parseInt(st.nextToken()) + 10000000]++;
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < M; i++)
			bw.write(String.valueOf(arr[Integer.parseInt(st.nextToken()) + 10000000]) + " ");
		
		bw.flush();
		bw.close();
		br.close();
	}
}