import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        
        int answer = 0;
        
        Boolean[] v = new Boolean[computers.length];
        
        for (int i = 0; i < v.length; i++) {
            v[i] = false;
        }
        
      
        // Deque를 큐 자료구조로 사용
        // removeFirst()와 addLast()를 사용
        Deque<Integer> deq = new ArrayDeque<>();
        
        for (int i = 0; i < v.length; i++) {
            // 선택한 노드가 방문한 노드면 바로 continue
            // DFS 구현에서는 플래그를 사용했는데, 이 방식이 더 좋을듯
            if (v[i]) {
                continue;
            }
            
            // 큐에 처음 방문할 노드를 추가
            deq.addLast(i);
            
            while (!deq.isEmpty()) {
                // 방문할 노드의 번호를 cur에 저장
                int cur = deq.removeFirst();
              
                // 방문했다면 continue
                if (v[cur]) {
                    continue;
                }
                
                // 노드를 방문 설정
                v[cur] = true;
                
                for (int j = 0; j < computers[i].length; j++) {
                    // 자기 자신 노드는 무시
                    if (i == j) {
                        continue;
                    }
                    
                    // 현재 기준 노드와 연결되어 있고, 방문되지 않은 노드를 큐에 추가
                    if (computers[cur][j] == 1 && !v[j]) {
                        deq.addLast(j);
                    }
                }
            }
            // 여기까지 진행했다면 하나 이상의 방문되지 않은 노드를 방문한 것이므로
            // 네트워크의 개수를 증가
            answer++;
        }
        
        
        return answer;
    }
}
