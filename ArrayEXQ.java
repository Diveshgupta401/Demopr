package prati;

public class ArrayEXQ {
	
		static int numGen(int n)
		{
			for (int j=1; j<n +1; j++)
			{
				if (j % 5 == 0 || j % 7 == 0)
					System.out.print(j + "");
			}
			return n;
				
		}
		public static void main (String args [])
		{
			int N=50 ;
			NumGen(N);
		}
}
