package ru.job4j.loop;
/**
 * Программа вычисляющая сумму четных чисел в заданном диапазоне.
 * @autor gzemtsov
 * @since 10.05.2018
 * @version 0.01
 */
 public class Counter {
	 public int add(int start, int finish) {
	 	 int sum = 0;
		 for (int i = start; i <= finish; i = i + 2) {
		 	sum = sum + i;
		 }
		 return sum;
	 }
 }