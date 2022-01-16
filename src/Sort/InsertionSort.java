package Sort;

public class InsertionSort {
	public static void main(String[] args) {

		InsertionSort obj = new InsertionSort();

		int[] arr = { 9,12,3,21,44};
		obj.printArray(arr);
		obj.insertionSort(arr);
		obj.printArray(arr);

	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int pickedElement = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] > pickedElement) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = pickedElement;

		}
	}
}
