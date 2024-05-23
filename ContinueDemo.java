public class ContinueDemo {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 10) {
            System.out.println("Выполнение начала цикла");

            counter++;
            if (counter % 2 == 0) {
                System.out.println("Число в каунтере " + counter + " является четным числом!");
                continue;
            }

            System.out.println("Выполнение конца цикла");
        }
    }
}
