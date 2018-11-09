import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionDanger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //     getUserInput(scanner,1,5);
//        RecursionDanger.getUserInput(1,5)
        createArray2(scanner);
    }

    public static int[] createArrey(Scanner sc) {
        System.out.printf("Введите длину");
        int length = sc.nextInt();
        int[] array = new int[length];
        if (length == 0 || length > 10) {
            System.out.println("длинна масива должна быть от 0 до 10");
            array = createArrey(sc);
        }
        System.out.println("Последний эллемент масива=" + array[length - 1]);
        return array;
    }

    public static int getUserInput(Scanner sc, int min, int max) {
        System.out.println("Ведите число от " + min + "до" + max);
        int result;
        try {
            result = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            return getUserInput(sc, min, max);

        }
        if (result < min || result > max) {
            System.out.printf("Вы ввели число не от %d до %\n", min, max);
            return getUserInput(sc, min, max);
        }
        return result;
    }

    private static int[] createArray2(Scanner sc) {
        System.out.println("Введитье длинну");
        int length = sc.nextInt();
        int[] array = new int[length];
        if (length == 0 || length > 10) {
            System.out.println("Длинна масчсива должна быть от 0 до 10");
            array = createArray2(sc);
        }
        System.out.println("Последний элемент массива = " + array[length - 1]);
        return array;
    }
}
