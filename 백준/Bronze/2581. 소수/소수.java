import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int first = 0;
        int sum = 0;

        for (int i=M; i<=N; i++) {
            if(isPrime(i)){
                sum += i;
                cnt++;
                if(cnt == 1){
                    first = i;
                }
            }
        }
        if(cnt == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum + "\n" + first);
        }
    }

    private static boolean isPrime(int num){
        if(num < 2)return false;
        for (int j=2; j<num; j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }
}