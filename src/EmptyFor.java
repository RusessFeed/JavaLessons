public class EmptyFor {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; ) {
            System.out.println("Проход №: " + i);
            i++;
        }
    }
}
