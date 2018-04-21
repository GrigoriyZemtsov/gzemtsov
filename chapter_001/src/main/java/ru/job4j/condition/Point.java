package ru.job4j.condition;

/**
 * программа расчета растояния между точками
 * @autor gzemtsov
 * @since 28.03.2018
 * @version 0.01
 */
public class Point {
	// поля класса
	private double x;
	private double y;
	// конструктор класса
	public Point(double x, double y) {
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
}