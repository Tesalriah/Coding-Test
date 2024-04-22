import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i=0; i<N; i++){
            for(int k=N-1; k>i; k--){
                bw.write(" ");
            }
            for(int j=0; j<i*2+1; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i=N-2; i>=0; i--){
            for(int k=i; k<N-1; k++){
                bw.write(" ");
            }
            for(int j=i*2+1; j>0; j--){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}