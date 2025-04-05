import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    // cur: 패러미터로 전달된 현재의 조합
    // remains: 현재 조합에서 추가할 수 있는 문자들의 집합
    public void recursive(String cur, String remains) {
        // 처음 함수를 호출할 경우 cur이 비어 있는 상태기 떄문에 set에 추가하지 않음
        // 재귀적으로 호출되어 cur로 전달되는 조합들을 set에 추가함
        // 중복은 Set 자료구조의 특성상 자동으로 제거됨
        if (!"".equals(cur)) {
            set.add(Integer.parseInt(cur));
        }
        
        // 처음 전달된 상태에서는 remains에 numbers의 모든 문자열이 전달됨
        // 문자열의 각 문자들을 통해 재귀적으로 모든 조합의 경우의 수를 set에 추가하게 됨
        for (int i = 0; i < remains.length(); i++) {
            recursive(cur + remains.charAt(i), remains.substring(0, i) + remains.substring(i+1));
        }
    }
    
    public int solution(String numbers) {
        int answer = 0;
        
        recursive("", numbers);
        
        // Iterator 사용
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int i = iter.next();
            if (isPrime(i)) {
                System.out.println(i);
                answer++;
            }
        }
        
        //// for loop 사용
        // for (int i : set) {
        //     if (isPrime(i)) {
        //         System.out.println(i);
        //         answer++;
        //     }
        // }

        return answer;
    }
    
    // 소수 판별 함수
    public boolean isPrime(int k) {
        if (k < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) return false;
        }
        
        return true;
    }
}
