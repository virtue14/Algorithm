import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

    // 출력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 한줄 입력 받기
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 문자열 저장
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {

        // 입력받은 문자열 분리
        StringTokenizer st = new StringTokenizer(br.readLine()); // 5 3

        // 배열의 크기
        int n = Integer.parseInt(st.nextToken()); // 5
        // 테스트 케이스(?)
        int m = Integer.parseInt(st.nextToken()); // 3

        int[] arr = new int[n + 1]; // 5 + 1 = 6[0, 1, 2, 3, 4, 5]
        st = new StringTokenizer(br.readLine()); // 5, 4, 3, 2, 1 = 54321

        // 배열 값
        for (int i = 1; i <= n; i++) { // 1 ~ 5

            // 이전값
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());

        }

        // 돌리 수
        for (int i = 0; i < m; i++) {
            // 각 줄마다 입력받기
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            int result = arr[e] - arr[s - 1];
            sb.append(result + "\n");

        }

        bw.flush();
        bw.write(sb.toString());
        bw.close();

    }
}
