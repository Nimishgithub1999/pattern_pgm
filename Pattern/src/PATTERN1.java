
public class PATTERN1 {

	public static void main(String[] args) {
		int n = 7, i, j;
		for(i = 0; i < n; i++)
		{System.out.print("  ");
			for(j = 0; j < n; j++)
			{
				if(i == 0|| i == n-1 || j == n/2)//I
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(j = 0; j < n; j++)
			{
				if(j == 0 || j == n-1 || i == j)//N
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(j = 0; j < n; j++)
			{
				if(i == 0 || i == n-1 && j > 0 || j == 0 && i > 0 || i == n/2)//E
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(j = 0; j < n; j++)
			{
				if(j == 0 && i < n-1 || j == n-1 && i < n-1 || i == n-1 && j > 0 && j < n-1)//U
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(j = 0; j < n; j++)
			{
				if(j == 0 || i == 0 && j < n-1 || i == n/2 && j < n-1 || j == n-1 && i > 0 && i < n/2 || i == j && i > n/2)//R
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(j = 0; j < n; j++)
			{
				if(i == 0 && j > 0 && j < n-1|| i == n-1 && j < n-1 && j > 0 || j == 0 && i > 0 && i < n-1 || j == n-1 && i < n-1 && i > 0)//O
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(j = 0; j < n; j++)
			{
				if(j == 0 || j == n-1 || i == j)//N
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			System.out.println();
	}

}
}
