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
        
        for(int i=0; i<N; i++){
            basket[i] = i + 1;
        }

        int hand = 0;

        for(int l=0; l<M; l++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            for(int a=i; a<j; a++){
                hand = basket[a-1];
                basket[a-1] = basket[j-1];
                basket[j-1] = hand;

                j--;
            }
        }
        br.close();

        for(int i=0; i<basket.length; i++){
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}