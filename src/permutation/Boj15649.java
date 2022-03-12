package permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15649 {
    public static int[] arr;
    public static boolean[] visit;
    public static int n, m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n + 1];
        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int index) {
        if (index == m) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[index] = i;
                dfs(index + 1);
                visit[i] = false;
            }
        }
    }

}
