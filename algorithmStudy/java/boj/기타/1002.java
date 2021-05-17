import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int k;
		int x1,y1,x2,y2,r1,r2;
		double d;
		int T = Integer.parseInt(br.readLine());
		int [] arr = new int[T];
		
		for(int i = 0; i < T; i++) {
			k = 0;
			d = 0;
			
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());

			d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			
			if (x1 == x2 && y1 == y2 && r1 == r2)
			    k = -1;
			else if (r2 + r1 == d || Math.abs(r2 - r1) == d)
			    k = 1;
			else if (r1 + r2 < d || d < Math.abs(r2 - r1) || d == 0)
			    k = 0;
			else
				k = 2;
			
			arr[i] = k;
		}
			
		for(int i : arr) {
			System.out.println(i);
		}
		
		bw.close();
		br.close();
	}
}