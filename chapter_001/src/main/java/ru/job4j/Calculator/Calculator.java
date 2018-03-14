package ru.job4j.calculator;

/*
 * Class Calculator простые арифметические операции
 * @autor gzemtsov
 * @since 08.03.2018
 * @version 0.1
 */


public class Calculator {
	private double result;
	
// Операция сложения
	public void add(double first, double second) {
		this.result = first + second;
	}

// Операция вычитания
	public void subtract(double first, double second) {
		this.result = first - second;
	}

// Операция деления
	public void div(double first, double second) {
		this.result = first / second;
	}

// Операция умножения
	public void multiple(double first, double second) {
		this.result = first * second;
	}

// Вывод результата
	public double getResult() {
		return this.result;
	}
}