package month_1.lesson_6;

import month_1.lesson_6.animals.Cat;
import month_1.lesson_6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Frank");
        Dog dog2 = new Dog("Sting");
        Cat cat1 = new Cat("Matthew");
        Cat cat2 = new Cat("Tomas");

        dog1.run(487);
        dog2.run(684);
        cat1.run(187);
        cat2.run(221);

        dog1.swim(8);
        dog2.swim(12);
        cat1.swim(5);
    }
}
