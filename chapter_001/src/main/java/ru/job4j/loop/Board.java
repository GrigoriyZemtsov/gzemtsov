package ru.job4j.loop;

/**
 * Программа построения шахматной доски в псевдографике
 * @autor Grigory Zemtsov
 * @since 30.05.2018
 * @version 001
 */
 
 public class Board {
	 public String paint(int width, int height) {
		 StringBuilder screen = new StringBuilder();
		 String ln = System.lineSeparator();
		 for (int i = 0; i < height; i++) {
			 for (int j = 0; j < width; j++) {
				 /**
				  * условие проверки правильности заполнения символов
				  */
				  if ((i + j) % 2 == 0) {
					  screen.append("x");
				  } else {
					  screen.append(" ");
				  }
			 }
			 // добавлякм перевод на новую строку
			 screen.append(ln);
		 }
		 return screen.toString();
	 }
 }