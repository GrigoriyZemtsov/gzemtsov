package ru.job4j.loop;
/**
 * Тест проверки класса Factorial
 * @autor gzemtsov
 * @since 26.01.18
 * @version 001
 */
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 public class FactorialTest {
	 @Test
	 public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		 Factorial factorial = new Factorial();
		 int result = factorial.calc(5);
		 assertThat(result, is(120));
	 }
	 @Test
	 public void whenCalculateFactorialForZeroThenOne() {
		 Factorial factorial = new Factorial();
		 int result = factorial.calc(0);
		 assertThat(result, is(1));
	 }
 }