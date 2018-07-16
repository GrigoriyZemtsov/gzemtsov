package ru.job4j.array;

/**
 * Программа проверяющая, что слова начинаются в определенной последовательности.
 * @autor Gregory Zemtsov
 * @version 001 10.07.2018
 */
 
 public class ArrayChar {
	 private char[] data;
	 
	 public ArrayChar(String line) {
		 this.data = line.toCharArray();
	 }
	 /**
	  * Метод проверки префикса с которого начинаются слова
	  * @param prefix - префикс.
	  * @return, если слово начинается с префикса.
	  */
	  public boolean startWith(String prefix) {
		  boolean result = true;
		  char[] value = prefix.toCharArray();
		  // осуществляем проверку, пока не достигнем конца наиболее короткой строки.
		  int minLength = Math.min(value.length, data.length);
		  // проверить массив data на одинаковость элементов с value.
		  for (int i = 0; i < minLength; i++) {				
				if (value[i] != data[i]) {
					result = false;
					break;
				}				
		  }
		  return result;
	  }
 }