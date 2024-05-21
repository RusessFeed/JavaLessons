public class Guess4 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'k';

        do {
            System.out.println("Задуманная буква между A и Z");
            System.out.println("Попробуйте её угадать: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) {
                System.out.println("Правильно");
            } else {
                System.out.println("Увы и ах, задуманная буква находится");
                if (ch > answer) {
                    System.out.println(" дальше по алфавиту");
                } else {
                    System.out.println(" ближе по алфавиту");
                }
                System.out.println("Повторите попытку!");
            }
        } while (answer != ch);
    }
}
