import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        br.close();

        A = reverse(A);
        B = reverse(B);

        if(Integer.parseInt(A) > Integer.parseInt(B)){
            bw.write(A);
        }if(Integer.parseInt(A) < Integer.parseInt(B)){
            bw.write(B);
        }

        bw.flush();
        bw.close();
    }

    private static String reverse(String str){
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
