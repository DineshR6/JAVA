package interviewExercise;


public class BubbleSort {
	public static void main(String[] args) {
		int temp;
		int[] a = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23, -2, 1020, -50 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Printing Sorted List ...");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}	
}