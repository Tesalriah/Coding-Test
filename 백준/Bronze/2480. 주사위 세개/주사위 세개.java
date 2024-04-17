import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int reward = 0;

        if(a==b && b==c){
            reward = 10000+a*1000;
        }else if(a==b || a==c){
            reward = 1000+a*100;
        }else if(b==c){
            reward = 1000+b*100;
        }else{
            int[] list = {a,b,c};
            int high = 0;
            for(int i = 0; i<list.length; i++){
                if(high < list[i]){
                    high = list[i];
                }
                reward = high*100;
            }
        }

        System.out.print(reward);
    }
}