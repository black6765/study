import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int ans = s.charAt(0)-'0';
		
		for(int i = 1; i < s.length(); i++) {
			int b = s.charAt(i)-'0'; 
			
			if(ans < 2 || b < 2) ans += b;
			else ans *= b;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}