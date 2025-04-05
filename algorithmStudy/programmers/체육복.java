import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = 0;
        
        // lost가 cover되었다는 의미의 covered 변수
        // lost 배열의 길이에서 cover된 만큼 뺀다음 이 값을 n에서 빼면 answer의 값이 나옴
        // 최종적으로 answer = n - ([lost 배열의 길이] - covered)라는 식으로 답을 리턴
        int covered = 0;
        
        // 항상 같은 순서(앞부터)로 검사하기 위한 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        
        // 여벌이 있는 학생 중 도난 당한 학생 처리
        // 배열을 변경하지 않고 값을 "삭제"한 것처럼 처리하기 위해 임의의 음수를 할당
        // lost가 cover된 것이라고 볼 수 있으므로 covered의 값을 1 증가
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -10000;
                    reserve[j] = -20000;
                    covered++;
                }
            }
        }
        
        
        // lost 배열 기준으로 reserve 배열 전체를 확인하며 체육복을 가진 앞 또는 뒤 학생이 존재하는지 탐색
        // 존재한다면 해당 인덱스의 lost와 reserve 값을 임의의 음수로 변경하고, lost가 cover되었다는 의미의 covered의 값을 1 증가
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {             
                if (lost[i] == reserve[j] - 1) {
                    lost[i] = -30000;
                    reserve[j] = -400000;
                    covered++;
                } else if (lost[i] == reserve[j] + 1) {
                    lost[i] = -500000;
                    reserve[j] = -6000000;
                    covered++;
                }
            }
        }
        
        
        answer = n - (lost.length - covered);
        
        return answer;
    }
}
