import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 1;
        int B = 1;
        boolean flag = true;
        int X = Integer.parseInt(br.readLine());
        int count = 1;
        
        while (count != X) {
        	if (flag == true) {
        		if (A == 1) {
        			B++;
        			flag = false;
        			count++;
        		}
        		else {
        			A++;
        			flag = false;
        			count++;
        		}
        	}
        	else {
        		if (A == 1) {
                    for (; B != 1 && count != X; A++, B--) {
                        count++;
                    }
                    flag = true;
                }
                else {
                    for (; A != 1 && count != X; A--, B++) {
                        count++;
                    }
                    flag = true;
                }
        	}
        }

        bw.write(String.valueOf(A + "/" + B));

        bw.flush();
        bw.close();
        br.close();
    }
}