import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer dot = Integer.parseInt(br.readLine());
        br.close();

        int move = 1;
        while (dot > 1){
            dot -= 6 * move;
            move ++;
        }

        System.out.print(move);
    }
}