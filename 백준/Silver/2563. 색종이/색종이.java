import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int quantity = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];

        for(int i=0; i<quantity; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            for(int j=row; j<row+10; j++){
                for(int k=col; k<col+10; k++){
                    paper[j][k] = true;
                }
            }
        }
        br.close();

        int cnt = 0;

        for(int i=0; i<paper.length; i++){
            for(int j=0; j<paper[i].length; j++){
                if(paper[i][j] == true){
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}