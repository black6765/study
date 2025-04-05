import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        String[] input = br.readLine().split(" ");

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int ans = 0;
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(input[i]);

            if (list.peekFirst() == target) {
                one(list);
            } else {
                int idx = list.indexOf(target);

                if (idx <= Math.ceil(list.size() / 2)) {
                    while (true) {
                        two(list);
                        ans++;
                        if (list.peekFirst() == target) {
                            one(list);
                            break;
                        }
                    }

                } else {
                    while (true) {
                        three(list);
                        ans++;
                        if (list.peekFirst() == target) {
                            one(list);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static <T> void one(LinkedList<T> list) {
        list.removeFirst();
    }

    public static <T> void two(LinkedList<T> list) {
        list.addLast(list.removeFirst());
    }

    public static <T> void three(LinkedList<T> list) {
        list.addFirst(list.removeLast());
    }
}