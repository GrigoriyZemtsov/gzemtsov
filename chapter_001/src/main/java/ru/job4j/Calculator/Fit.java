package ru.job4j.calculator;

/**
 * Программа расчета идеального веса
 */

public class Fit {

    private static final double K = 1.15, A = 100, B = 110;

    /**
     * Идеальный вес мужчины
     * @param height Рост
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - A) * K;
    }

    /**
     * Идеальный вес женщины
     * @param height рост
     * @return идеальный вес
     */
    public double womanWeight(double height) {
        return (height - B) * K;
    }
}
