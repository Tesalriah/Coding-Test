import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N];
        for(int l=0; l<basket.length; l++){
            basket[l] = 0;
        }

        // 3 3 0 0 0
        // 3 3 4 4 0
        // 1 1 1 1 0
        // 1 2 1 1 0

        for(int l=0; l<M; l++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for(int a=i; a<=j; a++){
                basket[a-1] = k;
            }
        }
        br.close();

        for(int l=0; l<basket.length; l++){
            bw.write(basket[l] + " ");
        }

        bw.flush();
        bw.close();
    }
}