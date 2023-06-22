public class Main {

	public static void main(String[] args) {
		int[] arr = {-2000, -500, 0, 449, 999, 1789, 2100, 3250};
		System.out.println(findCeiling(arr, 389));
		System.out.println(findCeiling(arr, -752));
		System.out.println(findCeiling(arr, 3276));
	}

	public static int findCeiling(int[] arr, int target) { //return smallest num >= target in arr
		if(target>arr[arr.length-1]) {
			return -1; //no num > target
		}
		int start = 0, end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]>target) {
				end=mid-1;
			} else {
				start=mid+1;
			}
		}
		return arr[start];
	}
}
