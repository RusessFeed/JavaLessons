public class GameGuess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'k';

        System.out.println("Задумана буква от A и Z\nПопробуйте ее угадать!");

        ch = (char) System.in.read();
        if (ch == answer) System.out.println("** Правильно! **");
        else System.out.println("** Пораженька! **");
        {
            if (ch < answer) System.out.println("Дальше по алфавиту");
            // захардкодил немножко
            else if (ch != 'k') System.out.println("Ближе по алфавиту");
        }
    }
}
