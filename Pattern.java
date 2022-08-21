package Task;

public class Pattern {
	void pattern1(int rows) {
		for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
	}
	void pattern2(int rows) {
		int value=1;
		for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(value+" ");
                value++;
            }
             
            System.out.println();
        }    
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p= new Pattern();
		p.pattern1(3);
		p.pattern2(3);
	}

}
