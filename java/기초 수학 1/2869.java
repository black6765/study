import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double C = Integer.parseInt(st.nextToken());
        
        // 해당 공식으로 달팽이가 올라가는데 걸리는 소요 시간을 계산할 수 있음
        int ans = (int)Math.ceil((C - A) / (A - B)) + 1;
        
        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
        br.close();
    }
}