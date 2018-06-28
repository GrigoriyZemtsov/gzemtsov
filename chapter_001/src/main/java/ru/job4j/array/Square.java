package ru.job4j.array;


public class Square {
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		int i = 1;
		//заполнить массив через цикл от 1 до bound.
		for (int index = 0; index != rst.length; index++) {
			rst[index] = i * i;
			i++;
		}
		return rst;
	}
}