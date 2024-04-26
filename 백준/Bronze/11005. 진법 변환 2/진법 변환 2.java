import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int form = Integer.parseInt(st.nextToken());

        String result = "";

        while(num != 0){
            int number = num%form;
            num = num/form;
            if(number >= 10){
                number = number + 55;
            }else{
                number = number + 48;
            }
            char word = (char)number;
            result = word + result;
        }

        System.out.print(result);
    }
}