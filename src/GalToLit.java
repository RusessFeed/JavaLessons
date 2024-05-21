/*
Exercise 1.0:
A program for converting gallons into liters
 */

import java.util.Scanner;
public class GalToLit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double liters, gallons;

        System.out.print("Введите галлоны: ");
        gallons = scanner.nextDouble();
        System.out.println("Вы ввели " + gallons + " галлонов");

        liters = gallons * 3.7854;
        System.out.println(gallons + " галлонов соответсвует " + liters + " литрам");

        if (gallons <= 255) System.out.println("Лэээ братишка чо так мало заливаешь, ежжи?!");
        if (gallons != 256) System.out.println("Лээ брат остановись!!!");

    }
}