## BOJ 제출 답안 기록
- BOJ에서 클래스 이름은 Main으로 해야함
- 각 파일명은 [문제 번호].java
- 클래스명과 파일명이 일치하지 않으므로 실행 시에는 파일명을 Main으로 변경하여 실행

### Report

- bw.flush에 관하여

  - 출력할 때마다 bw.flush를 사용하는 것보다 마지막에 bw.flush로 한 번에 비우는 것이 빠름
  - 11723(집합) 문제 : 마지막에 bw.flush를 사용하면 통과 / 출력할 때마다 bw.flush를 사용하면 시간 초과
  
- equals vs ==

  - BOJ 11650
  - override된 compare 함수에서 두 값을 비교할 때 ==을 쓰면 틀림. equals를 쓰면 정답
  - equals는 값을 비교하고, ==은 객체의 주소를 비교함

- Java8 vs Java11

  - 동일한 문제에 대해서 Java8이 좀 더 빠른 속도가 나옴
  - 1406 : 에디터 참고

- Deque 자료구조 사용 시

  - offer와 add의 속도 차이 발생
  - add가 반환을 하지 않아서 그런지 좀 더 빠름
  - 1406 : 에디터 참고

- 2021-05-30 : Scanner와 BufferedReader 사용 차이

  - ![image-20210530172206860](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20210530172206860.png)
  - 위의 것이 BufferedReader 사용 코드, 아래 것이 Scanner 사용 코드(이하 코드 동일)
  - 엄청난 속도 차이가 존재함

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
      
      ```java
      br.write(temp + " ");
      br.write(String.valueOf(temp)); br.write(" "); 
      ```
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

- ```bw.write(String.valueOf(값)) + bw.newLine() vs bw.write(값+"\n")```
  
  - 다시 한 번 실험 결과 출력 횟수가 낮은 프로그램에서도 String 객체의 연산을 이용하지 않고 newLine()을 이용하는 것이 메모리 + 속도에서 효율적임(2577번의 두 개의 제출 사례를 비교해볼 것)
  
- Stream을 이용한 배열 처리(max, average 등)
  - 사용은 매우 간단하나, for 문을 통해 구하는 것이 속도가 더 빠른 것 같음(1516번 문제 케이스)
  - 하지만 생산성 면에서 빠르므로 익혀두는 것이 좋을듯
  
- StringTokenizer vs String.split()
  
  - 둘 다 구분자를 이용한 문자열 처리에 사용가능
  
- StringTokenizer는 별도의 String 배열 없이 구분자를 이용한 문자열 처리를 할 수 있음

- String.split()은 별도의 String[] str 배열이 필요할 것으로 보임(자른 문자열을 넣어야 하기 때문)

- 1065번 문제
  - 함수의 return type을 boolean으로 하여 if 문 참 거짓을 따지게 했더니 속도가 느려짐(8ms)
  - 더 실험이 필요할 듯
  
- ★ import java.io.* vs 각각 하나씩 import
  - 11720번 문제
  - java.io.*로 하는 것 보다 사용하는 객체만 import하는 것이 8ms 빠른 속도가 나옴

- ★★ 백준 속도에 관한 실험
  - 똑같은 코드를 변수명만 살짝 바꾸어 제출함
  - 같은 코드임에도 4ms의 속도차이 발생
  - 아마 같은 코드를 제출해도 일정 속도의 오차가 있는 듯
    - 똑같은 코드도 8ms 이상의 속도가 차이날 수 있음. 작은 속도에 연연하지 않아야 할듯

- 자바 컬렉션을 이용한 알고리즘 구현도 생각해보자
  
  - 정렬, 최소값 등 다양한 메소드 제공
  
- System.exit(0) 메소드를 사용하면 속도가 상당히 느려지는 듯 함
  
  - 동일 조건에서 해당 구문을 뺐더니 30~40ms 정도의 속도 개선(2839번)

### Language Report

- 자바에서는 String 객체의 인덱스 접근이 불가능하다
  ```java
  String str = "Hello, World";
  System.out.println(str[0]); // 컴파일 에러
  ```

- 대신 charAt 메소드를 이용해서 첨자 접근과 같은 동작을 할 수 있다
  ```java
  String str = "Hello, World";
  System.out.println(str.charAt(0)); // H 출력, 정상 작동
  ```

- StringTokenizer를 이용한 문자열 처리
  - StringTokenizer st = new StringTokenizer([문자열], [구분자])로 "문자열"을 조작할 수 있음
    - 구분자 미 지정시 default로 공백을 구분자로 함
  - BufferedReader 사용 시 공백을 기준으로 문자열 구분할 때 유용
  - StringTokenizer.nextToken()으로  [구분자]를 기준으로 문자열 처리 가능
    - for 문 또는 while 문을 이용해 문자열을 처리
    - while (StringTokenizer.hasMoreToken())을 이용하면 모든 토큰을 사용할 때 까지 반복됨
      - hasMoreToken()은 토큰이 남아있으면 true, 없으면 false를 반환
- br.read() 메소드
  - 한 문자만 읽어 정수형으로 변환함
  - 아스키 코드를 다룰 때 유용할 듯

- String.repeat() 메소드
  - String을 반복할 수 있음
  - ex) "123".repeat(2) => "123123"
  - ex) String str = "123".repeat(3) // s.equals("123123") : true
