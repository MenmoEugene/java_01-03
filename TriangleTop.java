/*
-----*
----* *
---* * *
--* * * *
��* * * * *

*/

class TriangleTop 
{
	public static void main(String[] args) 
	{
		for (int x=5; x>0; x--)
		{
			for (int y=0; y<x-1; y++)
			{
				System.out.print(" ");
			}
			for (int z=0; z<=5-x; z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
