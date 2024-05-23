public class Help2 {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Справка по:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while\n");
            System.out.println("Выберите вариант: ");
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice > '1' | choice > '5');

        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор");
                System.out.println("else оператор");
                break;
            case '2':
                System.out.println("Традиционный оператор switch: ");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа:");
                System.out.println("\t\tпоследовательность операторов");
                System.out.println("\t\tbreak;");
                System.out.println("\t\t//...");
                System.out.println("}");
                break;

            case '3':
                System.out.println("Цикл for:\n");
                System.out.println("for(инициализация; условия; итерация;)");
                System.out.println("\tоператор");
                break;

            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) оператор;");
                break;

            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do: {");
                System.out.println("\tоператор");
                System.out.println("} while(условие);");
                break;
        }
    }
}
