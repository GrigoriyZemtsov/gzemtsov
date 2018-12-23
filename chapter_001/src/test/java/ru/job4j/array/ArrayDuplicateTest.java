package ru.job4j.array;
/**
 * Тест проверки работы класса ArrayDuplicate
 * @autor Gregory Zemtsov (zemcov.rash@gmail.com)
 * @version 001 03.09.18
 */
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 public class ArrayDuplicateTest {
	 @Test
	 public void whenRemoveDuplicatesThenArrayWithoutDuplicate1() {
		 String[] bound = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		 ArrayDuplicate duplicate = new ArrayDuplicate();
		 String[] resultArray;
		 resultArray = duplicate.remove(bound);
		 String[] expect = {"Привет", "Мир", "Супер"};
		 assertThat(resultArray, is(expect));
	 }
	 @Test
	 public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
		 String[] bound = {"Привет", "Мир", "Привет", "Супер", "Мир", "Ура", "Пока", "Ура"};
		 ArrayDuplicate duplicate = new ArrayDuplicate();
		 String[] resultArray;
		 resultArray = duplicate.remove(bound);
		 String[] expect = {"Привет", "Мир", "Ура", "Супер", "Пока"};
		 assertThat(resultArray, is(expect));
	 }
	 @Test
	 public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
		 String[] bound = {"Привет", "Привет", "Привет", "Привет"};
		 ArrayDuplicate duplicate = new ArrayDuplicate();
		 String[] resultArray;
		 resultArray = duplicate.remove(bound);
		 String[] expect = {"Привет"};
		 assertThat(resultArray, is(expect));
	 }
 }