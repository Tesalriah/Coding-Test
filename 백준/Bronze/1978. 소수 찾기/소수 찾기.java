import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num != 1){
                if(isPrime(num)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    private static boolean isPrime(int num){
        boolean result = true;
        for (int j=2; j<num; j++){
            if(num % j == 0){
                result = false;
            }
        }
        return result;
    }
}