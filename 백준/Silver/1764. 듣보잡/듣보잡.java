import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> dname = new HashSet<>();
        Set<String> dbj = new HashSet<>();

        for(int i = 0; i < n; i++){
            dname.add(br.readLine());
        }

        for(int i = 0; i < m; i++){
            String name =  br.readLine();
            if(dname.contains(name)){
                dbj.add(name);
            }
        }
        br.close();

        String[] result = dbj.toArray(new String[0]);
        Arrays.sort(result);

        bw.write(result.length+"\n");

        for(int i = 0; i < result.length; i++){
            bw.write(result[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}