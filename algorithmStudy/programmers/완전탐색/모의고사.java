import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int [] answer2 = new int[3];
        int[] answer = {};
        
        int [] a = new int[10000];
        int [] b = new int[10000];
        int [] c = new int[10000];
        Integer [] arr = {0,0,0};
        int cnt = 1;
        for(int i = 0; i < 10000; i++) {
            a[i] = (i % 5) + 1;
            if(i % 2 == 0) {
                b[i] = 2;
            } 
            else {
                if(cnt == 6)
                    cnt = 1;
                if(cnt == 2) {
                    cnt++;
                }
                b[i] = cnt++;
            }
            switch(i % 10) {
                case 0:
                case 1:
                    c[i] = 3;
                    break;
                case 2:
                case 3:
                    c[i] = 1;
                    break;
                case 4:
                case 5:
                    c[i] = 2;
                    break;
                case 6:
                case 7:
                    c[i] = 4;
                    break;
                case 8:
                case 9: 
                    c[i] = 5;
                    break;
            }
        } 
        
        for(int i = 0; i < answers.length; i++) {
            if (a[i] == answers[i])
                arr[0]++;
            if (b[i] == answers[i])
                arr[1]++;
            if (c[i] == answers[i])
                arr[2]++;
        }
        
        int max = arr[0];
        for(int i = 1; i < 3; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        
        int k = 0;
        for(int i = 0; i < 3; i++) {
            if(max == arr[i]) {
                answer2[k++] = i+1;
                
            }
        }
        
        answer = new int[k];
        
        for(int i = 0; i < k; i++) {
            answer[i] = answer2[i];
        }
        
        return answer;
    }
}