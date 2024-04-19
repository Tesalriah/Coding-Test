import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] piece = new int[]{1, 1, 2, 2, 2, 8};
        int[] have = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<have.length; i++){
            have[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for(int i=0; i<piece.length; i++){
            int result = piece[i]-have[i];
            bw.write(result + " ");
        }

        bw.flush();
        bw.close();
    }
}