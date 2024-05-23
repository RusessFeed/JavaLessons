public class TestikWhilik {
    public static void main(String[] args) {
        int counter = 0;
        int counterik = 0;

        exit:
        while (counter < 100) {
            System.out.println("Работа внешнего циклика " + counter);

            while (counterik < 10) {
                System.out.println("Работа внутреннего циклика " + counterik);

                if (counterik == 5) {
                    counterik = 0;
                    break exit;
                }
                counterik++;
            }
            counter++;
        }
        System.out.println("Работа цикликов завершена");
    }
}
