package month_1.lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        guessWord();
    }

    // № 1
    // запуск игры
    public static void gameGuess() throws IOException {
        BufferedReader reader;
        int userNum;
        guessNumber();
        // вопрос на повтор или завершение игры
        reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Повторить игру еще раз?\n 1 - \"да\" / 0 - \"нет\"");
            userNum = Integer.parseInt(reader.readLine());
            if (userNum == 1) {
                guessNumber();
            } else if (userNum == 0) {
                System.out.println("Спасибо за игру");
                break;
            } else {
                System.out.println("Введите коректное значение");
            }
        }
    }

    // логика игры
    public static void guessNumber() throws IOException {
        BufferedReader reader;
        int userNum;            // считывание числа с консоли
        int guessNum = (int) (Math.random() * 10);
        int attempts = 3;       // счетчик попыток
        System.out.println("=== Отгадайте число ===\nВведите число от 0 до 9:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Количество попыток: " + attempts);
            reader = new BufferedReader(new InputStreamReader(System.in));
            userNum = Integer.parseInt(reader.readLine());
            attempts--; // с каждым циклом высчитывается одна попытка
            // проверка совпадения числа, если да, то конец игры. Победа
            if (userNum == guessNum) {
                System.out.println("Вы угадали!\nЗагаданное число было: " + guessNum);
                break;
                // если кончились попытки
            } else if (attempts == 0) {
                System.out.println("Вы не отгадали загаданное число...\nЗагаданное число было: " + guessNum);
                break;
            } else if (userNum > guessNum) {
                System.out.println("Загаданное число меньше");
            } else if (userNum < guessNum) {
                System.out.println("Загаданное число больше");
            }
        }
        System.out.println("==========");
    }

    // № 2*
    public static void guessWord() throws IOException {
        BufferedReader reader;
        String writedWord;
        String[] words = {
                "apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"
        };
        int randomWord = (int) (Math.random() * words.length);
        String word = words[randomWord];
        int countLetters;
        System.out.println("Слово загадано, отгадайте его");
        reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            writedWord = reader.readLine();
            // проверка введенного слова
            if (writedWord.equals(word)) break;
                // проверка правильно отгаданных букв и их месторасположение
            else {
                // определение наиболее короткого слова (введенное от загаданного), для цикла проверки по буквам
                countLetters = Math.min(writedWord.length(), word.length());
                // проверка по буквам
                for (int j = 0; j < countLetters; j++) {
                    if (writedWord.charAt(j) == word.charAt(j)) System.out.print(word.charAt(j));
                    else System.out.print("#");
                }
                // заполнение до 15 символов, чтобы пользователь не мог узнать длину
                for (int i = 0; i < 15 - countLetters; i++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
        System.out.print("Вы отгодали слово: " + word);
    }
}
