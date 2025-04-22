import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer X = Integer.parseInt(br.readLine());
        br.close();

        int T = 1, count=0, index = 0;

        while (X - count > 0){
            for(int i=1; i<=T; i++){
                count ++;
                if(X - count == 0){
                    index = i;
                }
            }
            T++;
        }
        if(T % 2 != 0){
            System.out.print( index + "/" + (T - index));
        }else {
            System.out.print( (T - index) + "/" + index);
        }
    }
}