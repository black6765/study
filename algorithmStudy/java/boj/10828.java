import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	int ptr = -1;
    	
    	List<Integer> stackList = new ArrayList<>();
    	
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String temp = st.nextToken();
    		if(temp.equals("push")) {
    			stackList.add(Integer.parseInt(st.nextToken()));
    			ptr++;
    		}
    		
    		if(temp.equals("pop")) {
    			if (ptr == -1)
    				System.out.println(-1);
    			else
    				System.out.println(stackList.remove(ptr--));
    		}
    		
    		if(temp.equals("size"))
    			System.out.println(ptr+1);
    		
    		if(temp.equals("empty")) {
    			if(ptr == -1)
    				System.out.println("1");
    			else
    				System.out.println("0");
    		}
    		if(temp.equals("top")) {
    			if(ptr != -1)
    				System.out.println(stackList.get(ptr));
    			else
    				System.out.println(-1);
    		}
    	}
    	br.close();
    }
}