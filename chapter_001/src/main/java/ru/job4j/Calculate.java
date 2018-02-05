package ru.job4j;

/**
 * Class Calculate вывод строки на экран
 * @author gzemtsov
 * @since 01.02.2018
 * @version 1
 */

public class Calculate {
	/**
	 * Выводит строку приветствия в командной строке
	 * @param String строка
	 * @return вывод сообщения
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	
	/**
	 * Metod Echo.
	 * @param name Your name.
	 * @return Echo plus your name.
	 */
	 public String echo(String name) {
		 return "Echo, echo, echo : " + name;
	 }
}