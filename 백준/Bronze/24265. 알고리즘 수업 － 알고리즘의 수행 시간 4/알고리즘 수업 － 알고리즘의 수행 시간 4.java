import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) - 1;
        long result = 0;

        while (n != 0){
            result+=n;
            n--;
        }
        System.out.println(result);
        System.out.println(2);
    }
}