import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] score = new double[20];
        String[] rating = new String[20];

        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            score[i] = Double.parseDouble(st.nextToken());
            rating[i] = st.nextToken();
        }

        int tscore = 0;
        double total = 0;

        for(int i=0; i<20; i++){
            if(!rating[i].equals("P")){
                if(rating[i].equals("A+")){
                    total += score[i]*4.5;
                }if(rating[i].equals("A0")){
                    total += score[i]*4.0;
                }if(rating[i].equals("B+")){
                    total += score[i]*3.5;
                }if(rating[i].equals("B0")){
                    total += score[i]*3.0;
                }if(rating[i].equals("C+")){
                    total += score[i]*2.5;
                }if(rating[i].equals("C0")){
                    total += score[i]*2.0;
                }if(rating[i].equals("D+")){
                    total += score[i]*1.5;
                }if(rating[i].equals("D0")){
                    total += score[i]*1.0;
                }if(rating[i].equals("F")){
                    total += score[i]*0.0;
                }
                tscore += score[i];
            }
        }

        System.out.println(total/tscore);
    }
}
