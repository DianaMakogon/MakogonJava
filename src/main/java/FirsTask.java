import java.util.InputMismatchException;
import java.util.Scanner;

public class FirsTask {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите число:");
            try {
                int value = new Scanner(System.in).nextInt();
                if (value >= 7) {
                    System.out.println("Привет");
                } else {
                    System.out.println("Число меньше 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Введено не число");
            }
        }
    }
}
