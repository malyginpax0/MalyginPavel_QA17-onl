package lesson2.task1;

/**
 Задание 1
 В спортивном центре есть три возрастные группы для занятий волейболом:
 1 группа - от 7 до 13 лет;
 2 группа - от 14 до 17 лет;
 3 группа - от 18 до 65 лет.
 Напишите метод, который принимает возраст человека и возвращает целое число,
 которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните ‘-1’.
 */

import java.util.Scanner;

public class Task1 {
    static int personAge;
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome, enter your age, please");
        personAge = in.nextInt();

        if ((personAge >= 7) & (personAge <= 13))  {
            System.out.println("Your training group will be... Number 1");
        } else  if ((personAge >= 14) & (personAge <= 17)) {
            System.out.println("Your training group will be... Number 2");
        } else  if ((personAge >= 18) & (personAge <= 65)) {
            System.out.println("Your training group will be... Number 3");
        } else {
            System.out.println("Sorry, -1");
        }
    }

}
