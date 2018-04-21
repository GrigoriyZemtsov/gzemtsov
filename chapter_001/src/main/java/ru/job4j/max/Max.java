package ru.job4j.max;

/**
 * Программа возвращает максимальное значение из двух заданных чисел
 * @autor gzemtsov
 * @versoin $Id$
 * @since 0.1
 */
 public class Max {
	 public int max(int first, int second) {
		 /**
		  * Метод возвращает максимальное значений из двух заданных чисел
		  */
		  return (first > second ? first : second);
	 }
	 public int max(int first, int second, int third) {
		 int temp = this.max(first, second);
		 temp = this.max(temp, third);
		 return temp;
	 }
 }