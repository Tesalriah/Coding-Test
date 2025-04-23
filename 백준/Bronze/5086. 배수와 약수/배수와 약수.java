import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // 첫
            int B = Integer.parseInt(st.nextToken()); // 두

            String result;
            if(A == 0 && B == 0){
                break;
            }

            if(B % A == 0){
                result = "factor";
            }else if(A % B == 0){
                result = "multiple";
            }else{
                result = "neither";
            }
            bw.write(result);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
