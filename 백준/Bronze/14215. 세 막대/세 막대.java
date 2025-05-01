import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int[] side = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            side[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(side);

        if(side[0] + side[1] <= side[2] ){
            int newSide = side[0] + side[1] - 1;
            System.out.println(side[0] + side[1] + newSide);
        }else{
            System.out.println(side[0] + side[1] + side[2]);
        }
    }
}