import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];
        int total = 0;
        boolean allSixty = false;
        boolean same = false;

        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<a.length; i++){
            total += a[i];
        }

        if(total != 180){
            System.out.println("Error");
        }else{
            if(a[0] == a[1] && a[1] == a[2]){
                System.out.println("Equilateral");
            }else if(a[0] == a[1] || a[1] == a[2] || a[0] == a[2]){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }
    }
}