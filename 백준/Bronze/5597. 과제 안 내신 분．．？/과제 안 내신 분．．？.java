import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] student = new int[31];

        for(int i=0; i<28; i++){
            int success = Integer.parseInt(br.readLine());
            student[success] = 1;
        }
        br.close();

        for(int i=1; i<student.length; i++){
            if(student[i] != 1){
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}