import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=num; i>0; i-=4){
            if(i==4){
                System.out.print("long int");
            }else{
                System.out.print("long ");
            }
        }
    }
}
