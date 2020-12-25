package month_1.lesson_6.animals;

public abstract class Animal {
    private String name;
    private int maxDistance;
    private int maxSwim;

    public Animal(String name, int maxDistance, int maxSwim) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxSwim = maxSwim;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if(distance > maxDistance) System.out.printf("%s не может пробежать %d м%n", name, distance);
        else System.out.printf("%s пробежал %d м%n", name, distance);
    }

    public void swim(int distance) {
        if(distance > maxSwim) System.out.printf("%s не может пробежать %d м%n", name, distance);
        else System.out.printf("%s пробежал %d м%n", name, distance);
    }
}
