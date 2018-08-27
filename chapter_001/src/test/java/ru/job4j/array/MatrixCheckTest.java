package ru.job4j.array;

/**
 * Программа проверки класса MatrixCheck.
 * @autor Gregory Zemtsov
 * @version 001 15.08.2018
 */
 
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 
 public class MatrixCheckTest {
	 @Test
	 public void whenData3MonoByTrueThenTrue() {
		 MatrixCheck check = new MatrixCheck();
		 boolean[][] input = new boolean[][] {
			 {true, true, true}, 
			 {false, true, true}, 
			 {true, false, true}
		 };
		 boolean result = check.mono(input);
		 assertThat(result, is(true));
	 }
	 
	 @Test
	 public void whenDataNot3MonoTrueThenFalse() {
		 MatrixCheck check = new MatrixCheck();
		 boolean[][] input = new boolean[][] {
			 {true, true, false}, 
			 {false, false, true}, 
			 {true, false, true}
		 };
		 boolean result = check.mono(input);
		 assertThat(result, is(false));
	 }

	 @Test
	 public void whenDataNot4MonoTrueThenFalse() {
		 MatrixCheck check = new MatrixCheck();
		 boolean[][] input = new boolean[][] {
			 {true, false, false, false}, 
			 {false, false, true, false},
			 {false, false, true, false}, 
			 {false, false, false, true}
		 };
		 boolean result = check.mono(input);
		 assertThat(result, is(false));
	 }

	 @Test
	 public void whenDataNot4MonoTrueThenTrue() {
		 MatrixCheck check = new MatrixCheck();
		 boolean[][] input = new boolean[][] {
				 {true, false, true, false},
				 {false, true, false, true},
				 {true, false, true, false},
				 {false, true, false, true}
		 };
		 boolean result = check.mono(input);
		 assertThat(result, is(true));
	 }
 }