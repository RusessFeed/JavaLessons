public class BreakLikeGoToDemo {
    public static void main(String[] args) {
        int counter = 0;

        adin:
        for ( ; ; ) {
            System.out.println("Работа внешнего цикла");

            for ( ; ; ) {
                System.out.println("Работа внутреннего цикла");
                counter++;
                if (counter == 10) {
                    break adin;
                }
            }
        }
        System.out.println("Мы прекратили работу обоих циклов");
    }
}