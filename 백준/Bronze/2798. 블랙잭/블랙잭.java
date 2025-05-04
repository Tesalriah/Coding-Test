import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] card = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<card.length; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        int check = -1;
        int result = 0;

        for(int i=0; i<card.length-2; i++){
            for (int j=i+1; j<card.length-1; j++){
                for(int k=j+1; k<card.length; k++){
                    int sum = card[i] + card[j] + card[k];
                    if(M - sum < 0){
                        continue;
                    }
                    if(check == -1){
                        check = M - sum;
                        result = sum;
                    }else{
                        if(M - sum < check){
                            check = M - sum;
                            result = sum;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
