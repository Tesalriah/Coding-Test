import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] arr = br.readLine().split(" ");
            int[] side = new int[arr.length];
            for(int i=0; i<arr.length; i++){
                side[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(side);

            if(side[0] == 0 && side[1] == 0 && side[2] == 0){
                break;
            }

            if(side[0] + side[1] <= side[2] ){
                System.out.println("Invalid");
            }else{
                if(side[0] == side[1] && side[1] == side[2]){
                    System.out.println("Equilateral");
                }else if(side[0] == side[1] || side[1] == side[2]){
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene");
                }
            }
        }
    }
}