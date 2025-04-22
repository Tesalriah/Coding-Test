import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer dot = Integer.parseInt(br.readLine());
        br.close();

        System.out.print((int)Math.pow(Math.pow(2, dot) + 1, 2));

    }
}