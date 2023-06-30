//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task1 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < n; i++) {
            sum+= i;
        }
        System.out.println(sum);
        for (int i = 1; i < n; i++) {
            mult*=i;
        }
        System.out.println(mult);
    }
}
