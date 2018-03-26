package ru.job4j.calculator;

/**
 * Программа расчета идеального веса
 */

public class Fit {
    /**
     * Идеальный вес мужчины
     * @param height Рост
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        double idealMan = (height - 100) * 1.15;
        return idealMan;
    }

    /**
     * Идеальный вес женщины
     * @param height рост
     * @return идеальный вес
     */
    public double womanWeight(double height) {
        double idealWoman = (height - 110) * 1.15;
        return idealWoman;
    }
}
