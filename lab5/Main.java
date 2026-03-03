import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number <= 0) {
            System.out.print("Оң сан енгізіңіз: ");
            number = scanner.nextInt();
        }

        System.out.println("Рахмет! Сіз енгізген оң сан: " + number);
    }
}