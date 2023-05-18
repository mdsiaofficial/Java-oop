import java.util.*;
public class TwoD_Array {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                b[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("|"+a[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("|"+b[i][j]);
            }
            System.out.println("|");
        }
    }
}