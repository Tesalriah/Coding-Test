import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        br.close();

        String reverse = "";
        int ispal = 1;

        for(int i=word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }

        if(word.equals(reverse)){
            ispal=1;
        }else{
            ispal=0;
        }

        System.out.print(ispal);
    }
}
