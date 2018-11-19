package ru.job4j.array;

/**
 * Программа слияния двух отсортированных массивов
 * @autor Grigory Zemtsov (zemcov.rash@gmail.com)/
 * @version 001 12.11.2018
 */

import java.util.Arrays;

public class MergeTwoArray {
    public static int[] merge(int[] first, int[] second) {

        int[] answer = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            answer[k++] = first[i] < second[j] ? first[i++] : second[j++];
        }

        while (i < first.length) {
            answer[k++] = first[i++];
        }

        while (j < second.length) {
            answer[k++] = second[j++];
        }

        return answer;
    }
}
