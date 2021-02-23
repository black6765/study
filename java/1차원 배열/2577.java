import java.io.*;

public class Main {
	public static void main (String [] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input;
		int result = 1;
		int[] count = new int[10];
		for (int i = 0; i < 3; i++) {
			result *= Integer.parseInt(br.readLine());
		} 
		
		input = new String(String.valueOf(result));
		
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == Character.forDigit(i,10)) count[i]++;
			}
		}
		
		for (int j = 0; j < count.length; j++) {
			bw.write(String.valueOf(count[j]));
			bw.newLine();
		}
	
		bw.flush();
		bw.close();
		br.close();
	}
}