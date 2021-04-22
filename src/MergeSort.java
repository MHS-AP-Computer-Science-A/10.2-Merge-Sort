public class MergeSort {
	public static void main(String[] args) {
		// new BrickBreaker();

		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 12, 13 };

		mergeSort(arr);

		for (int x : arr) {
			System.out.println(x);
		}

	}

	public static void mergeSort(int[] arr) {

		// Base case length 1
		if (arr.length == 1) {
			return;
		}

		// Split in halves
		int mid = arr.length / 2; // Find middle

		// Create two new arrays
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		// Fill left half
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		// Fill right half
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[i + mid];
		}

		// Recursive calls
		mergeSort(left);
		mergeSort(right);

		// Merge the halves
		merge(arr, left, right);
	}

	public static void merge(int[] arr, int[] left, int[] right) {

		//Look at first element and take smaller
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		//Copy remaining when 1 array is empty
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}

	}
}