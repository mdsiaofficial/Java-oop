import java.util.*;
public class q6 {
    public static void main(String[] args) {
        int r,c;
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        c = in.nextInt();
        int tomar[][] = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                tomar[i][j] = in.nextInt();
            }
        }
        System.out.println("");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(tomar[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
