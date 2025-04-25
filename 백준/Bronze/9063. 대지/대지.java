import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int xMin=Integer.MAX_VALUE, xMax=Integer.MIN_VALUE, yMin=Integer.MAX_VALUE, yMax=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            xMin = Math.min(xMin, x);
            xMax = Math.max(xMax, x);

            yMin = Math.min(yMin, y);
            yMax = Math.max(yMax, y);
        }

        System.out.print((xMax - xMin) * (yMax - yMin));
    }
}