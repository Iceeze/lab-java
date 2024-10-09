import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        out.println("Вариант 2");
        while (true) {
            out.println("Список задач:");
            out.println("1. Сумма знаков");
            out.println("2. Есть ли позитив");
            out.println("3. Большая буква");
            out.println("4. Делитель");
            out.println("5. Многократный вызов");
            out.println("6. Безопасное деление");
            out.println("7. Строка сравнения");
            out.println("8. Тройная сумма");
            out.println("9. Возраст");
            out.println("10. Вывод дней недели");
            out.println("11. Числа наоборот");
            out.println("12. Степень числа");
            out.println("13. Одинаковость");
            out.println("14. Левый треугольник");
            out.println("15. Угадайка");
            out.println("16. Поиск последнего значения");
            out.println("17. Добавление в массив");
            out.println("18. Реверс");
            out.println("19. Объединение");
            out.println("20. Удалить негатив");
            out.print("Введите номер задания (или exit для выхода): ");
            String input = scanner.next();
            if (input.equals("exit")) {
                out.print("Завершение программы.");
                break;
            }

            switch (input) {
                case "1": {
                    // Задание 1.2
                    int x = getIntInput(scanner, "Введите целое число (минимум двухзначное): ");
                    int res2 = m.sumLastNums(x);
                    if (res2 != -1) out.printf("Результат: %d\n", res2);
                    break;
                }
                case "2": {
                    // Задание 1.4
                    int x = getIntInput(scanner, "Введите целое число: ");
                    boolean res4 = m.isPositive(x);
                    if (res4) out.printf("Число %d - положительное\n", x);
                    else out.printf("Число %d - не положительное\n", x);
                    break;
                }
                case "3": {
                    // Задание 1.6
                    while (true) {
                        out.print("Введите символ: ");
                        String s = scanner.next();
                        if (s.length() == 1) {
                            char c = s.charAt(0);
                            boolean res6 = m.isUpperCase(c);
                            if (res6) out.println("Это заглавная буква.");
                            else out.println("Данный символ - не заглавная буква в диапазоне от 'A' до 'Z'.");
                            break;
                        } else out.println("Ошибка! Некорректный ввод.");
                    }
                    break;
                }
                case "4": {
                    // Задание 1.8
                    int a = getIntInput(scanner, "Введите первое целое число: ");
                    int b = getIntInput(scanner, "Введите второе целое число: ");
                    boolean res8 = m.isDivisor(a, b);
                    if (res8) out.println("Числа делятся нацело.");
                    else out.println("Числа не делятся нацело.");
                    break;
                }
                case "5": {
                    // Задание 1.10
                    int a = getIntInput(scanner, "Введите 1-е целое число: ");
                    int b = getIntInput(scanner, "Введите 2-е целое число: ");
                    int res10 = m.lastNumSum(a, b);
                    out.printf("Результат: %d\n", res10);
                    break;
                }
                case "6": {
                    // Задание 2.2
                    int x = getIntInput(scanner, "Введите целое число x: ");
                    int y = getIntInput(scanner, "Введите целое число y: ");
                    double res2 = m.safeDiv(x, y);
                    if (res2 % 1 == 0) out.printf("Результат деления: %.0f\n", res2);
                    else out.printf("Результат деления: %f\n", res2);
                    break;
                }
                case "7": {
                    // Задание 2.4
                    int x = getIntInput(scanner, "Введите целое число x: ");
                    int y = getIntInput(scanner, "Введите целое число y: ");
                    String res4 = m.makeDecision(x, y);
                    out.printf("%d %s %d\n", x, res4, y);
                    break;
                }
                case "8": {
                    // Задание 2.6
                    int x = getIntInput(scanner, "Введите первое целое число: ");
                    int y = getIntInput(scanner, "Введите второе целое число: ");
                    int z = getIntInput(scanner, "Введите третье целое число: ");
                    boolean res6 = m.sum3(x, y, z);
                    out.printf("Результат выполнения условия: %b\n", res6);
                    break;
                }
                case "9": {
                    // Задание 2.8
                    int x = getIntInput(scanner, "Введите возраст: ");
                    String strAge = m.age(x);
                    out.printf("Возраст: %d %s\n", x, strAge);
                    break;
                }
                case "10": {
                    // Задание 2.10
                    out.print("Введите день недели: ");
                    String x = scanner.next();
                    m.printDays(x);
                    break;
                }
                case "11": {
                    // Задание 3.2
                    int x = getIntInput(scanner, "Введите целое число (не меньше 0): ");
                    String res2 = m.reverseListNums(x);
                    out.println(res2);
                    break;
                }
                case "12": {
                    // Задание 3.4
                    int x = getIntInput(scanner, "Введите целое число x: ");
                    int y = getIntInput(scanner, "Введите степень числа x: ");
                    int res4 = m.pow(x, y);
                    out.printf("Результат: %d\n", res4);
                    break;
                }
                case "13": {
                    // Задание 3.6
                    int x = getIntInput(scanner, "Введите целое число: ");
                    boolean res6 = m.equalNum(x);
                    if (res6) out.println("Цифры полученного числа - одинаковы");
                    else out.println("Цифры полученного числа - различны");
                    break;
                }
                case "14": {
                    // Задание 3.8
                    int x = getIntInput(scanner, "Введите целое число: ");
                    m.leftTriangle(x);
                    break;
                }
                case "15": {
                    // Задание 3.10
                    m.guessGame();
                    break;
                }
                case "16": {
                    // Задание 4.2
                    int[] arr = m.createArr();
                    int x = getIntInput(scanner, "Введите целое число - искомый элемент: ");
                    int res2 = m.findLast(arr, x);
                    if (res2 == -1) out.println("В массиве нет введенного элемента");
                    else out.printf("Последнее вхождение: %d\n", res2);
                    break;
                }
                case "17": {
                    // Задание 4.4
                    int[] arr = m.createArr();
                    int len = arr.length;
                    int x = getIntInput(scanner, "Введите целое число: ");
                    int pos = getIntInput(scanner, "Введите позицию для вставки нового числа: ");
                    if (pos > len || pos < 0) out.print("Ошибка! Такая позиция некорректна для вставки.");
                    else {
                        int[] newArr = m.add(arr, x, pos);
                        out.println("Итоговый массив: " + Arrays.toString(newArr));
                    }
                    break;
                }
                case "18": {
                    // Задание 4.6
                    int[] arr = m.createArr();
                    m.reverse(arr);
                    break;
                }
                case "19": {
                    // Задание 4.8
                    out.println("Заполнение первого массива");
                    int[] arr1 = m.createArr();
                    out.println("Заполнение второго массива");
                    int[] arr2 = m.createArr();
                    int[] newArr = m.concat(arr1, arr2);
                    out.println("Результат объединения массивов: " + Arrays.toString(newArr));
                    break;
                }
                case "20": {
                    // Задание 4.10
                    int[] arr = m.createArr();
                    int[] arrPositive = m.deleteNegative(arr);
                    out.println("Итоговый массив без отрицательных чисел: " + Arrays.toString(arrPositive));
                    break;
                }
                default:
                    out.println("Такого задания нет в списке.");
                    break;
            }
        }
    }

    // Проверка корректности ввода
    public static int getIntInput(Scanner scanner, String message) {
        int number;
        while (true) {
            out.print(message);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                out.println("Некорректный ввод. Необходимо ввести целое число.");
                scanner.nextLine();
            }
        }
        return number;
    }

    public int sumLastNums (int x) {
        if (x < 10) {
            out.print("Ошибка! число имеет меньше двух символов!\n");
            return -1;
        }
        int a = x % 10;
        int b = (x / 10) % 10;
        return a + b;
    }

    public boolean isPositive (int x) {
        return x > 0;
    }

    public boolean isUpperCase (char x) {
        String alf = "ABCDEFGHIJKLMNOPQRSTYVWXUZ";
        char[] arr = alf.toCharArray();
        for(char s : arr) {
            if (x == s) return true;
        }
        return false;
    }

    public boolean isDivisor (int a, int b) {
        if (a == b && a == 0) return false;
        if (a == 0 || b == 0) return true;
        return a % b == 0 || b % a == 0;
    }

    public int lastNumSum(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        int sum = (a % 10) + (b % 10);
        for (int i = 3; i < 6; i++) {
            b = sum;
            a = getIntInput(scanner, "Введите" + i + "-е целое число: ");
            sum = (a % 10) + (b % 10);
        }
        return sum;
    }

    public double safeDiv (int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    public String makeDecision (int x, int y) {
        if (x > y) return ">";
        if (x < y) return "<";
        return "==";
    }

    public boolean sum3 (int x, int y, int z) {
        return ((x + y == z) || (x + z == y) || (y + z == x));
    }

    public String age (int x) {
        if (x % 10 == 1 && x != 11) return "год";
        if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12 && x != 13 && x != 14)) return "года";
        return "лет";
    }

    public void printDays (String x) {
        switch (x) {
            case "понедельник": out.println("понедельник");
            case "вторник": out.println("вторник");
            case "среда": out.println("среда");
            case "четверг": out.println("четверг");
            case "пятица": out.println("пятица");
            case "суббота": out.println("суббота");
            case "воскресенье": out.println("воскресенье"); break;
            default: out.println("Это не день недели");
        }
    }

    public String reverseListNums (int x) {
        if (x < 0) return "полученное число - отрицательное";
        String output = "Результат:";
        for (int i = x; i >= 0; i--) {
            String num_str = Integer.toString(i);
            output = output + " " + num_str;
        }
        return output;
    }

    public int pow (int x, int y) {
        if (y < 0) return 0;
        if (y == 0) return 1;
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    public boolean equalNum (int x) {
        boolean flag = true;
        int num = x % 10;
        while (x != 0 && flag) {
            int ost = x % 10;
            flag = ost == num;
            x = x / 10;
        }
        return flag;
    }

    public void leftTriangle (int x) {
        String output = "*";
        for (int i = 1; i <= x; i++) {
            String iterPrint = output.repeat(i);
            out.println(iterPrint);
        }
    }

    public void guessGame() {
        Scanner scanner = new Scanner(System.in);

        int answer = (int)(Math.random() * 10);
        int guess = getIntInput(scanner, "Введите число от 0 до 9: ");
        while (answer != guess) {
            guess = getIntInput(scanner, "Вы не угадали, введите число от 0 до 9: ");
        }
        out.println("Вы угадали число! Поздравляю!");
    }

    // Вспомогательный метод
    public int[] createArr() {
        Scanner scanner = new Scanner(System.in);
        int len = getIntInput(scanner, "Введите целое число - количество элементов массива: ");
        while (len < 1) {
            out.println("Некорректный ввод. Количесвто элементов должно быть больше 0.");
            len = getIntInput(scanner, "Введите целое число - количество элементов массива: ");
        }
        int[] arr = new int[len];
        out.println("Введите элементы массива");
        for (int i = 0; i < len; i++) {
            int el = getIntInput(scanner, "Элемент: ");
            arr[i] = el;
        }
        return arr;
    }

    public int findLast (int[] arr, int x) {
        int i = 0;
        int result = -1;
        for (int num : arr) {
            if (x == num) result = i;
            i++;
        }
        return result;
    }

    public int[]add (int[] arr, int x, int pos) {
        int len = arr.length + 1;
        int[] newArr = new int[len];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos + 1; i < len; i++) {
            newArr[i] = arr[i-1];
        }
        return newArr;
    }

    public void reverse (int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            int el = arr[i];
            arr[i] = arr[len-(i+1)];
            arr[len-(i+1)] = el;
        }
        out.println("Реверсированный массив: " + Arrays.toString(arr));
    }

    public int[] concat (int[] arr1,int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < newArr.length; i++) {
            newArr[i] = arr2[i-arr1.length];
        }
        return newArr;
    }

    public int[] deleteNegative (int[] arr) {
        int cntPositive = 0;
        for (int el : arr) {
            if (el >= 0) cntPositive++;
        }
        int[] arrPositive = new int[cntPositive];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arrPositive[j] = arr[i];
                j++;
            }
        }
        return arrPositive;
    }
}