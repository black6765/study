import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long f = Long.parseLong(br.readLine());
		
		System.out.println(Factorial(f));
	}
	
	public static long Factorial(long e) {
		if(e == 0)
			return 1;
		if(e == 1)
			return 1;
		
		return e * Factorial(e-1);
	}
}