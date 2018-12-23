package ru.job4j.array;
/**
 * Программа переворачивает массив задом наперед.
 * @autor Grigory Zemtsov
 * @version 001
 */
 public class Turn {
	 public int[] turn(int[] array) {
		 for (int i = 0; i < array.length / 2; i++) {
			 int tmp = array[i];
			 array[i] = array[array.length - i - 1];
			 array[array.length - i - 1] = tmp;
		 }
		 return array;
	 }
 }