package ru.job4j.loop;

/**
 * Программа вычисляющая факториал числа
 * @autor gzemtsov
 * @since 20.05.2018
 * @version 0.01
 */
 
 public class Factorial {
	 public int calc(int n) {
	 	int f = 1;
	 	if (n > 1) {
	 		for (int x = 1; x <= n; x++) {
			f = f * x;
			}
	 	}
	 	return f;
	}
 }