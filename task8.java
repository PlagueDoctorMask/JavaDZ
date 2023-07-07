/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        Queue<Integer> queue = new LinkedList<Integer>(Arrays.asList(array));
        first(queue);
        dequeue(queue);
        enqueue(queue);
        System.out.println(queue);

    }

    public static void dequeue(Queue<Integer> queue){
        System.out.println(queue.peek());
        queue.poll();

    }

    public static void first(Queue<Integer> queue){
        System.out.println(queue.peek());
    }
        

    public static void enqueue (Queue<Integer> queue){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элемента, который хотите поставить в конец очереди");
        int a = sc.nextInt();
        queue.add(a);
    }
}
