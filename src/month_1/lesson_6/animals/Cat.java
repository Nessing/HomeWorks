package month_1.lesson_6.animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, 200, 0);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать%n", this.getName());
    }
}
