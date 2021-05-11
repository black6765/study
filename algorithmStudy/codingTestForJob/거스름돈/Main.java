// 그리디 알고리즘 예제 3-1 : 거스름돈

import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        int [] coins = {500, 100, 50, 10};

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = 0;

        for (int currentCoin : coins) {
            count += total / currentCoin;
            total %= currentCoin;
        }

        System.out.println(count);
        sc.close();
    }
}

