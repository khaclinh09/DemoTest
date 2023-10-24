package test;

import java.util.Arrays;

public class Homework_Unit3 {

	public static void main(String[] args) {
		// Sắp xếp một dãy số theo thứ tự tăng dần/giảm dần bằng thuạt toán nổi bọt
				// (Bobble Sort)

				int[] arr = { 99, 4, 34, 88, 3, 2 };
				System.out.println("Mảng chưa sắp xếp: " + Arrays.toString(arr));

				bubbleSort(arr);
				System.out.println("Mảng đã sắp xếp tăng dần: " + Arrays.toString(arr));
			}

			private static void bubbleSort(int[] arr) {
				int n = arr.length;
				int temp = 0;
				for (int i = 0; i < n - 1; i++) {
					for (int j = 0; j < n - i - 1; j++) {
						if (arr[j] > arr[j + 1]) {
							temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;
						}
					}
				}


	}

}
