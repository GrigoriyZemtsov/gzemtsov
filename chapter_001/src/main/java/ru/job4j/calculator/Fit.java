package ru.job4j.calculator;

/**
 * Программа расчета идеального веса
 */

public class Fit {
    double idealMan, idealWoman;
    final double COEF_MAN = 100, COEF_WOMAN = 110, COEF = 1.15;

    /**
     * Идеальный вес мужчины
     * @param height Рост
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        idealMan = (height - COEF_MAN) * COEF;
        return idealMan;
    }

    /**
     * Идеальный вес женщины
     * @param height рост
     * @return идеальный вес
     */
    public double womanWeight(double height) {
        idealWoman = (height - COEF_WOMAN) * COEF;
        return idealWoman;
    }
}