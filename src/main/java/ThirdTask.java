import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите длинну массива:");
            int value = new Scanner(System.in).nextInt();
            int[] numbers = new int[value];
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Введите " + (i+1) + " значние массива:");
                numbers[i] = new Scanner(System.in).nextInt();
            }
            System.out.println("Элементы массива кратные 3:");
            for (int print : numbers) {
                if (print % 3 == 0) {
                    System.out.println(print + " ");
                }
            }
        }
    }
}
