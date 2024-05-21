public class Constructors {
    public static void main(String[] args) {
        Human human = new Human("Rusya", 24);
        Human human2 = new Human("Chai", 25);
        Human.description = "Pepe";
        Human.getAllFields();
    }
}

class Human {
    private String name;
    private int age;

    public static String description;

    public Human() {
        this.name = "Имя по умолчанию";
        this.age = 18;
        System.out.println(name + "\n" + age + " - Возраст по умолчанию");
    }

    public Human(String name) {
        this.name = name;
        System.out.println("Ввели только один параметр - строку");
    }

    public Human(int age) {
        this.age = age;
        System.out.println("Ввели только один параметр - целочисленное число");
    }

    public Human(String name, int age) {
        System.out.println("Ввели оба параметра, привет из нужного конструктора!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void getAllFields() {
      //  System.out.println(name + " " + age );
    }
}