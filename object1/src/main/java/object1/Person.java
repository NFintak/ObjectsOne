package object1;

public class Person {
    String name;
    int age = 0;
    int height = 0;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30, 153);
    }
}