package Task;

public class Star {
	void star(int n) {
		int i,j;
		for(i=0;i<=n;i++) 
		{
			for (j=0;j<=n;j++) {
				if(i==0 || j==0 || i==n || j==n) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		}
			 System.out.println();
		}	
	}

	public static void main(String[] args) {
		Star s= new Star();
		s.star(4);

	}

}
