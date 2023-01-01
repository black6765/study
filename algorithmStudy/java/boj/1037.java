import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        int max = -1;
        int min = 10000001;
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(input[i]);

            if (k > max) {
                max = k;
            }

            if (k < min) {
                min = k ;
            }
        }
		
        ans = min * max;

        System.out.println(ans);
    }
}