import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int M = Integer.parseInt(br.readLine());
    	int N = Integer.parseInt(br.readLine());
    	
    	List<Integer> answer = new ArrayList<>();
    	
    	int cnt = 0;
    	for(int i = M; i <=N; i++) {
    		if(i == 2) {
				answer.add(i);
				continue;
			}
			else if(i == 1 || i % 2 == 0)
				continue;
			
			Boolean isPrime = true;
			for(int n = 3; n <= Math.sqrt(i); n += 2) {
				if(i % n == 0) { 
					isPrime= false;
					break;
				}
			}
			if(isPrime)
				answer.add(i);
    	}
    	
    	int sum = 0;
    	for(int i : answer) {
    		sum += i;
    	}
    	
    	if(!answer.isEmpty()) {
    		System.out.println(sum);
    		System.out.println(answer.get(0));
    	}
    	else
    		System.out.println(-1);
    }
}