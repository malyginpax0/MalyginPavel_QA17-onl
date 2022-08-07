package lesson3.task1;

import java.util.Scanner;

/**
 * Создать программу, которая позволяет ввести с
 * клавиатуры массив размером n и отсортировать его по
 * убыванию. Т.е.:
 *
 * 1. Нужно считать с клавиатуры значение числа "n"(размер массива),
 * makeMassiveUsingKeybord();
 *
 * 2.1. Ввести значения, которые будут добавлены в массив (при размере массива, равном «n», необходимо ввести
 * элементы массива «n» раз).
 * Example: Выводит на экран строку типа: Enter element [номер элемента]: {Введенное с клавиатуры целое число}
 *
 * 2.2. Далее вывести массив, который мы создали, каждый элемент через запятую и пробел, используя метод
 * printMassive()}.
 * Example: 7, 23, 12, 0, 322
 *
 * 3. Отсортировать базовый массив по убыванию сортировкой Пузырька,
 * sortMassiveByBubbleWay()}.
 *
 * 4 Вывести отсортированный массив, используя метод
 * printSortedDescMassive()}.
 * Example: [322, 23, 12, 7, 0]
 */

public class Task1 {
    public static Scanner scanner;
    public static int arraySize;
    static int [] array;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        makeMassiveUsingKeybord();
        array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element " +i+ ": ");
            array[i] = scanner.nextInt();
        }

        printMassive();
        sortMassiveByBubbleWay();
        printSortedDescMassive();
    }
    public static void makeMassiveUsingKeybord(){
        System.out.print("Enter massive size: -> ");
        arraySize = scanner.nextInt();
    }
    public static void printMassive(){
        System.out.println("Your base massive is:");
        for (int i = 0; i < arraySize -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[arraySize-1]);
    }
    public static void sortMassiveByBubbleWay(){
        for (int i = 0; i < arraySize; i++) {
            for (int j = arraySize - 1; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }
    public static void printSortedDescMassive(){
        System.out.println("Sorted massive DESC:");
        System.out.print("[");
        for (int i = 0; i < arraySize -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[arraySize-1] + "]");
    }
}
