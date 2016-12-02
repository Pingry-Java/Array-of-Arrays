public class arrArr
{
	public static void main(String[] args)
	{
		print2D(twoDArrayPractice(10, 10));
	}

	public static void print2D(String[][] a)
	{
		for(int i = 0; i < a[0].length; i++)
			System.out.print("-----");
		System.out.println();
		System.out.print("|");
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + " |");
			}
			
			System.out.println();
			for(int i = 0; i < a[0].length; i++)
				System.out.print("-----");
			System.out.println();
			System.out.print("|");

		}
	}

	// Any rows or columns!!!  So much more room for activities.
	public static String[][] twoDArrayPractice(int inputCol, int inputRows)
	{
		int count = 1;

		String[][] a = new String[inputRows][inputCol];

		int maxLength = String.valueOf(inputCol * inputRows).length();

		for(int rows = 0; rows < inputRows; rows++)
		{
			for(int col = 0; col < inputCol; col++)
			{
				String strCount = Integer.toString(count);
				if (count < 10)
					for(int i = 1; i < maxLength; i++)
						strCount = strCount + " ";
				if (count < 100 && count >= 10)
					for (int i = 2; i < maxLength; i++)
						strCount = strCount + " ";
				if (count < 1000 && count >= 100)
					for (int i = 3; i < maxLength; i++)
						strCount = strCount + " ";
				a[rows][col] = strCount;
				count++;
			}

		}

		return a;
	}


	// Hard coded with 4 rows/columns
	public static int[][] twoDArrayPractice()
	{
		int count = 1;

		int[][] a = new int[4][4];


		for(int rows = 0; rows < 4; rows++)
		{
			for(int col = 0; col < 4; col++)
			{
				a[rows][col] = count;
				count++;
			}

		}

		return a;
	}
}
