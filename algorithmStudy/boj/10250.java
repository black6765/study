import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int H, W, N;
        int X, Y;

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            // 호 수는 N을 H로 나눈 것에 1을 더하면 
            X = (N / H) + 1;
            
            // 층 수는 N을 H로 나눈 나머지로 계산됨
            Y = N % H;

            if (Y == 0) {
                Y = H;
                X -= 1;
            }
            bw.write(String.format("%d%02d", Y, X));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
