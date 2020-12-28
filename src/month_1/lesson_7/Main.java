package month_1.lesson_7;

public class Main {
    public static void main(String[] args) {
        // создание массив котов
        Cat[] cats = new Cat[] {
                new Cat("Tomas", 20),
                new Cat("Frank", 10),
                new Cat("Stevy", 15),
                new Cat("Liza", 10),
                new Cat("Harpia", 20),
                new Cat("Jerry", 15),
                new Cat("Mike", 20),
                new Cat("Bart", 20)
        };
        // создание тарелки с установленной едой 100
        Plate plate = new Plate(100);
        // вывод сообщения в консоль о количестве еды в тарелке
        plate.info();
        /*
        Питание котов. В данном цикле происходит проход по всему массиву котов
        и вызывается у каждого кота метод .isSatiety, что означанет сытость кота.
        Если кот не насытился, вызывается метод .eat и кот начинает есть.
        После выводиться сообщение об остатке еды в тарелке.
         */
        for (int i = 0; i < cats.length; i++) {
            if(!cats[i].isSatiety()) {
                cats[i].eat(plate);
                plate.info();
                System.out.println();
            }
        }
        // метод добавления еды
        plate.addFood(50);
        // дополнительный цикл для питания котов, оставшихся голодными.
        for (int i = 0; i < cats.length; i++) {
            if(!cats[i].isSatiety()) {
                cats[i].eat(plate);
                plate.info();
                System.out.println();
            }
        }
    }
}
