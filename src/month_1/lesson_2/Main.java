package month_1.lesson_2;

public class Main {
    public static void main(String[] args) {

    }

    //    № 1
    public static void replaceElement() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        }
    }

    //    № 2
    public static void fillArray() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
    }

    //    № 3
    public static void lessSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
    }

    //    № 4
    public static void squareArray() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }

    //    № 5 **
    public static void maxAndMinElement() {
        int[] array = {5, 9, 152, 189, 3, 19, 22};
        int max = Integer.MIN_VALUE;    //Вывод: максимальный элемент массива "189"
        int min = Integer.MAX_VALUE;    //Вывод: минимальный элемент массива "3"
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
    }

    //    № 6 **
    public static boolean checkBalance(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = 0;

            // левая часть
            for (int j = 0; j <= i; j++) {
                left += array[j];
            }
            // правая часть
            for (int k = i + 1; k < array.length; k++) {
                right += array[k];
            }
            // сравнение двух частей
            if (left == right) return true;
        }
        return false;
    }

    //    № 7 ****
    public static void biasOfArray(int[] array, int n) {
        int num; // количество сдвигов
        // определение сдвига
        // если вправо
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                num = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = num;
            }
        }
        // если влево
        else if (n < 0) {
            for (int i = n; i < 0; i++) {
                num = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = num;
            }
        }
    }
}
