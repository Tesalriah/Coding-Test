import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        int form = Integer.parseInt(st.nextToken());
        int result = 0;
        int pointer = 0;

        for(int i=num.length()-1; i>=0; i--){
            int sq = 1;
            for(int j=1; j<=i; j++){
                sq = sq * form;
            }
            char number = num.charAt(pointer);
            if(number >= 65){
                result += (number-55) * sq;
            }else{
                result += (number-48) * sq;
            }
            pointer++;
        }

        System.out.println(result);
    }
}