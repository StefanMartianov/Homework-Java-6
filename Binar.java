package org.example.HomeworkJava6;

public class Binar {
    public static void main(String[] args) {
        int[] massive = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19,21};
        int target = 21;
        int index = binarySearch(massive, target);
        if (index == -1) {
            System.out.println("такого числа нет");
        } else {
            System.out.println("число найдено:index =  " + index);
        }
    }

    public static int binarySearch(int[] mass, int n) {
        int start = 0;
        int end = mass.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (mass[middle] == n) {
                return middle;
            } else if (mass[middle] < n) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
