package month_1.lesson_1;

public class Main {
	// № 1  Создать пустой проект в IntelliJ IDEA и прописать метод main()
    public static void main(String[] args) {
    	// № 2 Создать переменные всех пройденных типов данных и инициализировать их значения
	    byte b = 127;
	    short s = 32584;
	    int i = 564;
	    long l = 325215221;
	    float f = 32.85f;
	    double d = 75.23;
	    char c = 'g'; // or 103
		boolean bool = true; // or false
    }

    // № 3  Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //      где a, b, c, d – аргументы этого метода, имеющие тип float.
	public static float expressionFloat(float a, float b, float c, float d) {
		return a * (b + (c / d));
	}

	// № 4  Написать метод, принимающий на вход два целых числа и проверяющий,
    //      что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    //      в противном случае – false.
	public static boolean expressionRange(int a, int b) {
    	int i = a + b;
		return i >= 10 && i <= 20;
	}

    // № 5  Написать метод, которому в качестве параметра передается целое число,
    //      метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //      Замечание: ноль считаем положительным числом
	public static void positiveOrNegative(int a) {
        if(a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    // № 6  Написать метод, которому в качестве параметра передается целое число.
    //      Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
    public static boolean expressionBoolean(int a) {
        return a < 0;
    }

    // № 7  Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //      Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void writeName(String name) {
        System.out.println("Привет " + name + "!");
    }

    // № 8* Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    //      Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static void leapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) System.out.println("Високосный");
        else System.out.println("Невисокосный");
    }
}
