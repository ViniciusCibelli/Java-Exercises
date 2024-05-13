
public class Question1 {
	
	static double avarage(int a[], int n) {
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println("The sum of the elements is: " + sum);
		return (double) sum / n;
	}

	public static void main(String[] args) {
		
		int n = 10;
		int[] newArray = new int[n];
		
		newArray[0] = 2;
		newArray[1] = -9;
		newArray[2] = 0;
		newArray[3] = 5;
		newArray[4] = 12;
		newArray[5] = -25;
		newArray[6] = 22;
		newArray[7] = 9;
		newArray[8] = 8;
		newArray[9] = 12;
		
		System.out.println("The avarage of the elements are: " + avarage(newArray, n));
		
	}

}
