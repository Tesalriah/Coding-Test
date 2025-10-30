import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n =  Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++){
            int num =  Integer.parseInt(st.nextToken());
            bw.write(search(num) + " ");
        }

        bw.flush();
        bw.close();
    }

    public static int search(int num){
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            int midVal = arr[mid];

            if(num >  midVal){
                left = mid + 1;
            }else if(num <  midVal){
                right = mid - 1;
            }else{
                return 1;
            }
        }
        return 0;
    }
}