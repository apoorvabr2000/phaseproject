package Sort;

public class SelectionSort {
public static void main(String[] args) {
		
		SelectionSort obj = new SelectionSort();

		int[] arr = { 9,6,3,1,2,4,5 };
		obj.printArray(arr);
		obj.selectionSort(arr);
		obj.printArray(arr);

	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int min_idx = i;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
				
			}
			
			// swap element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		
		
	}
}
