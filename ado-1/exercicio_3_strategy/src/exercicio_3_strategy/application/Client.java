package exercicio_3_strategy.application;

import java.util.Arrays;

import exercicio_3_strategy.model.sort.BubbleSort;
import exercicio_3_strategy.model.sort.SortArray;

public class Client {

	public static void main(String[] args) {
		int[] array = {5, 3, 7, 8, 1, 2, 4, 6};
		
		SortArray sortArray = new SortArray();
		
		sortArray.sortArray(array, new BubbleSort());
		
		System.out.println(Arrays.toString(array));
	}
}
