package interviewExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList <Integer> alist = new ArrayList<Integer>();
		alist.add(10);
		alist.add(20);
		alist.add(100);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		alist.add(90);
		alist.add(110);
	alist.ensureCapacity(10);
		System.out.println(alist.size());
	alist.addAll(8, alist);
	System.out.println(alist.get(8));
	
		System.out.println(alist);
		for (Integer valuesInList : alist) {
			System.out.print(valuesInList+" ");
		}
		
		
		int[] a = new int[] {99,58,65,20,12,10,14,88,98,92,100};
		Arrays.sort(a);
	System.out.println("Array Elements : "+Arrays.toString(a));

	}
}