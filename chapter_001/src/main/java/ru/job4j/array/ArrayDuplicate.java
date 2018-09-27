package ru.job4j.array;

/**
 * Программа удаления дубликатов в строковом массиве
 * @autor Gregory Zemtsov (zemcov.rash@gmail.com).
 * @version 001 03.09.2018
 */

 import java.util.Arrays;
 
 public class ArrayDuplicate {
	 public String[] remove(String[] array) {
	     int dup = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - dup; j++) {
                if (array[i].equals(array[j])) {
                    String tmp = array[array.length - dup - 1];
                    array[array.length - dup - 1] = array[j];
                    array[j] = tmp;
                    j--;
                    dup++;
                }
            }
        }
         return Arrays.copyOf(array, array.length - dup);
     }
 }
