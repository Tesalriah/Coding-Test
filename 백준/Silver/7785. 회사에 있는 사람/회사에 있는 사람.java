import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(st.nextToken().equals("enter")){
                set.add(name);
            }else{
                set.remove(name);
            }
        }
        br.close();

        List<String> list = new ArrayList<>(set);

        list.sort(Collections.reverseOrder());

        for(int i=0; i<list.size(); i++){
            bw.write(list.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}