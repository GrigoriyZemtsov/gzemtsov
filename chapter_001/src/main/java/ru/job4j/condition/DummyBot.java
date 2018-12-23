package ru.job4j.condition;
/**
 * Бот отвечающий на вопросы.
 * @autor Gregory Zemtsov
 * @version $Id$
 * @since 0.1
 */
 public class DummyBot {
	  public String answer(String question) {
		String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
		if ("Привет, бот.".equals(question)) {
			rsl = "Привет, умник.";
		} else if ("Пока.".equals(question)) {
			rsl = "До скорой встречи.";
		}
		return rsl;
	  }
 }