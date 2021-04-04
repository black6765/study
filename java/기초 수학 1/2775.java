import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int k, n;
        int[][] arr = new int[15][15];

        for (int i = 0; i < 15; i++) {
            arr[0][i] = i;
            arr[i][0] = 0;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
		// 가로 세로의 0번째 줄이 주어지면 나머지는 해당 공식으로 계산 가능함
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        for (int i = 0; i < T; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(arr[k][n]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
