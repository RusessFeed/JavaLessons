/*
    Exercise 1.2

 */

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, litters;
        int counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) {
            litters = gallons * 3.7854;
            System.out.println(gallons + " галлонов соответствует " + litters + " литрам");
            counter++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
