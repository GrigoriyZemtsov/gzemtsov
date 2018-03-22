package ru.job4j.calculator;

/**
 * Тест Converter
 */
 
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 
 public class ConverterTest {
	 @Test
	 public void when60RubleToDollarThen1() {
		 Converter converter = new Converter();
		 int result = converter.rubleToDollar(120);
		 assertThat(result, is(2));
	 }
	 
	 @Test
	 public void when70RubleToEuroThen1() {
		 Converter converter = new Converter();
		 int result = converter.rubleToEuro(70);
		 assertThat(result, is(1));
	 }
	 
	 @Test
	 public void when3EuroToRubThen210() {
		 Converter converter = new Converter();
		 int result = converter.euroToRub(3);
		 assertThat(result, is(210));
	 }
	 
	 @Test
	 public void when5DollarToRubThen300() {
		 Converter converter = new Converter();
		 int result = converter.dollarToRub(5);
		 assertThat(result, is(300));
	 }
 }