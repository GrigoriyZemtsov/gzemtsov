package ru.job4j.calculator;

/*
 * Class Calculatorest тест программы вычисления простых арифметических операций
 * @autor gzemtsov
 * @since 08.03.2018
 * @version 0.1
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {


	// Тест проверки операции сложения
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}

	// Тест проверки операции вычитания
	@Test
	public void whenSubtractTwoMinusOneThenOne() {
		Calculator calc = new Calculator();
		calc.subtract(2D, 1D);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}

	// Тест проверки операции деления
	@Test
	public void whenDivSixDivideThreeThenTwo() {
		Calculator calc = new Calculator();
		calc.div(6D, 3D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}

	// Тест проверки операции умножения
	@Test
	public void whenMultipleTwoMultipleTwoThenFour() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 2D);
		double result = calc.getResult();
		double expected = 4D;
		assertThat(result, is(expected));
	}
}