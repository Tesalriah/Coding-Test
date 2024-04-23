import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        String[] word = new String[N];
        int cnt = 0;

        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            word[i] = st.nextToken();
        }

        boolean[] check = new boolean[26];
        int prev = 0;
        int notgroup = 0;

        for(int i=0; i< word.length; i++){

            for(int j=0; j<word[i].length(); j++){
                if(prev != word[i].charAt(j)){
                    if(check[word[i].charAt(j) - 'a'] == false){
                        check[word[i].charAt(j) - 'a'] = true;
                        prev = word[i].charAt(j);
                    }else{
                        notgroup = 1;
                    }
                }
            }
            if(notgroup != 1){
                cnt++;
            }
            notgroup = 0;
            check = new boolean[26];
            prev = 0;
        }

        System.out.print(cnt);
    }
}