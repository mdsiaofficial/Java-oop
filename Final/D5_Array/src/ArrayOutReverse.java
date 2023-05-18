import java.util.*;
public class ArrayOutReverse {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] =  in.nextInt();
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
