import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if(line.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }


        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){
                find(i , j);
            }
        }

        System.out.println(min);
    }

    public static void find(int a, int b){
        boolean TF = arr[a][b];
        int cnt = 0;

        for(int i = a; i < a + 8; i++){
            for(int j = b; j < b + 8; j++){
                if(arr[i][j] != TF){
                    cnt++;
                }
                TF = !TF;
            }
            TF = !TF;
        }

        cnt = Math.min(cnt, 64 -cnt);

        min = Math.min(min, cnt);
    }
}