package object1;

import org.w3c.dom.ls.LSOutput;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person2 = new Person("Jack", 32, 168);
        System.out.println(person2.height + "cm");

        Dog dog1 = new Dog("Floof", 3, "Terrier");
        System.out.println(dog1.getBreed());

        Car car1 = new Car("Honda", "Civic", 2006, 152107);
        System.out.println(car1.getMake());

        Chair chair1 = new Chair("Upholstery", "Red", 4);
        System.out.println(chair1.getLegs());
    }



}
