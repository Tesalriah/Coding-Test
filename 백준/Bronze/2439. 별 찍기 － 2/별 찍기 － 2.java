import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i=T-1; i>=0; i--){
            for(int j=i; j>0; j--){
                bw.write(" ");
            }
            for(int j=i; j<T; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}