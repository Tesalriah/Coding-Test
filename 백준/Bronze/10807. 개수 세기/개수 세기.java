import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<list.length; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i<list.length; i++){
            if(list[i] == num){
                cnt+=1;
            }
        }
        bw.write(cnt + "");

        br.close();
        bw.flush();
        bw.close();
    }
}