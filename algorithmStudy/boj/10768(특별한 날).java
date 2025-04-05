import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		if(N == 2 && M == 18)
			System.out.println("Special");
		else if(N == 2 && M < 18)
			System.out.println("Before");
		else if(N < 2) {
			System.out.println("Before");
		}
		else System.out.println("After");
		
		br.close();
	}
}