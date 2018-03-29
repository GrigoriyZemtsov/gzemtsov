package ru.job4j.calculator;

/**
 * Программа расчета идеального веса
 */

public class Fit {

    double idealMan, idealWoman;
    final double k = 1.15, a = 100, b = 110;

    /**
     * Идеальный вес мужчины
     * @param height Рост
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        idealMan = (height - a) * k;
        return idealMan;
    }

    /**
     * Идеальный вес женщины
     * @param height рост
     * @return идеальный вес
     */
    public double womanWeight(double height) {
        idealWoman = (height - b) * k;
        return idealWoman;
    }
}
