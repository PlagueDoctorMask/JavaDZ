// Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1001; i++) {
            boolean IsPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    IsPrime = false;
                }
            }
            if (IsPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
