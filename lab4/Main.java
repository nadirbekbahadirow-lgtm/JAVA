class Student {
    String name;
    int age;

    // Әдепкі (default) конструктор
    Student() {
        name = "Белгісіз";
        age = 0;
        System.out.println("Әдепкі конструктор шақырылды");
    }

    // Параметрлі конструктор
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Параметрлі конструктор шақырылды");
    }

    void showInfo() {
        System.out.println("Аты: " + name + ", Жасы: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Әдепкі конструктормен объект құру
        Student s1 = new Student();
        s1.showInfo();

        System.out.println("-------------");

        // Параметрлі конструктормен объект құру
        Student s2 = new Student("Nadyrbek", 21);
        s2.showInfo();
    }
}