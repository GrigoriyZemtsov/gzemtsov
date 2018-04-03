package ru.job4j.calculator;

/**
 * Программа расчета идеального веса
 */

public class Fit {

    private static final double constK = 1.15, constA = 100, constB = 110;

    /**
     * Идеальный вес мужчины
     * @param height Рост
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - constA) * constK;
    }

    /**
     * Идеальный вес женщины
     * @param height рост
     * @return идеальный вес
     */
    public double womanWeight(double height) {
        return (height - constB) * constK;
    }
}
