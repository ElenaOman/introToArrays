
public class allChallenges
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
 				challengeFour();
			}
		
		// Challenge One
		public static void challengeOne()
			{
				String [] elementsToPrint = {"Hey", "Hi", "Yo", "What's Up"};
				System.out.println(elementsToPrint[2]);
			}
		
		// Challenge Two 
		public static void challengeTwo()
			{
				int [] integersToPrint = {1, 2, 3, 4, 5};
				System.out.println(integersToPrint.length);
			}
		
		// Challenge Three
		public static void challengeThree()
		{
			int [] integersToPrint = {6, 6, 2, 8, 2};
			for(int i = 0; i < integersToPrint.length; i++)
				{
					System.out.println(integersToPrint[i]);
				}
		}
		
		// Challenge Four 
		public static void challengeFour()
		{
			int [] integersToPrint = {6, 6, 2, 8, 2};
			double sum = 0;
			for(int i = 0; i < integersToPrint.length; i++)
				{
					sum = sum + integersToPrint[i];
				}
			System.out.println(sum/integersToPrint.length);
		}

	}
