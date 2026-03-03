import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] B = new int[15]; // Массив
        int sum = 0;           // Оң элементтердің қосындысы

        System.out.println("15 бүтін сан енгізіңіз:");
        for(int i = 0; i < 15; i++) {
            B[i] = sc.nextInt();
        }

        for(int i = 0; i < 15; i++) {
            if(B[i] > 0) { // Егер элемент оң болса
                sum += B[i]; // Қосындыға қосу
            }
        }

        System.out.println("Оң элементтердің қосындысы: " + sum);
    }
}