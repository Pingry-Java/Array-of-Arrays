public class arrArr
{
	public static void main(String[] args)
	{
		print2D(twoDArrayPractice(10, 20));
	}

	public static void print2D(int[][] a)
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}

	// Any rows or columns!!!  So much more room for activities.
	public static int[][] twoDArrayPractice(int inputCol, int inputRows)
	{
		int count = 1;

		int[][] a = new int[inputRows][inputCol];


		for(int rows = 0; rows < inputRows; rows++)
		{
			for(int col = 0; col < inputCol; col++)
			{
				a[rows][col] = count;
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
