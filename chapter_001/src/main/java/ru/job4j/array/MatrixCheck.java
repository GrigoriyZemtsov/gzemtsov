package ru.job4j.array;
/** 
  * Программа сравнения элементов массива по диагонали на предмет равенства.
  * @autor Gregory Zemtsov
  * @version 001 15.08.2018
  */
public class MatrixCheck {
	public boolean mono(boolean[][] data) {
		boolean result = true;
		for (int i = 0; i < data.length; i++) {
			if ((data[0][0] != data[i][i]) || (data[0][data.length - 1] != data[i][data.length - 1 - i])) {
				result = false;
				break;
			}
		}
		return result;
	}
}
