package ru.job4j.calculator;

/**
 * Программа расчета идеального веса
 */

public class Fit {
    double idealMan, idealWoman;
    final double MAN_WEIGHT = 100, WOMAN_WEIGHT = 110, COEF = 1.15;

    /**
     * Идеальный вес мужчины
     * @param height Рост
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        idealMan = (height - MAN_WEIGHT) * COEF;
        return idealMan;
    }

    /**
     * Идеальный вес женщины
     * @param height рост
     * @return идеальный вес
     */
    public double womanWeight(double height) {
        idealWoman = (height - WOMAN_WEIGHT) * COEF;
        return idealWoman;
    }
}