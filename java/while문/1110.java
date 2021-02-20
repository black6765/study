import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int newNum = num;
		int count = 0;
		int temp1, temp2;
		
		do {
			if (newNum < 10) {
				temp1 = newNum;
				temp2 = newNum;
			}
			else {
				temp1 = newNum % 10;
				temp2 = (newNum / 10) + (newNum % 10);
			}
			
			newNum = (10 * temp1) + (temp2 % 10);
			
			count++;
		}
		while (newNum != num);
		
		bw.write(String.valueOf(count));
				
		bw.flush();
		bw.close();
		br.close();
	}
}