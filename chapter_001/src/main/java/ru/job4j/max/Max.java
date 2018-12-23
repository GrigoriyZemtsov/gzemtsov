package ru.job4j.max;
/**
 * Программа возвращает максимальное значение из двух заданных чисел
 * @autor gzemtsov
 * @versoin $Id$
 * @since 0.1
 */
 public class Max {
	 public int max(int first, int second) {
		  return (first > second ? first : second);
	 }
	 public int max(int first, int second, int third) {
		 int temp = this.max(first, second);
		 return this.max(temp, third);
	 }
 }