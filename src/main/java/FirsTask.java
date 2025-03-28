import java.util.Scanner;

public class FirsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + diff);
        System.out.println("Умножение: " + mul);
        if (b != 0) {
            int div = a / b;
            System.out.println("Деление: " + div);
        } else {
            System.out.println("Деление: На ноль делить нельзя!");
        }
        scanner.close();
    }
}
