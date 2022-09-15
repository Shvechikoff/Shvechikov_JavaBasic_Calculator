import java.util.Scanner;

//сообщение - ввод данных - сообщение - ввод данных - сообщение - результат - вывод
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNum = scanner.nextInt();
        int result = firstNum + secondNum;
        scanner.close();
        System.out.println("Результат: " + result);
    }
}