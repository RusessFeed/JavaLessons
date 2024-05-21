public class Increments {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x;
        System.out.println(y);
        System.out.println(x);

        x = 10;
        y = x++;
        System.out.println(y);
        System.out.println(x);
    }
}
