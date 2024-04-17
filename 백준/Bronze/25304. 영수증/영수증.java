import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int type = sc.nextInt();
        int sum = 0;

        for(int i=0; i<type; i++){
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            sum += price * quantity;
        }
        if(total == sum){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}