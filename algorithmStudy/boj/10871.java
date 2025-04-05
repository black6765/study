import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int temp;
		
		input = br.readLine();
		
		st = new StringTokenizer(input);

		for (int i = 0; i < N; i++) {
			if(X > (temp = Integer.parseInt(st.nextToken()))) {
				wr.write(String.valueOf(temp)); // 해당 라인에서 String.valueOf의 인자로 temp + " "를 주어도 됨
				wr.write(" "); // 하지만 두 줄에 걸쳐서 나누어 출력하는게 더 빠름(10%) : temp + " "를 연산하는 과정에서 시간 증가하는 듯 함(int와 string 연산)
			}
		}

		wr.flush();
		wr.close();
		br.close();
	}
}