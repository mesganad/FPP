package problem3;

//Recursive program for binary Search 
class BinarySearch {

	public static int binarySearch(int arr[], int left, int right, int target) {

		if (right >= left && left < arr.length - 1) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == target)
				return mid;

			if (arr[mid] > target)
				return binarySearch(arr, left, mid - 1, target);
			return binarySearch(arr, mid + 1, right, target);
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 20, 30, 40, 100, 400 };
		int len = arr.length;
		int targetNumber = 100;
		int result = BinarySearch.binarySearch(arr, 0, len - 1, targetNumber);
		if (result == -1)
			System.out.println("Number not found!");
		else
			System.out.println("The number is found at index " + result);
	}
}
