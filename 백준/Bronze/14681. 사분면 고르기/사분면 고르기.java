import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if( x > 0 && y > 0){
            System.out.print(1);
        }if( x > 0 && y < 0) {
            System.out.print(4);
        }if( x < 0 && y > 0){
            System.out.print(2);
        }if( x < 0 && y < 0){
            System.out.print(3);
        }
    }
}