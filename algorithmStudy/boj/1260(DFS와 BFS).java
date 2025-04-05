import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		Deque<Integer> stack = new ArrayDeque<>();
		Deque<Integer> queue = new ArrayDeque<>();
		
		int [][] arr = new int[N+1][N+1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			arr[v1][v2]++;
			arr[v2][v1]++;
		}
		
		stack.offerLast(V);
		int[] checkDFS = new int[N+1];
		while(!stack.isEmpty()) {
			int v = stack.pollLast();
			if(checkDFS[v] != 0)
				continue;
			checkDFS[v]++;
			System.out.print(v + " ");
			for(int i = N; i >= 1; i--) {
				if(arr[v][i] >= 1 && checkDFS[i] == 0) {
					stack.offerLast(i);
				}
				
			}
		}
		
		System.out.println("");
		
		queue.offerLast(V);
		int[] checkBFS = new int[N+1];
		while(!queue.isEmpty()) {
			int v = queue.pollFirst();
			if(checkBFS[v] != 0)
				continue;
			checkBFS[v]++;
			System.out.print(v + " ");
			for(int i = 1; i <= N; i++) {
				if(arr[v][i] >= 1 && checkBFS[i] == 0) {
					queue.offerLast(i);
				}
			}
		}
	}
}