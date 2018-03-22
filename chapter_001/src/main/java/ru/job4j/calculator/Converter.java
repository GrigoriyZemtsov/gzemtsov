package ru.job4j.calculator;

/**
 * Конвертер валюты
 */
 
 public class Converter {
	 /**
	  * Конвертируем рубли в евро.
	  * @param value рубли.
	  * @return евро.
	  */
	  public int rubleToEuro(int value) {
		  int euro = value / 70;
		  return euro;
	  }
	  
	  /**
	   * конвертируем рубли в доллары.
	   * @param value рубли.
	   * @return доллары.
	   */
	   public int rubleToDollar(int value) {
		   int dol = value / 60;
		   return dol;
	   }
	   
	   /**
	  * Конвертируем евро в рубли.
	  * @param value евро.
	  * @return рубли.
	  */
	  public int euroToRub(int value) {
		  int rub = value * 70;
		  return rub;
	  }
	  
	  /**
	  * Конвертируем рубли в доллары.
	  * @param value рубли.
	  * @return доллары.
	  */
	  public int dollarToRub(int value) {
		  int rub = value * 60;
		  return rub;
	  }
 }