import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            set.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            String str = st.nextToken();
            if(set.contains(str)){
                set.remove(str);
            }else{
                set.add(str);
            }
        }

        System.out.println(set.size());
    }
}