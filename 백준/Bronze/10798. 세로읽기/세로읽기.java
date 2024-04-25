import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] arr = new char[5][15];

        for(int i=0; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            for(int j=0; j<word.length(); j++){
                arr[i][j] = word.charAt(j);
            }
            for(int j=word.length(); j<15; j++){
                arr[i][j] = ' ';
            }
        }
        br.close();

        for(int j=0; j<arr[0].length; j++){
            for(int k=0; k<arr.length; k++){
                if(arr[k][j] != ' '){
                    bw.write(arr[k][j] + "");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}