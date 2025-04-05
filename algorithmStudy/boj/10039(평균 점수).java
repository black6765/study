import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int k = Integer.parseInt(br.readLine());
			if(k < 40)
				k = 40;
			sum += k;
		}
		
		System.out.println(sum / 5);
	}
}