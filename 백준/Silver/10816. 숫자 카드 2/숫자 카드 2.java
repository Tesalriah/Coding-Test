import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        st =  new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            String key =  st.nextToken();

            if(!map.containsKey(key)){
                map.put(key, 1);
            }else{
                map.put(key, map.get(key) + 1);
            }
        }

        int m = Integer.parseInt(br.readLine());

        st =  new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            String key =  st.nextToken();

            if(map.containsKey(key)){
                bw.write(map.get(key) +" ");
            }else{
                bw.write("0 ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}