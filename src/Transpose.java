/**
 * Created by HACK on 9/26/2017.
 */
import java.util.*;
public class Transpose {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        try{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print("next : ");
                    a[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.printf("%d ",a[j][i]);
                }
                System.out.print("\n");
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
