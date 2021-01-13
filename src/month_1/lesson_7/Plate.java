package month_1.lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    // проверка остатка еды в тарелке, может ли кот поесть или нет
    public boolean decreaseFood(int n) {
        // n - количество еды, необходимое для кота, чтобы насытиться. Если еды меньше, возвращается false
        if (food < n) return false;
        food -= n; // если еды хватает для кота, тогда из еды высчитывается n (кот поел)
        return true;
    }
    // метод для добалвение еды в тарелку с выводом сообщения в консоль
    public void addFood(int a) {
        food += a;
        System.out.println("В тарелку было добавлено: " + a + " еды");
    }

    public void info() {
        System.out.printf("В тарелке осталось %s еды%n", food);
    }
}
