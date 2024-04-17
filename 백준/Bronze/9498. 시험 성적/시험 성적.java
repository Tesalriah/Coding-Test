
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(90 <= score && 100 >= score){
            System.out.print("A");
        }else if(80 <= score && 89 >= score){
            System.out.print("B");
        }else if(70 <= score && 79 >= score){
            System.out.print("C");
        }else if(60 <= score && 69 >= score){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}