import java.io.*;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int count = 0;
		
		for (int i = 0; i < input.length(); i++, count++) {
			if (i == input.length() - 1) {
				count++;
				break;
			}
			char nextChar = input.charAt(i+1);
			
			switch(input.charAt(i)) {
			case 'c':
				if (nextChar == '=' || nextChar == '-')
					i++;
				break;
			case 'd':
				if ((i+2 < input.length() && nextChar == 'z' && input.charAt(i+2) == '='))
					i += 2;
				else if (nextChar == '-')
					i++;
				break;
			case 'l':
				if (nextChar == 'j')
					i++;
				break;
			case 'n':
				if (nextChar == 'j')
					i++;
				break;
			case 's':
				if (nextChar == '=')
					i++;
				break;
			case 'z':
				if (nextChar == '=')
					i++;
				break;
			default:
				break;
			}
		}
		System.out.println(count);
		br.close();
	}
}