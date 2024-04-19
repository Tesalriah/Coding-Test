import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char chr = br.readLine().charAt(0);
        br.close();

        bw.write((int)chr + "");

        bw.flush();
        bw.close();
    }
}