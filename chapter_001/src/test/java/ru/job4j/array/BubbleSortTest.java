package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класса BubbleSort.
 * @autor Gregory Zemtsov
 * @version 001 25.07.2018
 */
 
 public class BubbleSortTest {
	 @Test
	 public void whenArraySort() {
		 BubbleSort bubble = new BubbleSort();
		 int[] input = new int[] {10, 7, 3, 5, 1};
		 int[] result = bubble.sort(input);
		 int[] expect = new int[] {1, 3, 5, 7, 10};
		 assertThat(result, is(expect));
	 }

	@Test
	public void whenArraySortTwo() {
		BubbleSort bubble = new BubbleSort();
		int[] input = new int[] {10, 7, 3, 5, 1, 80, 70, 8, 4};
		int[] result = bubble.sort(input);
		int[] expect = new int[] {1, 3, 4, 5, 7, 8, 10, 70, 80};
		assertThat(result, is(expect));
	}
 }