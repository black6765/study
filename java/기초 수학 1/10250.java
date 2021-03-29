import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int H, W, N;
        int X, Y;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            X = (N / H) + 1;
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