import java.util.Scanner;

public class SumTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            int a = 0;
            int b = 0;

            // Бірінші сан енгізу (қате тексерумен)
            while (true) {
                System.out.print("Бірінші санды енгізіңіз: ");
                if (scanner.hasNextInt()) {
                    a = scanner.nextInt();
                    break;
                } else {
                    System.out.println("❌ Қате! Бүтін сан енгізіңіз.");
                    scanner.next(); // қате мәнді өткізіп жіберу
                }
            }

            // Екінші сан енгізу (қате тексерумен)
            while (true) {
                System.out.print("Екінші санды енгізіңіз: ");
                if (scanner.hasNextInt()) {
                    b = scanner.nextInt();
                    break;
                } else {
                    System.out.println("❌ Қате! Бүтін сан енгізіңіз.");
                    scanner.next();
                }
            }

            // Нәтиже
            int sum = a + b;
            System.out.println("✅ Қосынды: " + sum);

            // buffer тазалау
            scanner.nextLine();

            // Қайталау сұрағы
            System.out.print("Жалғастыру? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Бағдарлама аяқталды.");
        scanner.close();
    }
}