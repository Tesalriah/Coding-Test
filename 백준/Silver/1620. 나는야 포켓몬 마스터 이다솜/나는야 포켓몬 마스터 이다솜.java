import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();

        for(int i=1; i<=n; i++){
            String name = br.readLine();
            map.put(name, i);
            map2.put(i,name);
        }

        for(int i=0; i<m; i++){
            String name =  br.readLine();
            if(isInteger(name)){
                bw.write(map2.get(Integer.parseInt(name)) + "\n");
            }else{
                bw.write(map.get(name) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
}