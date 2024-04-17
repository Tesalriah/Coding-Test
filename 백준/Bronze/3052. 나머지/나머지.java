import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] rm = new int[10];

        for(int i=0; i<rm.length; i++){
            rm[i] = Integer.parseInt(br.readLine());
            rm[i] = rm[i]%42;
        }
        br.close();
        Arrays.sort(rm);

        int cnt = 1;

        for(int i=1; i<rm.length; i++){
            if(rm[i-1] != rm[i]){
                cnt+=1;
            }
        }
        bw.write(cnt + "");

        bw.flush();
        bw.close();
    }
}