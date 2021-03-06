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
	  * @return boolean.
	  */
	  public boolean startWith(String prefix) {
		  boolean result = false;
		  char[] value = prefix.toCharArray();
		  if (value.length < data.length) {
			  result = true;
			  for (int i = 0; i < value.length; i++) {
				  if (value[i] != data[i]) {
					  result = false;
					  break;
				  }
			  }
		  }
		  return result;
	  }
 }
