package ru.job4j.array;

/**
 * Программа заполняющая таблицу умножения на заданный размер.
 * @autor Gregory Zemtsov
 * @version 001 30.07.2018
 */
 
 public class Matrix {
	 public int[][] multiple(int size) {
		 int[][] table = new int[size][size];
		 for (int i = 0; i < table.length; i++) {
		 	for (int j = 0; j < table.length; j++) {
				table [i][j] = (i + 1) * (j + 1);
		    }
		 }
		 return table;
	 }
 }