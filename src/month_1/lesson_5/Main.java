package month_1.lesson_5;

public class Main {
    public static void main(String[] args) {
        // создание массива объектов класса Person
        Person[] persArray = new Person[5];
        // добавление в массив persArray, новых созданных объектов класса Person
        persArray[0] = new Person("Матвеев Сергей Витальевич", "Начальник караула", "karaul4@mail.ru", 89117483221L, 45.342D, 25);
        persArray[1] = new Person("Васильев Валентин Сергеевич", "Помощник начальника караула", "vasil1979@rambler.ru", 89009924288L, 36.696D, 44);
        persArray[2] = new Person("Петров Андрей Михайлович", "Командир отделения", "drago21221@mail.ru", 89117761945L, 32.028D, 41);
        persArray[3] = new Person("Егоров Сергей Алексеевич", "Старший пожарный", "hiter9989@mail.ru", 89214472132L, 27.644D, 32);
        persArray[4] = new Person("Соловьев Владимир Андреевич", "Пожарный", "bear555@mail.ru", 89009927217L, 24.209D, 27);

        // вывод дополнительного сообщение в консоль
        System.out.println("\n==================================================\n" +
                "============ Сотрудники старше 40 лет ============\n" +
                "==================================================");
        
        // поиск по массиву persArray сотрудников, чей возраст больше 40 лет
        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() > 40) persArray[i].info();
        }
    }
}
