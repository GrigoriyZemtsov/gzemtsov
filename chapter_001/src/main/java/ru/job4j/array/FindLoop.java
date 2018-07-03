package ru.job4j.array;

/**
 * Программа поиска элемента в массиве, методом перебора.
 * @autor Grigory Zemtsov
 * @version 001
 */
 
 public class FindLoop {
	 public int indexOf(int[] data, int el) {
		 int rst = -1; // если элемента нет в массиве, то возвращается значение -1.
		 for (int index = 0; index < data.length; index++) {
			 if (data[index] == el) {
				 rst = index;
				 break;
			 }
		 }
		 return rst;
	 }
 }