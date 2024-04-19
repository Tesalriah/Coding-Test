import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char[] arr = new char[26];
        br.close();

        for(int i=0; i<arr.length; i++){
            arr[i] = (char)(97+i);
        }

        for(int i=0; i<arr.length; i++){
            bw.write(s.indexOf(arr[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}