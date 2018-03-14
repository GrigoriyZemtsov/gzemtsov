package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
	@Test
	// тест операции сложения
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResultAdd();
		double expected = 2D;
		assertThat(result, is(expected));
	}

	@Test
	// тест операции вычитание
	public void whenSubtractTwoMinusOneThenOne() {
		Calculator calc = new Calculator();
		calc.subtract(2D, 1D);
		double result = calc.getResultSub();
		double expected = 1D;
		assertThat(result, is(expected));
	}

	@Test
	// тест операции деления
	public void whenDivFourDivTwoThenTwo() {
		Calculator calc = new Calculator();
		calc.div(4D, 2D);
		double result = calc.getResultDiv();
		double expected = 2D;
		assertThat(result, is(expected));
	}

	@Test
	// тест операции умножения
	public void whenMultiplyThreeMultiplyTwoThenSix() {
		Calculator calc = new Calculator();
		calc.multiply(3D, 2D);
		double result = calc.getResultMult();
		double expected = 6D;
		assertThat(result, is(expected));
	}
}