import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputAndCalc();
           }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message + " " + massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int array[]) {
        boolean change = false;
        for (int i = 0; i < array.length - 1; i++) {
            //пройти по массиву от начала, проверяя попарно каждый элемент со следующим
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {//поменять местами
                    change = true;
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
            if (change == false) {
                break;
            }
        }
    }


    public static void calcBoats(int n, int boatsCapacity, int[] array) {
        int counter = 0;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (array[i] + array[j] <= boatsCapacity) {
                i = i++;
                j--;
            }
            i++;
            counter++;
        }
        System.out.println("Кол-во необходимых байдарок = " + counter);
    }

    public static void inputAndCalc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей и грузоподъемность байдарки:");
        int n = scanner.nextInt();
        int boatsCapacity = scanner.nextInt();
        System.out.println("Вводите вес каждого из " + n + " людей");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        bubbleSort(array);
        calcBoats(n, boatsCapacity, array);
    }

}