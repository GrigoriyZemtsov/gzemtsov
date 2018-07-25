package ru.job4j.array;

/**
 * Программа сортировки массива методом "пузырька"
 * @autor Gregory Zemtsov
 * @version 001 16.07.2018
 */
 
 public class BubbleSort {	 
	 public int[] sort(int[] array) {
		 for (int i = 0; i <= array.length - 1; i++) {
			 for (int j = 0; j < array.length - 1; j++) {
				 if (array[j] > array[j + 1]) {
					 int tmp = array[j];
					 array[j] = array[j + 1];
					 array[j + 1] = tmp;
				 }
			 }
		 }
		 return array;
	 }
 }