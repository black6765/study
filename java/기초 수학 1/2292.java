import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ans = 0;
        int k = 1;
        int N = Integer.parseInt(br.readLine());
        
        // 벌집의 개수는 1을 중심으로 6, 12, 18 ... 순으로 공차가 6인 등차수열의 형태를 가지게 됨
        // 따라서 ans(while 루프 횟수를 세어 출력하기 위한 변수)를 이용하여 해당 위치까지 가기 위한 최소값을 구함
        // k < N이라는 조건에 의해 최소값이 구해지면 k >= N이므로 break 되며 답을 출력하고 종료
        while(true) {
        	ans++;
        	if (k < N)
        		k += 6 * ans;
        	else break;
        }

        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
        br.close();
    }
}