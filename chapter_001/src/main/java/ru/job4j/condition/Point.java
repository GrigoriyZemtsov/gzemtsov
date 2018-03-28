package ru.job4j.condition;

/**
 * программа расчета растояния между точками
 * @autor gzemtsov
 * @since 28.03.2018
 * @version 0.01
 */

public class Point {
	// поля класса
	private int x;
	private int y;

	// конструктор класса
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point that) {
		/**
		 * Это текущая точка, обращение к точке a через this
		 * Point a = this;
		 * Это входящая точка, к b обращаемся через that
		 * Point b = that;
		 * this.x - значение х точки а
		 * this.y - значение y точки а
		 * that.x - значение х точки b
		 * that.y - значение y точки b
		*/
		return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
	}
		

	public static void main(String[] args) {
		// создали две точки
		Point a = new Point(2, 3);
		Point b = new Point(8, 7);
		
		// вывод в консоль и вызов метода
		System.out.println("x1 = " + a.x);
		System.out.println("y1 = " + a.y);
		System.out.println("x2 = " + b.x);
		System.out.println("y2 = " + b.y);

		double result = a.distanceTo(b);
		System.out.println("Растояние между точками А и В : " + result);
	}
}