package month_1.lesson_5;

public class Person {
    String name;
    String position;
    String email;
    long phoneNumber;
    double salary;
    int age;

    public Person(String name, String position, String email, long phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // геттер для получения возраста сотрудника
    public int getAge() {
        return age;
    }

    // метод для вывода информации о сотруднике в консоль
    public void info() {
        System.out.printf("%nСотрудник: %s%nЗанимаемая должность: %s%nВозраст: %d%nЗаработная плата: %.3f руб%nНомер телефона: %d%nEmail: %s%n",
                name, position, age, salary, phoneNumber, email);
        System.out.println("__________________________________________________");
    }
}
