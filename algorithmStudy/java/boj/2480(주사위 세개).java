import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		int ans = 0;
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(arr[0] == arr[1] && arr[1] == arr[2]) {
			ans = 10000+(arr[0] * 1000);
		}else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2] ) {
			if(arr[0] == arr[1])
				ans = 1000+(arr[0] * 100);
			if(arr[0] == arr[2])
				ans = 1000+(arr[0] * 100);
			if(arr[1] == arr[2])
				ans = 1000+(arr[1] * 100);
		}else {
			ans = Math.max(Math.max(arr[0], arr[1]),Math.max(arr[1], arr[2])) * 100;
		}
		
		System.out.println(ans);
		
		br.close();
	}
}