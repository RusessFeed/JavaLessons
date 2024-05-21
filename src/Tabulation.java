public class Tabulation {
    public static void main(String[] args) {
        System.out.println("Первая строка\nВторая строка");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        String symbol = "k";
        char symbol2 = 'k';

        System.out.println("Char: " + symbol2 + "\nString: " + symbol + "\n" + greeting("pipa", "qweqw"));

        int x = 5;

        if (x == 5) {
            int y = x * 2;
            System.out.println("y равен: " + y);
        }
    }

    static String greeting(String name, String faith) {
        if (faith == "muslim") {
            return "Assalamu Aleikum, " + name;
        } else if (faith == "christian") {
            return  "Ну здарова " + name;
        } else {
            return "Привет " + name;
        }
    }
}
