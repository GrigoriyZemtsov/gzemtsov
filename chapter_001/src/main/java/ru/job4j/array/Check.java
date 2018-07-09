package ru.job4j.array;

/**
 * Программа проверяющая заполнение массива true или false.
 * @autor Gregory Zemtsov
 * @version 001 05.07.2018
 */

public class Check {
	public boolean mono(boolean[] data) {
		boolean result = true;
		for (boolean b : data) {
            if (b != data[0]) {
				result = false;
				break;
			}
        }
		return result;
	}
}