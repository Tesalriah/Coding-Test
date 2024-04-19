import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] dial = new String[]{"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int time = 0;

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<dial.length; j++){
                if(dial[j].indexOf(str.charAt(i)) != -1){
                    time += j+3;
                }
            }
        }
        bw.write(time + "");


        bw.flush();
        bw.close();
    }
}