package ru.job4j.array;
/**
 * Программа заполниния треугольного массива через цикл от 1 до bound.
 * @autor Grigory Zemtsov
 * @version 001
 */
public class Square {
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		for (int i = 1; i <= rst.length; i++) {
			rst[i - 1] = i * i;
		}
		return rst;
	}
}