public class Main {
	
	// 체크를 위한 int 배열
	static int[] arr = new int[10001];
	
	public static void main (String [] args) {
		
		// arr의 모든 인덱스의 값을 1로 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
		
		// n과 각 자릿수를 더하는 연산을 재귀적으로 수행하는 d() 함수의 인자를 1~10000 범위에서 호출함
		// 이미 셀프 넘버가 될 수 없는 i값에 대해서는 continue로 스킵
		for (int i = 0; i <= 10000; i++) {
			if(arr[i] != 1)
				continue;
			
			d(i);
		}
		
		// 위에서 구한 모든 셀프 넘버를 출력
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				System.out.println(i);
		}
		
	}
	
	// 셀프 넘버를 구하기 위한 함수
	public static void d (int n) {
		
		// sum은 각 자릿수의 합이 저장되는 변수
		int sum = 0;
		
		// temp는 각 자릿수의 합을 구할 때 사용
		int temp = n;
		
		// 각 자릿수의 합을 구함
		while (temp != 0) {
			sum += temp % 10;
			temp = temp / 10;
		}
		
		// 문제에서 정의된 d(n) 함수의 연산을 수행함
		n = n + sum;
		
		// 재귀 함수의 종료 조건을 정함
		// n > 10000일 때 문제에서 주어진 조건을 넘어서므로 종료
		
		if (n > 10000)
			return;
		// arr[n] != 1 일 때 재귀 호출을 하게 되면 이미 행해진 연산을 다시 수행하므로 효율성을 위해 종료
		else if(arr[n] != 1)
			return;
		// 그 외의 경우에 한해서 arr[n]의 값을 감소시킨 후 재귀 호출
		// 최종 함수 호출 후 배열 arr에서 값이 1로 남아 있는 인덱스가 셀프 넘버가 됨
		else {
			arr[n]--;
			
			d(n);
		}
	}
}