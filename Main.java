import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Задание 1.1: ");
        System.out.println(main.fraction(5.25));
        System.out.println(main.fraction(2.75));

        System.out.println("Задание 1.3: ");
        System.out.println(main.charToNum('0'));
        System.out.println(main.charToNum('5'));
        System.out.println(main.charToNum('6'));

        System.out.println("Задание 1.5: ");
        System.out.println(main.is2Digits(32));
        System.out.println(main.is2Digits(516));
        System.out.println(main.is2Digits(-20));

        System.out.println("Задание 1.7: ");
        System.out.println(main.isInRange(5, 1, 3));
        System.out.println(main.isInRange(2, 15, 33));

        System.out.println("Задание 1.9: ");
        System.out.println(main.isEqual(3, 3, 3));
        System.out.println(main.isEqual(2, 15, 2));

        System.out.println("Задание 2.1: ");
        System.out.println(main.abs(5));
        System.out.println(main.abs(-3));

        System.out.println("Задание 2.3: ");
        System.out.println(main.is35(5));
        System.out.println(main.is35(8));
        System.out.println(main.is35(15));
        System.out.println(main.is35(9));

        System.out.println("Задание 2.5: ");
        System.out.println(main.max3(5, 7, 7));
        System.out.println(main.max3(8, -1, 4));
        System.out.println(main.max3(1, 2, 3));

        System.out.println("Задание 2.7: ");
        System.out.println(main.sum2(5, 7));
        System.out.println(main.sum2(8, -1));
        System.out.println(main.sum2(15, 10));

        System.out.println("Задание 2.9: ");
        System.out.println(main.day(1));
        System.out.println(main.day(4));
        System.out.println(main.day(15));

        System.out.println("Задание 3.1: ");
        System.out.println(main.listNums(6));
        System.out.println(main.listNums(7));

        System.out.println("Задание 3.3: ");
        System.out.println(main.chet(8));
        System.out.println(main.chet(11));

        System.out.println("Задание 3.5: ");
        System.out.println(main.numLen(1256712));
        System.out.println(main.numLen(235461782));

        System.out.println("Задание 3.7: ");
        main.square(2);
        main.square(3);

        System.out.println("Задание 3.9: ");
        main.rightTriangle(2);
        main.rightTriangle(3);

        System.out.println("Задание 4.1: ");
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println("      Массив чисел: " + Arrays.toString(arr));
        int x = 5;
        System.out.println(main.findFirst(arr, x));

        System.out.println("Задание 4.3: ");
        int[] arr2 = {1, -2, -7, 4, 2, -10, 5};
        System.out.println("      Массив чисел: " + Arrays.toString(arr2));
        System.out.println(main.maxAbs(arr2));


        System.out.println("Задание 4.5: ");
        int[] arr6 = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;
        int[] result = main.add(arr6, ins, pos);
        if (result != null) {
            System.out.print("  Ответ: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Задание 4.7: ");
        int[] arr7 = {1, 2, 3, 4, 5};
        int[] reversedArr = main.reverseBack(arr7);
        System.out.print("  Ответ: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Задание 4.9: ");
        int[] arr5 = {1, 2, 3, 8, 2, 2, 9};
        int xx = 2;
        int[] result4 = main.findAll(arr5, xx);
        for (int index : result4) {
            System.out.print(index + " ");
        }

    }
    public double fraction(double x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        return x - (int)x;
    }
    public int charToNum(char x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        return x - '0';
    }
    public boolean is2Digits(int x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    public boolean isInRange(int a, int b, int num) {
        System.out.print("  Входные данные: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
        System.out.print("  Ответ: ");
        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        return num >= min && num <= max;
    }
    public boolean isEqual(int a, int b, int c) {
        System.out.print("      Входные данные: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.println(c);
        System.out.print("      Ответ: ");
        return (a == b) && (b == c);
    }


    public int abs(int x) {
        System.out.print("      Входные данные: ");
        System.out.println(x);
        System.out.print("      Ответ: ");
        if (x < 0) {
            return -x;
        }
        return x;
    }
    public boolean is35(int x) {
        System.out.print("      Входные данные: ");
        System.out.println(x);
        System.out.print("      Ответ: ");
        boolean del3 = (x % 3 == 0);
        boolean del5 = (x % 5 == 0);
        return (del3 || del5) && !(del3 && del5);
    }
    public int max3(int x, int y, int z) {
        System.out.print("      Входные данные: ");
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");
        System.out.println(z);
        System.out.print("      Ответ: ");
        int maxXY;
        if (x > y) {
            maxXY = x;
        } else {
            maxXY = y;
        }
        if (maxXY > z) {
            return maxXY;
        } else {
            return z;
        }
    }
    public int sum2(int x, int y) {
        System.out.print("      Входные данные: ");
        System.out.print(x);
        System.out.print(" ");
        System.out.println(y);
        System.out.print("      Ответ: ");
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }
    public String day(int x) {
        System.out.print("      Входные данные: ");
        System.out.println(x);
        System.out.print("      Ответ: ");
        return switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
    }

    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        System.out.print("      Входные данные: ");
        System.out.println(x);
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        System.out.print("      Ответ: ");
        return result.toString();
    }
    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        System.out.print("      Входные данные: ");
        System.out.println(x);
        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        System.out.print("      Ответ: ");
        return result.toString();
    }
    public int numLen(long x) {
        int count = 0;
        System.out.print("      Входные данные: ");
        System.out.println(x);
        if (x == 0) {
            return 1;
        }
        if (x < 0) {
            x = -x;
        }

        while (x > 0) {
            x /= 10;
            count++;
        }
        System.out.print("      Ответ: ");
        return count;
    }
    public void square(int x) {
        System.out.print("      Входные данные: ");
        System.out.println(x);
        System.out.print("      Ответ ↓: ");
        System.out.println();
        for (int i = 0; i < x; i++) {
            System.out.print("          ");
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rightTriangle(int x) {
        System.out.print("      Входные данные: ");
        System.out.println(x);
        System.out.print("      Ответ ↓: ");
        System.out.println();
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            System.out.print("          ");
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {
        System.out.print("      Входные данные: ");
        System.out.println(x);
        System.out.print("      Ответ: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        System.out.print("      Ответ: ");
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }
    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            return null;
        }
        int[] newArray = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, newArray, 0, pos);
        System.arraycopy(ins, 0, newArray, pos, ins.length);
        System.arraycopy(arr, pos, newArray, pos + ins.length, arr.length - pos);

        return newArray;
    }
    public int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }
    public int[] findAll(int[] arr, int x) {
        System.out.print("      Ответ: ");
        // Сначала подсчитаем количество вхождений числа x
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        // Создаем массив для хранения индексов
        int[] indices = new int[count];
        int index = 0;
        // Заполняем массив индексами
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index++] = i;
            }
        }

        return indices;
    }



}




