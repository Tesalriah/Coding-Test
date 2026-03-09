import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            String[] people = str.split(" ");
            arr[i][0] = Integer.parseInt(people[0]);
            arr[i][1] = Integer.parseInt(people[1]);
            arr[i][2] = 1;
        }

        int nth = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    arr[i][2]++;
                }
            }
        }

//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i][2] + " ");
        }


    }
}