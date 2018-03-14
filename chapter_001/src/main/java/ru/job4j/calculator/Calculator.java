package ru.job4j.calculator;

/**
  * Class Calculator простые арифметические операции
  * @author gzemtsov
  * @since 26/02/2018
  * @version 0.1
  */
  
  
  public class Calculator {
	  
	private double result;
	
	// Операция сложения двух чисел
	public void add(double first, double second) {
		this.result = first + second;
	}
	
	public double getResultAdd() {
		return this.result;
	}
	
	// Операция вычитания двух чисел
	public void subtract(double first, double second) {
		this.result = first - second;
	}
	
	public double getResultSub() {
		return this.result;
	}
	
	// Операция деления двух чисел
	public void div(double first, double second) {
		this.result = first / second;
	}
	
	public double getResultDiv() {
		return this.result;
	}
	
	// Операция умножения двух чисел
	public void multiply(double first, double second) {
		this.result = first * second;
	}
	
	public double getResultMult() {
		return this.result;
	}
  }