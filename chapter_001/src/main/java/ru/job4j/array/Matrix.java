package ru.job4j.array;

/**
 * Программа заполняющая таблицу умножения на заданное число
 * @autor Gregory Zemtsov
 * @version 001 31.07.2018
 */
 
 public class Matrix {
	 public int[][] multiple(int size) {
		 int[][] table = new int[size][size];
		 for (int i = 1; i <= table.length - 1; i++) {
		 	 for (int j = 1; j <= table.length - 1; j++) {
				 table[i][j] = j * i;
			 }
		 }
		 return table;
	 }
 }