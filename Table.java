package Task;

public class Table {
	void table(int a) {
		int j;
		//for(i=1;i<=1;i++) {
			for (j=1;j<=15;j++) {
				System.out.println(a +" * "+j + " = "+a*j);
			}
			System.out.println();
		}
	//}
	public static void main(String[] args) {
		Table t= new Table();
		t.table(4);

	}

}
