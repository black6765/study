import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i <= N; i++) {
			if(i == 3 || i == 13 || i == 23) {
				count += 3600;
				continue;
			}
			for(int j = 0; j <= 59; j++) {
				if(j == 3 || j == 13 || j == 23 || j == 43 || j == 53) {
					count += 60;
					continue;
				}
				if(j >= 30 && j <= 39) {
					count += 60;
					continue;
				}
				
				for(int k = 0; k <= 59; k++) {
					if(k == 3 || k == 13 || k == 23 || k == 43 || k == 53) {
						count += 1;
						continue;
					}
					if(k >= 30 && k <= 39) {
						count += 1;
						continue;
					}
				}
			}
		}
		System.out.println(count);
	}
}