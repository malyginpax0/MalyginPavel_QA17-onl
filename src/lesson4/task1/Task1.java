/**
 * Ввести с клавы размер 2-ухмерного массива. Оба значения. Вычесть из суммы элементов 2 строки
 * сумму побочной диоганали… НО, если матрица не квадратная, то всместо диоганали – сумму 2
 * столбца. ГЫ
 * Вывести на экран изначальную матрицу. Значения заполнить рандомом, ограничив до
 * легчосчитаемого но не ниже значения 5
 * Вывести каждую сумму отдельно (с пояснение, что оно такое)
 * Вывести итоговый ответ.
 * Для звёздочки, если квадратная - вывести индекс и значение ее центра, если центр невыявляем,
 * сделать матрицу пригодной (удалить столбец справа и предпоследнюю строку) для этого и
 * вывести получившуюся. А если неквадратная – сделать ее размер равным наименшему значению
 * и найти центр.
 */

package lesson4.task1;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    static int[][] matrix;
    static int[][] newSquareMatrix;
    static int matrixLength;
    static int matrixHeight;
    static int maxRandomInt = 10;
    static int minRandomInt = 5;
    static int sumSecondRow;
    static int sumSecondDiagonal;
    static int sumSecondColumn;
    static boolean squareMatrix;

    public static void main(String[] args) {

        SetMatrixSize();
        FillRandomValuesMatrix(matrixHeight,matrixLength);
        PrintMatrix(matrix);

        if (squareMatrix == true){
            SecondRowSum(matrix);
            SecondDiagonalSum(matrix);
            System.out.println("Итоговая разница равна: " + (sumSecondRow - sumSecondDiagonal));
            FindMatrixCenter(matrix);
        } else {
            SecondRowSum(matrix);
            SecondColumnSum(matrix);
            System.out.println("Итоговая разница равна: " + (sumSecondRow - sumSecondColumn));
        }
        if (squareMatrix == true && )


    }

    public static void SetMatrixSize(){

        System.out.println("Введите размерность массива");
        System.out.println("Введите длину:");
        matrixLength = scanner.nextInt();
        System.out.println("Введите высоту:");
        matrixHeight = scanner.nextInt();

        matrix = new int[matrixHeight][matrixLength];

        if (matrixLength == matrixHeight){
            squareMatrix = true;
        } else {
            squareMatrix = false;
        }
    }

    public static int[][] FillRandomValuesMatrix(int height, int length){

        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                matrix[i][j] = getRandomInteger(maxRandomInt,minRandomInt);
            }
        }

        return matrix;
    }

    public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

    public static void PrintMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++){
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static int SecondRowSum(int[][] matrix){
        if (matrixHeight >= 2){
            for (int i = 0; i < matrix[0].length; i++) {
                sumSecondRow = sumSecondRow + matrix[1][i];
            }
        } else {
            sumSecondRow = 0;
            }
        System.out.println("Сумма элементов второй строки равна: " + sumSecondRow);
    return sumSecondRow;
    }

    public static int SecondDiagonalSum(int[][] matrix){
        int length = matrix.length - 1;
        for (int i = length; i >= 0 ; i--){
            sumSecondDiagonal = sumSecondDiagonal + matrix[i][length - i];
        }
        System.out.println("Сумма элементов побочной диагонали равна: " + sumSecondDiagonal);
        return sumSecondDiagonal;
    }

    public static int SecondColumnSum(int[][] matrix){
        if (matrixLength >= 2) {
            for (int i = 0; i < matrix.length; i++) {
                sumSecondColumn = sumSecondColumn + matrix[i][1];
            }
        } else {
            sumSecondColumn = 0;
        }
        System.out.println("Сумма элементов второго столбца равна: " + sumSecondColumn);
        return sumSecondColumn;
    }

    public static void FindMatrixCenter(int[][] matrix){
        if (matrix.length % 2 == 0) {
            System.out.println("Центр матрицы выявить нельзя.");
        } else {
            int centreIndex = (matrix.length / 2);
            int centreElement = centreIndex;
            System.out.println("Индекс центра матрицы: " + centreIndex);
            System.out.println("Центральный элемент: " + matrix[centreElement][centreElement]);
        }
    }

    public static int[][] ModifySquareMatrix(int[][] matrix){
        if (matrix.length % 2 == 0 && matrix.length >= 2) {
            System.out.println();
        }
    return matrix;
    }
    public static int[][] ModifyMatrixToSquare(int[][] matrix){
        return matrix;
    }
}
