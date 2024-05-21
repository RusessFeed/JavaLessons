public class ThisWord {
    public static void main(String[] args) {
        Realisation pups = new Realisation();
        pups.setName("Rusya");
        pups.setAge(24);
        pups.bark();
    }
}


class Realisation {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void bark() {
        System.out.println(name + " " + age);
    }
}
