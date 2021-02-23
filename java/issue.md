## BOJ 제출 답안 기록
- 각 파일명은 [문제 번호].java
- 클래스명과 파일명이 일치하지 않으므로 실행 시에는 파일명을 Main으로 변경하여 실행

### Report
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
      - br.write(temp + " ");
      - br.write(String.valueOf(temp)); br.write(" "); 
      - 위 두 개의 코드의 경우 아래 코드가 10% 정도 빠른 속도를 보였음. 
      - temp + " "를 연산하는 과정에서 새로운 문자열 객체를 만들면서 속도가 느려지는 것으로 추정(String은 문자열끼리 연산 시 새로운 객체 생성 - immutable)
      - 버퍼 계열 입 출력에 익숙해진 뒤에는 StringBuilder를 사용하는 것도 고려해야 할 듯
- EOF 제어(BufferedReader)
  - while ((input = br.readLine()) != null)과 같은 구문으로 EOF(윈도우 10 기준 Ctrl + z) 입력 시 루프를 탈출하게 구현 가능
  - 백준 "10951"번 문제 참고
- 10989번 문제
  - 입력받은 값을 오름차 순으로 정렬하여 출력하는 간단한 정렬 문제
  - 메모리와 시간을 최적화하기 위한 의도
  - 나는 배열의 입력과 출력을 BufferedReader, Writer를 사용하여 줄이고 내장 정렬함수인 Arrays.sort() 메소드를 이용
  - 배열의 인덱스를 값으로 생각하는 식의 구상도 가능. 예를 들어 입력 값이 2, 5, 10이면 arr[2], arr[5], arr[10]의 값을 1로 변경하는 식
    - 그 후에 모든 배열에서 값이 1인 인덱스 번호를 모두 출력하면 정렬 과정 없이 출력 가능(idea by "24069137")
  - 상위권 유저들은 bw.write((i+"\n").repeat(arr[i])); 등으로 출력함 : repeat에 대해서 알아보자
    - repeat는 해당 인덱스의 값이 2이상인 경우 중복된 수가 있으므로, 그것들을 반복적으로 출력해주기 위한 것으로 보임
- Scanner와 BufferedReader & BuffereedWriter의 차이
  - BufferedReader & BuffereedWriter : 입력 값이 9개로 매우 적은 경우에도 Scanner 대비 2/5배 빨라진 성능을 가짐
  - 메모리에서도 1/3 감소된 성능
  - 결론적으로 Scanner를 사용할 이유가 없어 보임(코딩 테스트에서)
  - 물론 해당 수치는 Integer.parseInt() 메소드 외에 문자열 조작을 하지 않은 프로그램에서 실험된 것이므로 문자열 조작이 많이 가해지는 프로그램의 경우에는 따로 테스트가 필요
- bw.write(String.valueOf(값)) + bw.newLine() vs bw.write(값+"\ㅜ")
  - 다시 한 번 실험 결과 출력 횟수가 낮은 프로그램에서도 String 객체의 연산을 이용하지 않고 newLine()을 이용하는 것이 메모리 + 속도에서 효율적임(2577번의 두 개의 제출 사례를 비교해볼 것)

