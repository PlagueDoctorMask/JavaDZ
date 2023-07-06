/*Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */

import java.util.ArrayList;
import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        System.out.println(list);
        MaxValue(list);
        MinValue(list);
        MeanValue(list);
        delNums(list);

    }

    public static void MeanValue(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum+=i;
        }
        System.out.println(sum/list.size());
    }

    public static void MaxValue(ArrayList<Integer> list) {
        int max = -1000000;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }

    public static void MinValue(ArrayList<Integer> list) {
        int min = 1000000;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(min);
    }
    

    public static void delNums (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}

