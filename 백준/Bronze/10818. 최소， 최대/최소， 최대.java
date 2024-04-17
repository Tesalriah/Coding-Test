import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }if(max < arr[i]){
                max = arr[i];
            }
        }
        bw.write(min + " " + max);

        bw.flush();
        bw.close();
    }
}