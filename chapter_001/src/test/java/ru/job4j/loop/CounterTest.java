package ru.job4j.loop;
/**
 * Проверка класса Counter
 * @autor Gregory Zemtsov
 * @version $Id$
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class CounterTest {
	@Test
	public void whenSumEvenNumbersFromOneTenThenThirty() {
		// тест проверяющий правильность выполнения кода class Counter
		Counter counter = new Counter();
		int summ = counter.add(0, 10);
		assertThat(summ, is(30));
	}
}