import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] counting = new int[10001];
        int[] result = new int[n];


        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }

        for(int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        for(int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        for(int i = 0; i < result.length; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}