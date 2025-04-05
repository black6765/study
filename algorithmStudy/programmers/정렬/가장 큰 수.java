import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String [] arr = new String[numbers.length];
        
        for (int i = 0 ; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return -(a+b).compareTo(b+a);
   
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(String i : arr) {
            sb.append(i);
        }
        
        if (sb.charAt(0) == '0') {
            sb.delete(0, sb.length());
            sb.append("0");
        }
        
        answer = String.valueOf(sb);
        
        return answer;
    }
}

// List 컬렉션 이용
//import java.util.*;
//
//class Solution {
//    public String solution(int[] numbers) {
//        String answer = "";
//        
//        List<String> arr = new ArrayList<>();
//        
//        for (int i = 0 ; i < numbers.length; i++) {
//            arr.add(String.valueOf(numbers[i]));
//        }
//
//        Collections.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return -(a+b).compareTo(b+a);
//   
//            }
//        });
//        
//        
//        StringBuilder sb = new StringBuilder();
//        
//        for(String i : arr) {
//            sb.append(i);
//        }
//        
//        if (sb.charAt(0) == '0') {
//            sb.delete(0, sb.length());
//            sb.append("0");
//        }
//        
//        answer = String.valueOf(sb);
//        
//         return answer;
//    }
//}