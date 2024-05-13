
public class Perfect {
    public static void main (String args[]) {
    	int n = 1;
    	while (n <= 1000) {
    		if (perfect(n) == true) {
        		System.out.println("The number " + n + " is a perfect number");
    		}
    		n++;
    	}
    	
    }
    public static boolean perfect(int n) {

    	int sum = 0;
    	
    	for (int i = 1; i < n; i++) {
    		if (n % i == 0) {
        		sum += i;
    		}
    	}
    	
    	if (sum == n) {
    		return true;
    	}
    	else {
    		return false;
    	}
    		 
    	
    }
}
