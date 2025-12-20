import java.util.Arrays;
public class RowColMatrix{
	public static void main(String[] args) {
		int [][] arr = {
					{1,2,4,5},
					{15,20,25,30},
					{35,22,45,50},
					{55,60,65,70}
		};
		int target = 65;
		System.out.println(Arrays.toString(search(arr, target)));

	}

	public static int[] search(int [][] matrix , int target){

		int r = 0 ;
		int c = matrix.length - 1 ;

		while(r < matrix.length && c >= 0){
			if(matrix[r][c] == target){
				return new int[]{r, c};
			}
			if(matrix[r][c] < target){
				r++ ;
			}else{
				c--;
			}
		}
		return new int[]{-1 , -1};
	}
}