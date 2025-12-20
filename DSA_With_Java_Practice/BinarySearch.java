	class BinSearch{
	int binS(int [] arry , int target){
		int start = 0 ;
		int end = arry.length - 1;

		while(start <= end){
			int mid = start + (end - start) / 2;

			if(target < arry[mid]){
				end = mid - 1 ;
			}else if(target > arry[mid]){
				start = mid + 1 ;
			}
			else{	
				return mid ;
			}
		}
		return -1 ;
	}
}


public class BinarySearch{
	public static void main(String[] args) {
		
		int array [] = {-25, -22 , 25 , 95 , 105 , 108 , 112 , 58888, 543543131};
		int target = 58888;

		BinSearch obj = new BinSearch();
		int ans = obj.binS(array , target);

		System.out.println(ans);

	}
}