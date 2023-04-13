import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		int matrix1[][] = {
				{1,1,1,0,0,1,1,1,0},
				{0,1,1,0,0,1,0,1,0},
				{1,1,1,1,1,1,1,1,1},
				{1,1,1,0,0,0,1,1,0},
				{1,1,1,1,1,1,1,1,1}
		};
		
		ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<Integer> col = new ArrayList<Integer>();
		
		boolean flagRow = false;
		boolean flagCol = false;
		
		//For Row
		for (int i = 0; i < matrix1.length; i++) {
			
			for (int r = 1; r < matrix1[i].length; r++) {
				if(matrix1[i][r] != 1 )
				{
					flagRow = false;
					break;
				}
				else
				{
					flagRow = true;
				}
			}
			
			if (flagRow) {
				row.add(i);
			}
		}
		
		System.out.println(row);
		
		//For Column
		for (int i = 0; i < matrix1[0].length; i++) {
			
			for (int c = 1; c < matrix1.length; c++) {
				if(matrix1[c][i] != 1)
				{
					flagCol= false;
					break;
				}
				else
				{
					flagCol = true;
				}
			}
			
			if (flagCol) {
				col.add(i);
			}
			
		}
		
		System.out.println(col);
	}

}
