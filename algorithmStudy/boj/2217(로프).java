import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = -1;
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {

            int target = list.get(i) * (list.size() - i);

            if (ans < target) {
                ans = target;
            }
        }

        System.out.println(ans);
    }
}