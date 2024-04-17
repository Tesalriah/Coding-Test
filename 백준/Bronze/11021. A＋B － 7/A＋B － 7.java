import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int sum;

        for(int i=1; i<T+1; i++){
            st = new StringTokenizer(br.readLine());
            sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            bw.write("Case #"+ i +": "+ sum +"\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}