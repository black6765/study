import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int bYear = Integer.parseInt(st.nextToken());
		int bMonth = Integer.parseInt(st.nextToken());
		int bDay = Integer.parseInt(st.nextToken());
		
		int cYear = Integer.parseInt(st2.nextToken());
		int cMonth = Integer.parseInt(st2.nextToken());
		int cDay = Integer.parseInt(st2.nextToken());
		
		int age1 = 0;
		if(bMonth < cMonth)
			age1 = cYear - bYear;
		else if(bMonth == cMonth) {
			if(bDay <= cDay)
				age1 = cYear - bYear;
			else age1 = cYear - bYear - 1;
		}
		else {
			age1 = cYear - bYear-1;
		}
		int age2 = cYear - bYear+1;
		int age3 = age2 - 1;
		
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		
		bw.close();
		br.close();
	}
}