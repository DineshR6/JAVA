package interviewExercise;



import java.util.Arrays;

public class ArraysPrint {

	public static String[] combineTwoArrays(String[] arr1, String[] arr2) {
		String[] arr3 = new String[arr1.length + arr2.length];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr3[count] = arr1[i];
			count++;
		}
		for (int j = 0; j < arr2.length; j++) {
			arr3[count] = arr2[j];
			count++;
		}
		return arr3;
	}

	public static String[] alterprint(String[] arr1, String[] arr2) {
		int i = 0, j = 0, k = 0;
		String[] arr3 = new String[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			arr3[k++] = arr1[i++];
			arr3[k++] = arr1[i++];
			arr3[k++] = arr2[j++];
		}
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		return arr3;
	}

	public static void main(String[] args) {
		String[] arr1 = { "a1", "a2", "a3", "a4", "a5", "a6" };
		String[] arr2 = { "b1", "b2", "b3", "b4", "b5", "b6" };
		String[] arr3 = combineTwoArrays(arr1, arr2);
		String[] arr4 = alterprint(arr1, arr2);
		System.out.println("Cobined Array : " + Arrays.toString(arr3));
		System.out.println("AltrprntArray : " + Arrays.toString(arr4));
	}
}