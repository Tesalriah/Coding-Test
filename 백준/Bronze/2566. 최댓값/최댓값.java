import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];
        int max = 0;
        int row = 0;
        int col = 0;

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j] > max && arr[i][j] < 100 && arr[i][j] >= 0){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        if(row == 0 || col == 0){
            row = 1;
            col = 1;
        }
        System.out.print(max + "\n" + row + " " + col);
    }
}