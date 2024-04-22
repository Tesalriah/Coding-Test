import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        br.close();

        word = word.replace("c=", "0");
        word = word.replace("c-", "0");
        word = word.replace("dz=", "0");
        word = word.replace("d-", "0");
        word =  word.replace("lj", "0");
        word = word.replace("nj", "0");
        word = word.replace("s=", "0");
        word = word.replace("z=", "0");

        System.out.print(word.length());
    }
}