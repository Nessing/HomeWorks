package month_1.lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        start();
    }

    public static void start() throws IOException {
        char[][] field = createField();
        int moves = field.length * field[0].length - 1; // устанавливаем кол-во ходов
        drawField(field);

        while (true) {
            doPlayer(field);
            if(moves-- == 0) break; // высчитываем ход и после сравниваем с оставшимся
            if(checkWin(field, 'X')) {
                System.out.println("*** ПОБЕДА! ***");
                break;
            }

//            doAi(field); // Без ИИ
            botAi(field, 'X');
            if(checkWin(field, '0')) {
                System.out.println("*** Поражение... ***");
                break;
            }
            if(moves-- == 0) break; // высчитываем ход и после сравниваем с оставшимся

            separator();
            drawField(field);
            System.out.println("__________");
        }
        if(moves == -1) System.out.println("*** НИЧЬЯ ***");
        drawField(field);
        System.out.println("==============");
        System.out.println("Игра закончена");
    }

    // создаем поле
    public static char[][] createField() {
        return new char[][] {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
    }

    // Сепаратор
    public static void separator() {
        for (int i = 0; i < 4; i++) {
            System.out.println();
        }
    }

    // вывод таблицы в консоль
    public static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
    // действие игрока
    public static void doPlayer(char[][] field) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        do {
            x = chooseCoordinate(field, reader, 'X');
            y = chooseCoordinate(field, reader, 'Y');;
        } while (field[x][y] != '-');
        field[x][y] = 'X';
    }
    // действия компьютера
    public static void doAi(char[][] field) {
        int x, y;
        do {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        } while (field[x][y] != '-');
        field[x][y] = '0';
    }

    public static int chooseCoordinate(char[][] field, BufferedReader reader, char sym) throws IOException {
        int coord;
        do {
            System.out.printf("Введите '%s' от 1 до 3%n", sym);
            coord = Integer.parseInt(reader.readLine()) - 1;
        } while (coord < 0 || coord >= field.length);

        return coord;
    }

    // проверка на победу
    public static boolean checkWin(char[][] field, char sym) {
        int check = 0;

        // Diagonal = '\'
        for (int i = 0; i < field.length; i++) {
            if(field[i][i] == sym) check++;
        }
        if (check == field.length) {
            System.out.println("Диагональ \\");
            return true;
        }

        // Diagonal = '/'
        check = 0;
        for (int i = 0; i < field.length; i++) {
            if(field[i][field.length - i - 1] == sym) check++;
        }
        if (check == field.length) {
            System.out.println("Диагональ /");
            return true;
        }

        // Horizontal
        for (int i = 0; i < field.length; i++) {
            check = 0;  // устанавливаем значение '0'
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] == sym) check++; // считаем количество совпадений
            }
            if (check == field[i].length) {
                System.out.println("Горизонт");
                return true;    // если кол-во совпадений равна длине поля, тогда true
            }
        }

        // Vertical
        for (int i = 0; i < field.length; i++) {
            check = 0;  // устанавливаем значение '0'
            for (int j = 0; j < field[i].length; j++) {
                if(field[j][i] == sym) check++; // считаем количество совпадений
            }
            if (check == field.length) {
                System.out.println("Вертикаль");
                return true; // если кол-во совпадений равна высоте поля, тогда true
            }
        }
        return false;
    }

    public static void botAi(char[][] field, char sym) {
        int check = 0;
        boolean fill = false;

        // Diagonal = '\'
        for (int i = 0; i < field.length; i++) {
            if(field[i][i] == sym) check++;
        }
        if (check == field.length - 1) {
            for (int i = 0; i < field.length; i++) {
                if(field[i][i] == '-') {
                    field[i][i] = '0';
                    fill = true;
                    break;
                }
            }
            if(!fill) check = 0; // если поле не было заполнено, обнуляется счетчик

        } else check = 0; // если недостаточно количество совпадений для победы

        // Diagonal = '/'
        if(check == 0) {
            for (int i = 0; i < field.length; i++) {
                if (field[i][field.length - i - 1] == sym) check++;
            }
            if (check == field.length - 1) {
                for (int i = 0; i < field.length; i++) {
                    // ищем пустое поле и заполняем его
                    if (field[i][field.length - i - 1] == '-') {
                        field[i][field.length - i - 1] = '0';
                        fill = true;
                        break; // после заполнения поля выходим из цикла
                    }
                }
                if(!fill) check = 0; // если поле не было заполнено, обнуляется счетчик
            } else check = 0;
        }

        // Horizontal
        if(check == 0) {
            for (int i = 0; i < field.length; i++) {
                check = 0;  // устанавливаем значение '0'
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == sym) check++; // считаем количество совпадений в строке
                }
                if(check == field.length - 1) {
                    // ищем пустое поле и заполняем его
                    for (int j = 0; j < field[i].length; j++) {
                        if(field[i][j] == '-') {
                            field[i][j] = '0';
                            fill = true;
                            break; // после заполнения поля выходим из цикла
                        }
                    }
                }
                if(fill) break; // если поле заполнено, то выходим из общего цикла с сохраненным счетчиком
            }
            if(!fill) check = 0;
        }

        // Vertical
        if(check == 0) {
            for (int i = 0; i < field.length; i++) {
                check = 0;  // устанавливаем значение '0'
                for (int j = 0; j < field[i].length; j++) {
                    if (field[j][i] == sym) check++; // считаем количество совпадений в столбце
                }
                if(check == field.length - 1) {
                    // ищем пустое поле и заполняем его
                    for (int j = 0; j < field[i].length; j++) {
                        if(field[j][i] == '-') {
                            field[j][i] = '0';
                            fill = true;
                            break; // после заполнения поля выходим из цикла
                        }
                    }
                }
                if(fill) break; // если поле заполнено, то выходим из общего цикла с сохраненным счетчиком
            }
        }
        if(!fill) doAi(field);
    }
}
