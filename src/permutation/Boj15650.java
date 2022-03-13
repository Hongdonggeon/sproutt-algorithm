package permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15650 {

    private static int n;
    private static int m;
    private static boolean[] check;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        check = new boolean[n + 1];
        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int index) {
        if (index == m) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[index] = i;
                dfs(index + 1);
                for (int j = i + 1; j <= n; j++) {
                    check[j] = false;
                }
            }
        }

    }
}
