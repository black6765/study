import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		BigInteger bi = new BigInteger("1"); 
		for(int i = N; i > 0; i--) {
			BigInteger k = new BigInteger(String.valueOf(i));
			bi = bi.multiply(k);
		}
		
		String s = String.valueOf(bi);

		int count = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == '0')
				count++;
			else break;
		}
		
		System.out.println(count);
		
		br.close();
	}
}