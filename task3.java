//Реализовать простой калькулятор

//Работает только с целыми числами
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Выберите действие:\n 1)Сложить 2 числа\n 2)Вычесть 2 число из 1\n 3)Перемножить 2 числа\n 4)Разделить 1 число на 2");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Введите первое число");
        int x = sc.nextInt();
        System.out.println("Введите второе число");
        int y = sc.nextInt();
        if (choice == 1) {
            System.out.println(x + y);
        }
        if (choice == 2) {
            System.out.println(x + y);
        }
        if (choice == 3) {
            System.out.println(x * y);
        }
        if (choice == 4) {
            System.out.println(x / y);
        }
    }
}
