/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

import java.util.Arrays;
import java.util.LinkedList;

public class task7 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(array));
        System.out.println(list);
        reversedList(list);
    }
    public static void reversedList(LinkedList<Integer> list){
        LinkedList<Integer> newlist = new LinkedList<>();
        while (list.isEmpty() != true) {
            newlist.add(list.pollLast());
        }
        System.out.println(newlist);
    }
}
