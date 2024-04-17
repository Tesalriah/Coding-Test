import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int set = sc.nextInt();
        sc.close();

        int total = hour*60 + minute + set;
        hour = total / 60;
        minute = total % 60;
        if(minute >= 60){
            minute -= 60;
            hour++;
        }
        if(hour >= 24){
            hour -= 24;
        }

        System.out.print(hour + " " + minute);
    }
}