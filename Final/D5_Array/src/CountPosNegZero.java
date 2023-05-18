public class CountPosNegZero {
    public static void main(String[] args) {
        int a[] = {2,-5,6,0,-5,7,-8,6,2,0,5,-6,7,0,-8,0,-5,0,6,-5,8,0,5,8,-6,5,-6,0,-5,0,5,-6,0,8,-6,0,6,-6,8,0,9};
        int pos = 0;
        int neg = 0;
        int zero = 0;
        
        for(int i =0; i<a.length; i++){
            if(a[i]>0) pos++;
            else if(a[i]<0) neg++;
            else zero++;
        }
        System.out.println("Positive: "+ pos);
        System.out.println("Negative: "+ neg);
        System.out.println("Zero: "+ zero);
    }
}
