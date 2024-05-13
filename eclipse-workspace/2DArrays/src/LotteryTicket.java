public class LotteryTicket {

	public static void main(String[] args) {

		int [] [] randomNumbers = { {1, 2, 3},
		                            {4, 5, 6},
		                            {7, 8, 9}
				
		};
		
		int [] [] randomnumbers2 = new int [3] [3];
		randomnumbers2 [0] [0] = 1;
		randomnumbers2 [0] [1] = 2;
		randomnumbers2 [0] [2] = 3;
		randomnumbers2 [1] [0] = 4;
		randomnumbers2 [1] [1] = 5;
		randomnumbers2 [1] [2] = 6;
		randomnumbers2 [2] [0] = 7;
		randomnumbers2 [2] [1] = 8;
		randomnumbers2 [2] [2] = 9;
		
		System.out.println(randomNumbers [0] [0]);
		
		System.out.println("----------------------");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(randomNumbers[i] [i]);
		}
		
		System.out.println("----------------------");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(randomNumbers[i] [j]);
			}
		}
	}
}
