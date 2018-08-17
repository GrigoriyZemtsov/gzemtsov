package ru.job4j.array;

/** 
  * Программа сравнения элементов массива по диагонали на предмет равенства.
  * @autor Gregory Zemtsov
  * @version 001 15.08.2018
  */
  
public class MatrixCheck {
	public boolean mono(boolean[][] data) {
		boolean result = true;
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[i][j] != data[i + 1][j + 1]) {
					result = false;
				}
			}
		}
        return result;
	}

	public boolean mono2(boolean[][] data) {
		boolean result = true;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length / 2; j++) {
				boolean temp = data[i][j];				
				data[i][j] = data[i][data.length - j - 1];
				data[i][data.length - j - 1] = temp;
			}
		}
		
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[i][j] != data[i + 1][j + 1]) {
					result = false;
				}
			}
		}
		return result;
	}
}