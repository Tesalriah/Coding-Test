import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];

        for(int i=0; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int max = arr[0];
        int th = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
                th = i+1;
            }
        }
        bw.write(max + "\n" + th);

        bw.flush();
        bw.close();
    }
}