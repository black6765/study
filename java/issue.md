## BOJ 제출 답안 기록
- 각 파일명은 [문제 번호].java
- 클래스명과 파일명이 일치하지 않으므로 실행 시에는 파일명을 Main으로 변경하여 실행

### Issue Report
#### Java 입ㆍ출력 시 속도 향상 및 문자열 제어
- Scanner 및 System.out.println은 다수의 데이터를 처리 시 효율성이 떨어짐
  - BufferedReader & BufferedWriter 사용
  - BufferedReader의 메소드인 readLine()은 한 줄씩 읽으므로 이를 처리해줄 방법이 필요
    - StringTokenizer 클래스 사용
    - String.split() 메소드 사용  
  - 또한 readLine()은 문자열로 입력 받으므로 이를 숫자로 처리해야할 때는 Integer.parseInt() 사용
  - BufferedWriter.write() 메소드는 단일 문자 또는 문자열을 처리하므로 int 취급에 있어서 주의가 필요(완벽히 이해하지 못함)
    - int를 취급할 때, 특히 두 숫자를 더한 값을 출력하는 경우 등은 꼭 연산하는 int를 괄호로 묶어야 함 
    - String.valueOf() 메소드 사용
    - String.format() 메소드 사용(형식 지정자로 출력하기 편함, 속도는 문자열과 int를 연산해 쓰는 경우와 같음)
    - 속도를 빠르게 하려면 write()의 인자로 단일 문자열 만을 넣어주어야 하는 것으로 보임
      - wr.write(temp + " ");
      - wr.write(String.valueOf(temp)); wr.write(" "); 
      - 위 두 개의 코드의 경우 아래 코드가 10% 정도 빠른 속도를 보였음. 
      - temp + " "를 연산하는 과정에서 새로운 문자열 객체를 만들면서 속도가 느려지는 것으로 추정(String은 연산 시 새로운 객체 생성 - immutable)
      - 버퍼 계열 입 출력에 익숙해진 뒤에는 StringBuilder를 사용하는 것도 고려해야 할 듯
