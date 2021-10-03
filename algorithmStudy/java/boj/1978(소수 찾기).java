import java.util.*;
import java.io.*;

class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		while(st.hasMoreTokens()) {
			int i = Integer.parseInt(st.nextToken());
			if(i == 2) {
				count++;
				continue;
			}
			else if(i == 1 || i % 2 == 0)
				continue;
			
			Boolean isPrime = true;
			for(int n = 3; n <= Math.sqrt(i); n += 2) {
				if(i % n == 0) { 
					isPrime= false;
					break;
				}
			}
			if(isPrime)
				count++;
		}
		
		System.out.println(count);
	}
}