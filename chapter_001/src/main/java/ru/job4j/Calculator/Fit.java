package ru.job4j.calculator;

/**
 * Программа расчета идеального веса
 */

public class Fit {

    private static final double constantK = 1.15, constantA = 100, constantB = 110;

    /**
     * Идеальный вес мужчины
     * @param height Рост
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - constantA) * constantK;
    }

    /**
     * Идеальный вес женщины
     * @param height рост
     * @return идеальный вес
     */
    public double womanWeight(double height) {
        return (height - constantB) * constantK;
    }
}
