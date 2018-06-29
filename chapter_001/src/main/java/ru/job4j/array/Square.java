package ru.job4j.array;


public class Square {
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		//заполнить массив через цикл от 1 до bound.
		for (int index = 1; index <= rst.length; index++) {
			rst[index - 1] = index * index;
		}
		return rst;
	}
}