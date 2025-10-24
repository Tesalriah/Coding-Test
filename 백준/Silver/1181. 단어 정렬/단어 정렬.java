import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =  Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);
        Arrays.sort(arr, Comparator.comparing(String::length));

        String temp = "";
        for(int i = 0; i < n; i++){
            if(temp.equals(arr[i])){
                continue;
            }else{
                bw.write(arr[i] + "\n");
                temp = arr[i];
            }
        }
        bw.flush();
        bw.close();
    }
}