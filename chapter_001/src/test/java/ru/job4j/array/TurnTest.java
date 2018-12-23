package ru.job4j.array;
/**
 * Тест проверки класса Turn.
 * @autor Gregory Zemtsov
 * @version 001 03.07.2018
 */
 import org.junit.Test;
 import static org.hamcrest.Matchers.is;
 import static org.junit.Assert.assertThat;
 public class TurnTest {
	 @Test
	 public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		 Turn turned = new Turn();
		 int[] input = new int[] {1, 2, 4, 6};
		 int[] result = turned.turn(input);
		 int[] expect = new int[] {6, 4, 2, 1};
		 assertThat(result, is(expect));
	 }
	 @Test
	 public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		 Turn turned = new Turn();
		 int[] input = new int[] {1, 2, 3, 4, 5};
		 int[] result = turned.turn(input);
		 int[] expect = new int[] {5, 4, 3, 2, 1};
		 assertThat(result, is(expect));
	 }
 }