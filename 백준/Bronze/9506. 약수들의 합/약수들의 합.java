import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int n = Integer.parseInt(br.readLine());

            if(n == -1){
                break;
            }

            List<Integer> list = new ArrayList<>();

            for(int i=1; i<n; i++){
                if(n % i == 0){
                    list.add(i);
                }
            }

            int total = 0;
            String result = n + "";
            String str = " = ";

            for(int i=0; i<list.size(); i++){
                total += list.get(i);
                if (i != list.size() -1){
                    str += list.get(i) + " + ";
                }else{
                    str += list.get(i);
                }
            }

            if(total == n){
                result += str;
            }else{
                result += " is NOT perfect.";
            }

            bw.write(result);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
