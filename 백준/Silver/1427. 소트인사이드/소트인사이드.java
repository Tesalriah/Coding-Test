import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Integer[] arr = new Integer[str.length()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - 48;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int num : arr) {
            bw.write(String.valueOf(num));
        }

        bw.flush();
        bw.close();

    }
}