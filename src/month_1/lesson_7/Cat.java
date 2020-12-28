package month_1.lesson_7;

public class Cat {
        private String name;
        private int appetite;
        private boolean satiety = false;    // по условию задачи, у всех котов значение сытости = false

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    // геттер для проверки сытости кота
    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        if(!satiety) {  // если кот не сыт, тогда кот начинает есть
            if (p.decreaseFood(appetite)) { // метод .decreaseFood возвращается булево значение об наличии еды в тарелке
                satiety = true; // если еды для кота хватило и он поел, устанавливается значение сытости = true
                System.out.printf("%s поел %d еды и насытился%n", name, appetite);
            } else System.out.printf("В тарелке мало еды для %s. %s не насытился%n", name, name);
        }
    }
}
