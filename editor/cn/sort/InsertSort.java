package sort;

/**
 * 插入排序
 *
 * @author nocol 上午11:20:21
 */
public class InsertSort {
	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; (j > 0) && (arr[j] < arr[j - 1]); j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}
}
