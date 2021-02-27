import java.io.*;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int combo;
		int score;
		String input;
		
		for (int i = 0; i < N; i++) {
			combo = 0;
			score = 0;
			input = new String(br.readLine());
			
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == 'O')	{
					combo++;
					score += combo;
				}
				else 	{
					combo = 0;
				}
			}
			
			bw.write(String.valueOf(score));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}