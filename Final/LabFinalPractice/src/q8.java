import java.util.*;
public class q8 {
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
        System.out.println("");
        int cols [] = new int [4];
        for(int i=0; i<r; i++){
            int colsum=0;
            for(int j=0; j<c; j++){
                colsum = colsum + tomar[j][i];
            }
            cols[i]=colsum;
        }
        System.out.println("");
        int rows [] = new int [4];
        for(int i=0; i<r; i++){
            int rowsum=0;
            for(int j=0; j<c; j++){
                rowsum = rowsum + tomar[i][j];
            }
            rows[i]=rowsum;
        }
        System.out.println("");
        for(int i =0; i<r; i++){
            System.out.println("Row "+(i+1)+" = " + rows[i]);
        }
        System.out.println("");
        for(int i =0; i<c; i++){
            System.out.println("Column "+(i+1)+" = " + cols[i]);
        }
    }
}
