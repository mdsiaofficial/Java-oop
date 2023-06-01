import java.util.*;
class Prime {
	public static boolean isPrime(int n) {	  
	  if (n < 2) {
	    return false;
	  }
	  for (int i = 2; i * i <= n; i++) {
	    if (n % i == 0) {
	      return false;
	    }
	  }
	  return true;
	}
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println(isPrime(n));
	}

}