import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j=0; j<str.length(); j++){
                String result = "";
                for(int k=0; k<r; k++){
                    result += str.charAt(j);
                }
                bw.write(result);
            }
            bw.write("\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}