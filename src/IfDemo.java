/*
Demonstration of using operator "if"
 */


public class IfDemo {
    public static void main(String[] args) {
        int a,b,c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("значение a меньше чем b");

        System.out.println();

        c = a - b;
        System.out.println("Переменная c содержит: " + c);
        if (c >= 0) System.out.println("Значение не отрицательное");
        if (c < 0) System.out.println("Значение отрицательное");

        System.out.println();

        c = b - a;
        System.out.println("Переменная содержит: " + c);
        if (c >= 0) System.out.println("Значение не отрицательное");
        if (c < 0) System.out.println("Значение отрицательное");
    }
}
