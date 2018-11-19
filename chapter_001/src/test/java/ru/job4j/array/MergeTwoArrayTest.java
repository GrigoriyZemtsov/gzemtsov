package ru.job4j.array;

/**
 * Тест класса MergeTwoArray
 * @autor Grigory Zemtsov (zemcov.rash@gmail.com)
 * @version 001 12.11.2018
 */
 
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 
 public class MergeTwoArrayTest {
	 @Test
	 public void whenTwoArraySortFive() {
		 MergeTwoArray merge = new MergeTwoArray();
		 int[] first = new int[] {1, 3, 5, 7, 9};
		 int[] second = new int[] {0, 2, 4, 6, 8};
		 int[] result = merge.merge(first, second);
		 int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		 assertThat(result, is(expect));
	 }
 }