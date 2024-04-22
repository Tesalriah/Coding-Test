import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        br.close();

        word = word.toUpperCase();
        int[] alphabat = new int[26];

        for(int i=0; i<word.length(); i++){
            alphabat[word.charAt(i)-65]++;
        }

        int max = 0;
        char usually = ' ';

        for(int i=0; i<alphabat.length; i++){
            if(alphabat[i] == max){
                usually = '?';
            }
            if(alphabat[i] > max){
                max = alphabat[i];
                usually = (char)(i+65);
            }
        }

        System.out.print(usually);

    }
}