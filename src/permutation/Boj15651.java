package permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15651 {
    private static int n;
    private static int m;
    private static boolean[] checks;
    private static int[] arr;
    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        checks = new boolean[n + 1];
        arr = new int[m];
        dfs(0);
        System.out.println(stringBuilder);
    }

    private static void dfs(int index) {
        if (index == m) {
            for (int i : arr) {
                stringBuilder.append(i).append(' ');
            }
            stringBuilder.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!checks[i]) {
                arr[index] = i;
                dfs(index + 1);
                checks[i] = true;
                for (int j = 1; j <= n; j++) {
                    checks[i] = false;
                }
            }

        }
    }
}
