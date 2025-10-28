import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =  Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sort =  new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sort[i] = arr[i];
        }

        Arrays.sort(sort);


        int rank = 0;
        for(int v : sort){
            if(!map.containsKey(v)){
                map.put(v, rank);
                rank++;
            }
        }

        for(int key : arr){
            bw.write(map.get(key)+" ");
        }

        bw.flush();
        bw.close();
    }
}