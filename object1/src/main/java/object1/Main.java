package object1;

import org.w3c.dom.ls.LSOutput;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person person2 = new Person("Jack", 32, 168);
        System.out.println(person2.height + "cm");
    }



}
