import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите имя:");
            String value = new Scanner(System.in).next();
            String name = "Вячеслав";
            System.out.println(value.equalsIgnoreCase(name) ? "Привет, Вячеслав" : "Нет такого имени");
        }
    }
}
