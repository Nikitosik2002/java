import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner num = new Scanner(System.in);
        int scan = num.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= scan; i++) {
            sum += i;
            mult *= i;            
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", scan, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", scan, mult);
        num.close();
     }
}
